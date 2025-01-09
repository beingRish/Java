public class SB {

    public static void reverseString(StringBuilder str) {
        for(int i = 0; i < str.length()/2; i++) {
            int front = i;
            int back = str.length() - 1 - i;

            char frontChar = str.charAt(front);
            char backChar = str.charAt(back);

            str.setCharAt(front, backChar);
            str.setCharAt(back, frontChar);
        }
        System.out.println(str);    // olleh
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        StringBuilder sb2 = new StringBuilder("h");
        System.out.println(sb); // Tony

        // char at index 0
        System.out.println(sb.charAt(0));   // T

        // set char at index
        sb.setCharAt(0, 'P');   // Pony
        System.out.println(sb);

        // insert
        sb.insert(0, 'S');  // SPony
        System.out.println(sb);

        
        sb.insert(3, 'n');  // SPonny
        System.out.println(sb);

        // delete the extra 'n'
        sb.delete(3, 4);
        System.out.println(sb); // SPony

        sb2.append("e");
        sb2.append("l");
        sb2.append("l");
        sb2.append("o");
        System.out.println(sb2 + " " + sb2.length());    // hello 5

        reverseString(sb2);
    }
}
