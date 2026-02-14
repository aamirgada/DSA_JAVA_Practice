package If_else_java;

import java.util.Scanner;

public class IsInteger {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();
        int x = (int)num;
        if(num-x>0) System.out.println("Is not a Integer");
        else System.out.println("It is integer ");
    }
}
