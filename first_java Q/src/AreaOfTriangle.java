//Area Of Triangle
import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter base");
        double b = in.nextDouble();
        System.out.println("enter height");
        double h = in.nextDouble();
        double area = (b * h) / 2;
        System.out.println("Area of Triangle = " + area);
        in.close();
    }
}
