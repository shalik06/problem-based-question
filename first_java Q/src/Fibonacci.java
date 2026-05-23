//To calculate Fibonacci Series up to n numbers.
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of terms:");
        int n = in.nextInt();

        int a = 0;
        int b = 1;


        if (n >= 1) {
            System.out.print(a + " ");
        }
        if (n >= 2) {
            System.out.print(b + " ");
        }

        int count = 3;
        while (count <= n) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
            count++;
        }

        in.close();
    }
}
