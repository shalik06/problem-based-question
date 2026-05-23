//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;
public class Calculate {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter operators");
        char op = in.next().charAt(0);
        System.out.println("enter first number");
        int a = in.nextInt();
        System.out.println("enter second number");
        int b = in.nextInt();
        if (op == '+') {
            System.out.println("Assition i s = "+ (a+b));
        }
        else if (op == '-') {
            System.out.println("Subtration is ="+ (a-b));
        }
        else if (op == '*') {
            System.out.println("Multiply is ="+(a*b));

        }
        else if (op == '/') {
            System.out.println("Division is ="+(a/b));

        }
        else {
            System.out.println("invalid operatorts");
        }


    }
}
