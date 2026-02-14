package If_else_java;

import java.util.Scanner;

public class ProfitLoss {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter CP: ");
        double cp = sc.nextDouble();
        System.out.print("Enter SP: ");
        double sp = sc.nextDouble();

        if(sp>cp) {
            System.out.println("Profit is gain: "+(sp-cp));
            System.out.println("Loss precnt: "+((sp-cp)/sp*100.0)+"%");
        }

        else if(cp>sp) {
            System.out.println("Loss of: "+(cp-sp));
            System.out.println("Profit precnt: "+((cp-sp)/cp*100.0)+"%");
        }
        else  System.out.println("No loss No profit: "+(sp-cp));
    }
}
