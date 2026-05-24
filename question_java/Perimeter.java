// Perimeter Of Equilateral Triangle
import java.util.Scanner;
public class Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of one side of the equilateral triangle: ");
        double sideLength = sc.nextDouble();
        
        double perimeter = 3 * sideLength;
        
        System.out.println("The perimeter of the equilateral triangle is: " + perimeter);
        
        sc.close();
    }
}