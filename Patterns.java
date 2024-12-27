import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.println();
            System.out.println("\t1. Solid");
            System.out.println("\t2. Hollow");
            System.out.println("\t3. Half Pyramid");
            System.out.println("\t4. Inverted Half Pyramid");
            System.out.println("\t5. Inverted Half Pyramid(rotated by 180 degree)");
            System.out.println("\t6. Half Pyramid with Numbers");
            System.out.println("\t7. Inverted Half Pyramid with Numbers");
            System.out.println("\t8. Floyd's Triangle");
            System.out.println("\t9. 0-1 Triangle");
            System.out.println("\t10. Don't want");

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
                case 5:
                    System.out.print("How many Rows you want: ");
                    row = sc.nextInt();
                    for(int i = 1; i <= row; i++) {
                        for(int j = 1; j <= row-i; j++) {
                            System.out.print(" ");
                        }
                        for(int k  = 1; k <= i; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    System.out.print("How many Rows you want: ");
                    row = sc.nextInt();
                    for (int i = 1; i <= row; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(j+" ");
                        }
                        System.out.println();
                    }
                    break;
                case 7:
                    System.out.print("How many Rows you want: ");
                    row = sc.nextInt();
                    for (int i = row; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(j+" ");
                        }
                        System.out.println();
                    }
                    break;
                case 8:
                    System.out.print("How many Rows you want: ");
                    row = sc.nextInt();
                    int num = 1;
                    for (int i = 1; i <= row; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(num+" ");
                            num++;
                        }
                        System.out.println();
                    }
                    break;
                case 9:
                    System.out.print("How many Rows you want: ");
                    row = sc.nextInt();
                    for (int i = 1; i <= row; i++) {
                        for (int j = 1; j <= i; j++) {
                            if((i+j)%2==0){
                                System.out.print("1 ");
                            }else{
                                System.out.print("0 ");
                            }
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
