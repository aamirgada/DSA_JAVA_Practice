package If_else_java;

import java.util.Scanner;

public class Coordinate {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x > 0 && y > 0){
            System.out.println("1st Coordinate");
        } else if (x < 0 && y >0) {
            System.out.println("2nd Coordinate");
        } else if (x < 0 && y < 0) {
            System.out.println("3rd Coordinate");
        } else if (x > 0 && y < 0) {
            System.out.println("4th Coordinate");
        } else if ( x == 0 && y > 0) {
            System.out.println("Y-Axis Coordinate");
        } else if (y == 0 && x>0) {
            System.out.println("X-Axis Coordinate");
        }else {
            System.out.println("Origin Coordinate");
        }
    }
}
