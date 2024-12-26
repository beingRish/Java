import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter value of a: ");
        // int a = sc.nextInt();
        // System.out.print("Enter value of b: ");
        // int b = sc.nextInt();

        // if(a == b) {
        //     System.out.println("Equal");
        // } else if(a > b) {
        //     System.out.println(a + " is greater");
        // } else {
        //     System.out.println(b + " is greater");
        // }

        // Q. 1
        System.out.print("Tab a button 1 or 2 or 3: ");
        int button = sc.nextInt();

        // if(button == 1) {
        //     System.out.println("Hello");
        // } else if(button == 2) {
        //     System.out.println("Namaste");
        // } else if(button == 3) {
        //     System.out.println("Bonjour");
        // } else {
        //     System.out.println("Invailid Button");
        // }

        // Switch - Case
        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
            System.out.println("Invailid Button");
        }
    }
}
