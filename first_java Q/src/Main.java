//Write a program to print whether a number is even or odd, also take input from the user
import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter a number");
        int n = in.nextInt();
       if (n % 2 == 0){
           System.out.println("even number");
       }
      else{
           System.out.println("Odd number");
       }
    }

}