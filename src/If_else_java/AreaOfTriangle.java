package If_else_java;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a base of Triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter a base of Triangle: ");
        double hight = sc.nextDouble();
        double area = 1/2.0*(base*hight);
        System.out.println("Area of Triangle: "+area);
    }

}
