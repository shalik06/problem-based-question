//Area Of Circle Java Program
import java.util.Scanner;
public class AreaofCricle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius");
        double r = in.nextDouble();
        double area = Math.PI * r * r;
        System.out.println("area of a circle =" + area);
        in.close();
    }
}


