import java.util.Scanner;

public class IT22889942Lab5Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int a = input.nextInt();
        System.out.print("Enter the second integer: ");
        int b = input.nextInt();
        System.out.print("Enter the third integer: ");
        int c = input.nextInt();

        // smallest
        int smallest = a;
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;

        // largest
        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;

        System.out.println("User entered numbers are: " + a + " " + b + " " + c);
        System.out.println("The Smallest number is: " + smallest);
        System.out.println("The Largest number is: " + largest);

        input.close();
    }
}