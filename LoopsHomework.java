import java.util.Scanner;

public class LoopsHomework {
    public static void main(String[] args) {
    /*
        1. Print all even numbers till n.

        2. Run
            for(; ;) {
                        System.out.println("Apna College");
                    }
            loop on your system and analyze what happens. Try to think of the reason for the output produced.

        3. Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
        
            If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
            If they enter 0 then stop.
            If he/ she scores :
                Marks >=90 -> print “This is Good”
                89 >= Marks >= 60 -> print “This is also Good”
                59 >= Marks >= 0 -> print “This is Good as well”
            Because marks don’t matter but our effort does.
            (Hint : use do-while loop but think & understand why)

        BONUS
        Qs. Print if a number is prime or not (Input n from the user). 
            [In this problem you will learn how to check if a number is prime or not]

    */
    
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--------------------------------Q1. Solution--------------------------------");
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            if(i%2==0) {
                System.out.println(i);
            }
        }

        System.out.println("\n--------------------------------Q2. Solution--------------------------------");
        // for(; ;) {
        //     System.out.println("Apna College");
        // }

        System.out.println("\n--------------------------------Q3. Solution--------------------------------");

        int input;
        do {
            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();
            if(marks >= 90 && marks <= 100) {
                System.out.println("This is Good");
            } else if(marks >= 60 && marks <= 89) {
                System.out.println("This is also Good");
            } else if(marks >= 0 && marks <= 59) {
                System.out.println("This is Good as well");
            } else {
                System.out.println("Invalid");
            }

            System.out.print("Want to continue ? (yes(1) or no(0)) : ");
            input = sc.nextInt();

        } while(input == 1);
            
        System.out.println("\n--------------------------------BONUS. Solution--------------------------------");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        boolean isPrime = true;

        for(int i = 2; i <= n/2; i++) {
            if(num%i==0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            if(num == 1) {
                System.out.println("This is neither prime not composite");
            } else {
                System.out.println("This is a prime number");
            }
        } else {
            System.out.println("This is not a prime number");
        } 
    }
}
