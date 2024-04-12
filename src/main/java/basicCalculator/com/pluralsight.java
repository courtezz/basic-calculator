package basicCalculator.com;

import java.util.Scanner;

public class pluralsight {
    private static Scanner myScanner;

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

     System.out.print("Enter your name: ");
     String name = myScanner.nextLine();
     System.out.println(name);

     System.out.print("Enter hours worked: ");
     float hoursWorked = myScanner.nextFloat();

     System.out.print("Enter your pay rate: ");
     float payRate = myScanner.nextFloat();

     float grossPay = hoursWorked * payRate;
     System.out.printf("%s Name earned $%f.2f", name , grossPay);







    }
}