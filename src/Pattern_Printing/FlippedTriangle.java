package Pattern_Printing;

import java.util.Scanner;

public class FlippedTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i=1; i<=row; i++){
            for(int j=1; j<=row-i+1; j++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }

    }
}
