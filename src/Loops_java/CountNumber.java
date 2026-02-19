package Loops_java;

import java.util.Scanner;

public class CountNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 45644;

       int count=0;
       while(num!=0){
         int rem = num % 10;
            if(rem==4){
                count++;
            }
         num/=10;

       }
        System.out.println(count);
    }
}
