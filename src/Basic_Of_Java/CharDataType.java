package Basic_Of_Java;

public class CharDataType {

    static void main(String[] args) {
        char ch = 'A';
        System.out.println(ch);

        char al = 'a';

        int y = al;// implicit Typecasting
        System.out.println(y);

        int x = 43;
        char b = (char)x; //explicit Typecasting
        System.out.println(b);
    }
}
