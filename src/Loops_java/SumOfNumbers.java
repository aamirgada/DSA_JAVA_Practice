package Loops_java;

import java.util.Scanner;

public class SumOfNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            int num = sc.nextInt();

            if(num==0){
                break;
            }
            sum+=num;
        }
        System.out.println("Sum of Numbers: "+sum);
    }
}
