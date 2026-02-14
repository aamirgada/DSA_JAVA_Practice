package If_else_java;

import java.util.Scanner;

public class EvenOrOdd {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A +ve Integer: ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("The Number is Even");
        }
        else {
            System.out.println("The Number is Odd");
        }
    }
}
