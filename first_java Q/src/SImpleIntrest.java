import java.util.Scanner;
public class SImpleIntrest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double p,r,t;
        System.out.println("enter principl");
        p = in.nextDouble();
        System.out.println(" enter rate ");
        r = in.nextDouble();
        System.out.println("enter time ");
        t = in.nextDouble();
        double si = (p * r * t) / 100;
        System.out.println("Simpleintrest is" + si);



    }
}








