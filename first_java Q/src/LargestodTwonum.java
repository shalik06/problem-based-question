//Take 2 numbers as input and print the largest number.
import java.util.Scanner;
public class LargestodTwonum {
    public static void mai(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First number");
        int a = in.nextInt();
        System.out.println("Enter Second number");
        int b = in.nextInt();
        if (a>b){
            System.out.println("a is largest"+('a'));
        } else if (b>a) {
            System.out.println("b is largest"+('b'));

        }
        else {
            System.out.println("both equal");
        }

    }

}
