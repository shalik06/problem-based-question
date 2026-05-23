//Input currency in rupees and output in USD
import java.util.Scanner;
public class InrtoUsd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Rupees");
        double rupees = in.nextDouble();
        double usd = rupees/94.87;
        System.out.println("The amount in USD is " + usd);
        in.close();


    }
}

