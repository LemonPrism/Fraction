import java.util.Scanner;

public class FractionQuiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int correct = 0;
        int wrong = 0;
        
        
        int count= 0 ; 
        
        System.out.println("Let the Fraction Quiz Begin. Answers should be in lowest terms. Good luck!\n");

        while (count < 5) {
            int n = (int)(Math.random()+10 );
            int d = (int) (Math.random()+5); 
            
            Fraction f = new Fraction(n, d);
            System.out.println(f);

            count++; 
        }
    }
    
    public boolean equals ( Fraction f) {
        
        return false; 
    }
}



        