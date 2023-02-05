import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scn.nextInt();
        int nst = 1;
        int nsp = n - 1;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= nsp; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= nst; j++){
                System.out.print("*");
            }
            System.out.println();
            nst+=2;
            nsp--;
        }
    }
}
