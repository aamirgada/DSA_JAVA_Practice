package Loops_java;

import java.util.Scanner;

public class Fibonici_series {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int a=0;
        int b=1;
//        int serie=0;
        for(int i=2; i<=num; i++){
            int temp=b;
            b=a+b;
            a=temp;
            System.out.println("Feb Nth number: "+b+ " ");



        }

    }
}
