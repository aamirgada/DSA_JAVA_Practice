package Basic_Of_Java;

import java.util.Scanner;

public class SquareOfNo {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        int square= num*num;

        System.out.println("Square of a Number: "+square);

    }
}
