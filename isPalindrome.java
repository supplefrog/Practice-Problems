import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        isPalindrome(num);
    }
    
    public static void isPalindrome(int num) {
        if (num == reverse(num)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
    
    public static int reverse(int num) {
        int reverse = 0;
        for (int aux = num; aux > 0; aux /= 10) {
            reverse = reverse * 10 + aux % 10;
        }
        return (reverse);
    }
}
