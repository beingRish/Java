import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        System.out.println("\n");

        // For Loop
        for(int counter = 0; counter < 3; counter++) {
            System.out.println("Hello World");
        }

        System.out.println("\n");

        // Print the numbers from 0 to 10
        for(int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        // While Loop
        int counter = 0;
        while (counter<=10) {
            System.out.print(counter + " ");
            counter++;
        }

        System.out.println("\n");

        // Do While Loop
        int j = 0;
        do {
            System.out.print(j + " ");
            j++;
        } while(j <= 10);

        System.out.println("\n");

        // Q1. Print the Sum of First n Natural Numbers.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);

        System.out.println("\n");

        // Q2. Print the table of a number input by the user.
        System.out.print("Enter a Number: ");
        int number = sc.nextInt();

        int i = 1;
        while(i<=10) {
            System.out.println(number * i);
            i++;
        }
    }
}