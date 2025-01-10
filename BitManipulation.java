
public class BitManipulation {
    public static void main(String[] args) {

        // Get Bit
        
        int n = 5; // 0101
        int pos = 3;
        int bitMask = 1 << pos;

        if((bitMask & n) == 0) {
            System.out.println("Bit was 0.");
        } else {
            System.out.println("Bit was 1");
        }
    }
}