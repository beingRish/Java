import java.util.*;

public class Variables {
    public static void main(String[] args) {
        System.out.println("Hello world with Java");
        System.out.print("Hello world with Java\n");
        System.out.print("Hello world with Java\n");

        // Print the Pattern
        // *
        // **
        // ***
        // ****
        // *****
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");

        // Variables
        int a = 10;
        int b = 25;
        int sum = a + b;
        System.out.println(sum);
        int diff = b - a;
        System.out.println(diff);
        int mul = a * b;
        System.out.println(mul);
        b = 5;
        System.out.println(a*b/a-b); // 0
        System.out.println((a*b)/(a-b)); // 10

        // Input
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        // nextInt()
        // nextFloat()
        System.out.println(name);

        // Q1. Take 2 variables 'x' & 'y' and print their sum.
        System.out.print("Enter value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter value of y: ");
        int y = sc.nextInt();
        System.out.println("Sum = " + (x+y));
    }
}
