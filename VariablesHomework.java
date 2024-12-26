import java.util.*;

public class VariablesHomework {
    public static void main(String[] args) {
        // Try to declare meaningful variables of each type. Eg - a variable named age should be a numeric type (int or float) not byte.
        int age = 23;


        // Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.
        double PI = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();
        double area = PI * (radius * radius);
        System.out.println("Area = " + area);
        
        // Make a program that prints the table of a number that is input by the user. 
        // (HINT - You will have to write 10 lines for this but as we proceed in the course you will be studying about ‘LOOPS’ that will simplify your work A LOT!
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println(number * 1);
        System.out.println(number * 2);
        System.out.println(number * 3);
        System.out.println(number * 4);
        System.out.println(number * 5);
        System.out.println(number * 6);
        System.out.println(number * 7);
        System.out.println(number * 8);
        System.out.println(number * 9);
        System.out.println(number * 10);
    }
}
