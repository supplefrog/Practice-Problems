import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter r: ");
        int r = sc.nextInt();
        System.out.println("Binomial Coefficient = " + binCoeff(n, r));
    }
    
    public static int binCoeff(int n, int r) {
        int binCoeff = factorial(n) / (factorial(r) * factorial(n - r));
        return(binCoeff);
    }
    
    public static int factorial(int n) {
        if (n > 1) {
            for (int n_minus = n - 1; n_minus > 1; n_minus--) {
                n = n * n_minus;
            }
        } else if (n < -1) {
            for (int n_plus = n + 1; n_plus <= -1; n_plus++) {
                n = n * n_plus;
            }
        } else {
            return(1);
        }
        return(n);
    }
}
