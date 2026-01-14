public class EstimatePi {
    public static void main(String[] args) {
        Fraction MILU = new Fraction(355, 113);
        final double EPSILON = Math.abs(Math.PI - MILU.toDouble());

        int N = 0;
        int D = 1;

        
        for (int d = 1; ; d++) {
            int n0 = (int) Math.round(Math.PI * d);

            
            for (int n = n0 - 1; n <= n0 + 1; n++) {
                if (n <= 0){
                  continue;   
                }

                Fraction f = new Fraction(n, d);
                f.reduce(); 

                double diff = Math.abs(Math.PI - f.toDouble());
                if (diff < EPSILON) {
                    N = f.getNum();
                    D = f.getDenom();
                    System.out.println("MILU = " + MILU);
                    System.out.println("Answer = " + N + "/" + D );
                    return;
                }
            }
        }
    }
}
