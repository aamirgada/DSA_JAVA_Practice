package If_else_java;
import java.util.*;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double result;

        char operator = sc.next().charAt(0);

        switch (operator){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                if(num2==0){
                    System.out.println("Division by 0 is not Allowed");
                    return;
                }
                else result = num1/num2;
                break;
            default:
                System.out.println("Invalid Operator");
                return;
        }
        System.out.println("The final reuslt: " + num1 +" "+ operator +" "+  num2 + " = " + result);

    }
}
