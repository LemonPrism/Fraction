import java.util.Scanner;

public class FractionQuiz
 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int wins = 0;
        int losses = 0;

        System.out.println("Let the Fraction Quiz Begin. Answers should be in lowest terms. Good luck!");
        System.out.println();

        for (int i = 1; i <= 5; i++) {

            Fraction f1 = new Fraction();
            Fraction f2 = new Fraction();

            int op = (int)(Math.random() * 4);
            String symbol = "";
            Fraction answer = null;

            if (op == 0) {
                symbol = "+";
                answer = Fraction.add(f1, f2);
            }

            if (op == 1) {
                symbol = "-";
                answer = Fraction.subtract(f1, f2);
            }

            if (op == 2) {
                symbol = "*";
                answer = Fraction.multiply(f1, f2);
            }

            if (op == 3) {
                symbol = "/";
                answer = Fraction.divide(f1, f2);

                while (answer == null) {
                    f2 = new Fraction();
                    answer = Fraction.divide(f1, f2);
                }
            }

            System.out.print("Question " + i + ": ");
            System.out.print(f1 + " " + symbol + " " + f2 + " = ");
            String I = input.nextLine();

            Fraction A = new Fraction(I);

            A.reduce();
            answer.reduce();

            if (A.equals(answer)) {
                wins++;
                System.out.println("Correct!");
            } else {
                losses++;
                System.out.println("Wrong, the answer was " + answer);
            }

            System.out.println();
        }

        Fraction ratio;
        if (losses == 0) {
            ratio = new Fraction(wins, 1);
        } else {
            ratio = new Fraction(wins, losses);
            ratio.reduce();
        }

        int percent = (int)Math.round((wins * 100.0) / 5);

        System.out.println("Your win/loss ratio was " + ratio + ", for a score of " + percent + " percent!");

        input.close();
    }
}
