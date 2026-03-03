package Loops_java;

import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.print("Factors Of Number: ");

        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.print(i + " ");

                if (i != num / i) {   // Avoid duplicate for perfect squares
                    System.out.print(num / i + " ");
                }
            }
        }

        sc.close();
    }
}