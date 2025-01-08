import java.util.Scanner;

public class Two_Dimentional_Arrays {

    public static void printMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        int[][] Matrix = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                Matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Matrix: ");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Take a matrix as input from the user.
    // Search for a given number x and print the indices at which it occurs.
    public static void searchNumberFromMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        int[][] Matrix = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                Matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the number which you want to search: ");
        int x = sc.nextInt();
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(Matrix[i][j]==x) {
                    System.out.println("x found at (" + i +"," + j + ")");
                } else {
                    System.out.println("Number is not found");
                }
            }
        }
    }

    public static void main(String[] args) {
        // printMatrix();
        searchNumberFromMatrix();
    }
}
