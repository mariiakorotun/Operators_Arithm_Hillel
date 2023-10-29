package project;
import java.util.Scanner;

public class Operators {
    static String item;
    static int days;
    static float price;
    static int numberOfItems;
    static float totalSum;
    static float average;
    private final static String currency = "EUR";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        item = "smartphone";
        System.out.print("Enter a number of smartphone sale days: ");
        days = scanner.nextInt();
        System.out.print("Enter the smartphone's price: ");
        price = scanner.nextFloat();
        System.out.print("Enter the number of smartphone purchased: ");
        numberOfItems = scanner.nextInt();

        totalSum = price * numberOfItems;
        average = totalSum/days;

        System.out.print("\n===================================================\n");

        System.out.printf("Product #1: %s," +
                "\ntotal sales for %d is %s %.2f," +
                "\nsales by day is %s %.2f." ,item,days,currency,totalSum,currency,average);

        System.out.print("\n===================================================\n");

        totalSum = 0;
        average = 0;

        item = "laptop";
        System.out.print("\nEnter a number of laptop sale days: ");
        days = scanner.nextInt();
        System.out.print("Enter the laptop's price: ");
        price = scanner.nextFloat();
        System.out.print("Enter the number of laptop purchased: ");
        numberOfItems = scanner.nextInt();

        totalSum = price * numberOfItems;
        average = totalSum/days;

        System.out.print("\n===================================================\n");

        System.out.printf("Product #2: %s,\n" +
                "total sales for %d is %s %.2f,\n" +
                "sales by day is %s %.2f.", item,days,currency,totalSum,currency,average);

        System.out.print("\n===================================================\n");
        scanner.close();
    }
}
