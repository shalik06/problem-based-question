//To find Armstrong Number between two given number.
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter start number:");
        int start = in.nextInt();

        System.out.println("Enter end number:");
        int end = in.nextInt();

        for (int num = start; num <= end; num++) {

            int original = num;
            int temp = num;

            int count = 0;

            // count digits
            while (temp > 0) {
                temp = temp / 10;
                count++;
            }

            temp = num;
            int sum = 0;

            // calculate sum of powers
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, count);
                temp = temp / 10;
            }

            // check Armstrong
            if (sum == original) {
                System.out.println(original);
            }
        }

        in.close();
    }
}
