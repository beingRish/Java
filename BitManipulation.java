import java.util.Scanner;

public class BitManipulation {

    public static void getBit() {
        // Get the 3rd bit (position = 2) of a number n. (n=0101)
        
        int n = 5; // 0101
        int pos = 3;
        int bitMask = 1 << pos;

        if((bitMask & n) == 0) {
            System.out.println("Bit was 0.");
        } else {
            System.out.println("Bit was 1");
        }
    }

    public static void setBit() {
        // set the 2nd bit (position = 1) of a numbr n. (n = 0101)

        int n = 5; // 0101
        int pos = 1;
        int bitMask = 1 << pos;

        int newNumber = bitMask | n;

        System.out.println(newNumber);  // 7
    }

    public static void clearBit() {
        // clear the 3rd bit (position = 2) of a numbr n. (n = 0101)

        int n = 5; //0101
        int pos = 2;
        int bitMask = 1 << pos;
        int notBitMast = ~(bitMask);

        int newNumber = notBitMast & n;
        System.out.println(newNumber);
    }

    public static void updateBit() {
        // update the 2nd bit (position = 1) of a number n to oper. (n = 0101)

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 or 0: ");
        int oper = sc.nextInt();
        // oper=1 : set, oper = 0 : clear
        int n = 5; //0101
        int pos = 1;

        int bitMask = 1 << pos;
        if(oper == 1) {
            // set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            // clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }

    public static void main(String[] args) {

        // getBit();
        // setBit();
        // clearBit();
        updateBit();
    }
}