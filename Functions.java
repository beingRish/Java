import java.util.Scanner;

public class Functions {

    public static void printMyName(String name) {
        System.out.println("My Name is " + name);
    }

    // Make a function to add 2 numbers and return the sum.
    public static int calculateSum(int num1, int num2) {
        return num1 + num2;
    }

    // Make a function to multiply 2 numbers and return the product.
    public static int calculateProduct(int num1, int num2) {
        return num1 * num2;
    }

    public static void findFactorial(int number) {
        if(number < 0){
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
        for(int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial = " + factorial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        printMyName(name);

        System.out.print("Enter First Number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int number2 = sc.nextInt();

        int sum = calculateSum(number1, number2);
        int product = calculateProduct(number1, number2);

        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);

        System.out.print("Enter a number to find factorial: ");
        int number = sc.nextInt();
        findFactorial(number);
    }
}
