import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter shape size: ");
        int size = sc.nextInt();
        
        diamond(size);
        heartMinimal(size);
	}
    
    public static void diamond(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = n - i; j >= 0; j--) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i - 1; j++) {
                if((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
        System.out.println();
        }
        for(int i = n - 1; i >= 1; i--) {
            for(int j = n - i; j >= 0; j--) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i - 1; j++) {
                if((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
        System.out.println();
        }
    }
    
    public static void heartMinimal(int n) {
        n = n/2;
        for(int i = 1; i <= n; i++) {
            for(int j = n - i; j >= 0; j--) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i - 1; j++) {
                if (i ==1 && j == 1) {
                    System.out.print("^");
                } else if(j == 1) {
                    System.out.print("/");
                } else if(j == 2*i - 1) {
                    System.out.print("\\");
                } else {
                    System.out.print("*");
                }
            }
            for(int j = 2*(n - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i - 1; j++) {
                if (i ==1 && j == 1) {
                    System.out.print("^");
                } else if(j == 1) {
                    System.out.print("/");
                } else if(j == 2*i - 1) {
                    System.out.print("\\");
                } else {
                    System.out.print("*");
                }
            }
        System.out.println();
        }
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= 4*n + 1; j++) {
                if(j == 1 || j == 4*n + 1) {
                    System.out.print("|");
                }
                else {
                    System.out.print("*");
                }
            }
        System.out.println();
        }
        for(int i = 2*n; i >= 1; i--) {
            for(int j = 2*n - i; j >= 0; j--) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i - 1; j++) {
                if(i == 1 && j == 2*i - 1) {
                    System.out.print("V");
                } else if(j == 1) {
                    System.out.print("\\");
                } else if(j == 2*i - 1) {
                    System.out.print("/");
                } else {
                    System.out.print("*");
                }
            }
        System.out.println();
        }
    }
}
