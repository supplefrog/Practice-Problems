import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        reverse(num);
    }

    public static void reverse(int num) {
	for (; num > 0; num /= 10) {
	    int rem = num % 10;
            System.out.print(rem);
	}
    }	    
}
