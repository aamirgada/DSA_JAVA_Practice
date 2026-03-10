package Pattern_Printing;

import java.util.Scanner;

public class AlphaNumericTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for(int i=1; i<=row; i++){
            if(i%2==1){
                for(int j=1; j<=i;j++){
                    System.out.print(j+" ");
                }

            }
            else {
                for(int j=1;j<=i; j++){
                    System.out.print((char)(j+64)+" ");
                }
            }
            System.out.println();
        }
    }
}
