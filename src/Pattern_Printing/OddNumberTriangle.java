package Pattern_Printing;

import java.util.Scanner;

public class OddNumberTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            int val=1;
            for(int j=1; j<=i; j++){
                System.out.print(val+" ");
                val+=2;
            }


            System.out.println();
        }
    }
}
