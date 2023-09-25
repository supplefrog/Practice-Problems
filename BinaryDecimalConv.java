import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary/decimal number: ");
        int num = sc.nextInt();
        if (isBinary(num)) {
            binToDec(num);
        } else {
            decToBin(num);
        }
    }
    public static boolean isBinary(int num) {
        while (num != 0) {
            if (num % 10 > 1) {
                return false;
            }
            num = num / 10;
        }
        return true;
    }
    public static void binToDec(int bin) {
        int dec = 0;
        for (int pow = 0; bin > 0; bin/=10) {
            dec += bin % 10 * (int) Math.pow(2, pow);
            pow++;
        }
        System.out.println(dec);
    }
    public static void decToBin(int dec) {
        int bin = 0;
        for (int pow = 0; dec > 0; dec/=2) {
            bin += dec % 2 * (int) Math.pow(10, pow);
            pow++;
        }
        System.out.println(bin);
    }
}
