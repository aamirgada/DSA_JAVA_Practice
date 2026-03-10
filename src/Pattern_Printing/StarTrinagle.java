package Pattern_Printing;

import java.util.Scanner;

public class StarTrinagle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        for(int i=1; i<=row; i++){
            for(int j=1;j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
