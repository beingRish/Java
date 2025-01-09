import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        // concatenation
        String firstName = "Tony";
        String lastName = "Starc";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        //charAt
        for(int i = 0; i < fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }

        // compare
        String name1 = "Rishabh";
        String name2 = "Rishabh2";

        //1. s1 > s2 : +ve value
        //2. s1 == s2 : 0
        //3. s1 < s2 : -ve value

        // hello < wello
        // hello > cello

        // if(name1.compareTo(name2) == 0){
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal.");
        // }

        // if(name1 == name2){
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal.");
        // }

        if(new String("Tony") == new String("Tony")) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal.");
        }

        // substring(beg index, end index)
        String sentence = "My Name is Tony";
        String sentence2 = "TonyStarc";
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);
        String nameTwo = sentence2.substring(0, 4);
        System.out.println(nameTwo);
        String nameThree = sentence2.substring(4);
        System.out.println(nameThree);

        // Strings are Immutable
    }
}
