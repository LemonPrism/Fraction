
public class FractionDriver {
    public static void main(String []args){
        Fraction a = new Fraction(); 
        Fraction b = new Fraction(4,2); 
        Fraction c = new Fraction("6/0");
        Fraction d = new Fraction(c);

        Fraction f = new Fraction(-6, 9);
        f.reduce();
        System.out.println("f reduced (Expected -2/3): " + f);

        System.out.println("a: " +a); 
        System.out.println("b: " +b); 
        System.out.println("c: " +c); 
        System.out.println("d: " +d); 

        System.out.println("b as a decimal: "  + b.toDouble()); 
        System.out.println("N's numerator is: " +b); 

        
        
    }

    
    
}
