package Recursion;

public class TillingProb {
    public static int Tilling(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        // kaam
        // vertical choice
        int fnm1 = Tilling(n - 1);
        //horizontal choice
        int fnm2 = Tilling(n - 2);

        int totways = fnm1 + fnm2;
        return totways;

    }

    public static void main(String[] args) {
        System.out.println(Tilling(3));
    }
}


