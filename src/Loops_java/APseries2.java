package Loops_java;

import java.util.Scanner;

public class APseries2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num =n;
        for(int i = 1 ; i<=n; i++){
            System.out.println(i);
            System.out.println(num);
            num=num-1;
        }
    }

}
