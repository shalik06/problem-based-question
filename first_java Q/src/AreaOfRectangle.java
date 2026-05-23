//Area Of Rectangle Program
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length");
        double l = in.nextDouble();
        System.out.println("Enter width");
        double w = in.nextDouble();
        double area = l*w;
        System.out.println("Area of a rectangle = " + area);
        in.close();
    }
}
