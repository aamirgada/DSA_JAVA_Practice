package Basic_Of_Java;
import java.util.*;

public class GstProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float UserBill = (pencil+pen+eraser) * 1.18f;

        System.out.println("Bill Of Include 18% GST: "+UserBill);
    }
}
