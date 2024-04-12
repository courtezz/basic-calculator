package basicCalculator.com;

import java.util.Scanner;

public class pluralsight {
    public static void main(String[] args) {

       Scanner myScanner = new Scanner(System.in);

       System.out.print("5");
       int num1 = myScanner.nextInt();

        System.out.print("12");
        int num2 = myScanner.nextInt();

      int sum = (num1 * num2);
      System.out.println("the sum is" + sum);

    }
}