package Loops_java;

import java.util.Scanner;

public class LargestNumber {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num==0){
            System.out.println("No number entered yet");
            return;
        }
        int max = num;


        while(true){
            num = sc.nextInt();
            if(num==0){
                break;
            }
            if(num>max){
                max=num;
            }
        }
        System.out.println("Largest Number is : "+max);
    }
}
