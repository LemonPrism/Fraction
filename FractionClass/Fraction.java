
public class Fraction
{

    //instance variables 
    private int numerator; 
    private int denominator; 

    //constructor(s)
    public Fraction (){
        this.numerator = 0 ; 
        this.denominator = 1; 

    }

    public  Fraction ( int n , int d){

        this.setNum(n);
        this.setDenom(d); 

    }

    public Fraction ( String f){
        String[] numbers = f.split("/"); 
        int n = Integer.parseInt(numbers[0]);
        int d = Integer.parseInt(numbers[1]); 

        this.setNum(n);
        this.setDenom(d); 

    }

    public Fraction( Fraction f) {
        this.numerator = f.numerator; 
        this.denominator = f.denominator; 

    }

    //behaviour method(s)

    //accessor methods
    // non static methods that lets us access data from a class 

    public String toString(){
        return numerator + "/" + denominator;
    }

    public int getNum(){
        return numerator;  
    }

    public int getDenom(){
        return denominator;  
    }

    public double toDouble(){
        return (double) numerator / denominator;

    }

    //mutator methods 
    // methods that lets you change your methods 

    public void setNum(int n){
        numerator = n ; 
    }

    public void setDenom(int d){
        this.denominator = d; 
        if (d != 0){
            this.denominator = d ; 
        }else {
            this.denominator = 1; 
            System.out.println("Error: Denominator can't be zero!");

        }
    }

    //class methods 
    //Ex. math methods , Wrapper classes
    //we call Math.sqrt and it isnt' being called from an object

    public static Fraction multiply ( Fraction a , Fraction b ){
        int newNum = a.numerator * b.numerator; 
        int newDen = a.denominator * b.denominator; 
        Fraction c =  new Fraction(newNum,newDen);
        return c; 

    }

    public static Fraction divide ( Fraction a , Fraction b ){
        if ( b.numerator == 0 ){
            System.out.println( "Shame on you for diving by zero kiddo lol");
            return null; 
        }

        int newNum = a.numerator * b.denominator; 
        int newDen = a.denominator * b.numerator; 
        Fraction c =  new Fraction(newNum,newDen);
        return c; 

    }

    public static Fraction add ( Fraction a , Fraction b ){
        int newDen = a.denominator * b.numerator; 
        int newNum = a.numerator *b.denominator + b.numerator * a.denominator; 
        Fraction c =  new Fraction(newNum,newDen);
        return c; 

    }

    public static Fraction subtract ( Fraction a , Fraction b ){
        int newDen = a.denominator * b.numerator; 
        int newNum = a.numerator *b.denominator - b.numerator * a.denominator; 
        Fraction c =  new Fraction(newNum,newDen);
        return c; 

    }

    public void reduce (){

        int gcf =  GCF(numerator,denominator);
        numerator = numerator/ gcf; 
        denominator = denominator/gcf;

    }

    private int GCF(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0){
            return b;
        }
        if (b == 0){
            return a;   
        }

        while (a != b) {
            if (a > b){ 
                a -= b;
            }else {
                b -= a;  
            }
        }
        return a;
    }

}