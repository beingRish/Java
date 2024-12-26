import java.util.Scanner;

public class ConditionalHomework {
    public static void main(String[] args) {
        /*
            Q1. Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
                1 : + (Addition) a + b
                2 : - (Subtraction) a - b
                3 : * (Multiplication) a * b
                4 : / (Division) a / b
                5 : % (Modulo or remainder) a % b
                Calculate the result according to the operation given and display it to the user.
            
                Q2. Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.
        */

        System.out.println("--------------------------Q1. Solution--------------------------");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter value of b : ");
        int b = sc.nextInt();

        System.out.print("Enter the Operation you want to do(+, -, *, /, %): ");
        char operation = sc.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println("Addition = " + (a+b));
                break;
            case '-':
                System.out.println("Substraction = " + (a-b));
                break;
            case '*':
                System.out.println("Multiplication = " + (a*b));
                break;
            case '/':
                System.out.println("Division = " + (a/b));
                break;
            case '%':
                System.out.println("Remainder = " + (a%b));
                break;
            default:
                break;
        }

        System.out.println("--------------------------Q2. Solution--------------------------");

        System.out.print("Enter the number of month : ");
        int month = sc.nextInt();

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println(("June"));
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invailid Month");
        }
    }
}
