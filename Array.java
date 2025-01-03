import java.util.*;

public class Array {

    // Take an array as input from the user.
    // Search for a given number x and the index at which it occurs.

    public static void occurance() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int size = sc.nextInt();
    
        int numbers[] = new int[size];
    
        for(int i = 0; i < size; i++) {
            System.out.print("\nEnter a Number: ");
            numbers[i] = sc.nextInt();
        }
    
        System.out.print("Which number you want to search: ");
        int x = sc.nextInt();
    
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i]==x) {
                System.out.println(x + " found at " + i + " index");
            }
        }
    }

    // Take an array of numbers as input and check if it is an array sorted in ascending order.
    // Eg : { 1, 2, 4, 7 } is sorted in ascending order.
    // {3, 4, 6, 2} is not sorted in ascending order.

    public static void isArraySorted() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int size = sc.nextInt();
    
        int numbers[] = new int[size];
    
        for(int i = 0; i < size; i++) {
            System.out.print("\nEnter a Number: ");
            numbers[i] = sc.nextInt();
        }

        boolean isSorted = true;

        for(int i = 0; i < numbers.length-1; i++) {
            if(numbers[i] > numbers[i+1]) {
                isSorted = false;
                break;
            }
        }

        if(isSorted) {
            System.out.println("The Array is sorted in ascending order.");
        } else {
            System.out.println("The Array is not sorted in ascending order.");
        }
    }

    // Find the maximum & minimum number in an array of integers.
    public static void findMaxMin(int[] numbers) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < numbers.length - 1; i++) {
            if(max < numbers[i]) {
                max = numbers[i];
            }
            if(min > numbers[i]) {
                min = numbers[i];
            }
        }

        System.out.println("Max = " + max + "\nMin = " + min);
    }

    public static void main(String[] args) {
        int[] numbers = {35, 63, 57, 32, 46};

        // occurance();
        // isArraySorted();
        findMaxMin(numbers);
    }
}
