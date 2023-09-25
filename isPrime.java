import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = -1;
        while (num < 1) {
            System.out.println("Enter a natural number: ");
            num = sc.nextInt();
        }

        try {
            boolean isPrime = isPrime(num);
            if (isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Composite");
            }
        } catch (IntegerException ex) {
            System.out.println(ex.getMessage());
        }
    }
	
    public static boolean isPrime(int num) throws IntegerException {
        if (num == 1) {
            throw new IntegerException("Neither prime nor composite");
	}
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
	
    public static class IntegerException extends Exception {
        public IntegerException(String message) {
            super(message);
        }
    }
}
