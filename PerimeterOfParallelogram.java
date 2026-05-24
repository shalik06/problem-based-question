//Perimeter Of Parallelogram
import java.util.Scanner;
public class PerimeterOfParallelogram {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number a:");
        int a = sc.nextInt();
        System.out.println("Enter Second number b:");
        int b = sc.nextInt();

        int perimeter = 2 * (a+b);
        System.out.println("Perimeter" + perimeter);
        sc.close();
    }
}
