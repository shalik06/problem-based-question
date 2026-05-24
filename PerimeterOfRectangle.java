// Perimeter Of Rectangle

import java.util.Scanner;

public class PerimeterOfRectangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length l:");
        int l = sc.nextInt();
        System.out.println("Enter width w:");
        int w = sc.nextInt();


        int perimeter = 2 * (l + w);


        System.out.println("Perimeter = " + perimeter);

        sc.close();
    }
}
