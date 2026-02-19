package Loops_java;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = true; //iska mtlab prime hai

        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0){ //i is a factor of num
                flag = false;//not prime
                break;
            }
        }
        if(num==1) System.out.println("Neither prime or Composite");
         else if(flag==true) System.out.println("Prime Number");
          else System.out.println("Not a prime number");

    }
}
