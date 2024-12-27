import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.println();
            System.out.println("    1. Solid");
            System.out.println("    2. Hollow");
            System.out.println("    3. Half Pyramid");
            System.out.println("    4. Inverted Half Pyramid");

            System.out.println("    10. Don't want");

            System.out.print("\nEnter the Number: ");
            number = sc.nextInt();
            int row, col;

            switch (number) {
                case 1:
                    System.out.print("How many Rows you want: ");
                    row = sc.nextInt();
                    System.out.print("How many Collumns you want: ");
                    col = sc.nextInt();
                    for (int i = 1; i <= row; i++) {
                        for (int j = 1; j <= col; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.print("How many Rows you want: ");
                    row = sc.nextInt();
                    System.out.print("How many Collumns you want: ");
                    col = sc.nextInt();
                    for (int i = 1; i <= row; i++) {
                        for (int j = 1; j <= col; j++) {
                            if (i == 1 || i == row || j == 1 || j == col) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.print("How many Rows you want: ");
                    row = sc.nextInt();
                    for (int i = 1; i <= row; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.print("How many Rows you want: ");
                    row = sc.nextInt();
                    for (int i = row; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 10:
                    System.out.println("OK!");
                    break;
                default:
                    System.out.println("Invalid Number");
                    break;
            }
        } while (number != 10);
    }
}
