package Basic_Of_Java;

import java.util.Scanner;

public class AreaOfSpher {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Taking inputs from User
        System.out.print("Enter a Number: ");
        double r = sc.nextDouble();
        double pi=3.14;
        double area = 4/3*pi*r*r*r;
        System.out.println("Area of Sphere: "+area);

    }
}
