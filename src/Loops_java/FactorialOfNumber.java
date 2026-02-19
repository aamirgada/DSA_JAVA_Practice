    package Loops_java;

    import java.util.Scanner;

    public class FactorialOfNumber {
        public  static int fact1(int num){
            int fact =1;
            int n=1;
            for(int i = 1; i<=num; i++){
                fact = i*fact;
            }
            return fact;
        }
         static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            int res=FactorialOfNumber.fact1(num);



            System.out.println("Factorial of Number: "+res);
        }
    }
