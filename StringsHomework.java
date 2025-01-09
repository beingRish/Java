import java.util.Scanner;

public class StringsHomework {

    // Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

    public static void findCCombinedLength() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int toLength = 0;
        String array[] = new String[size];
        for(int i = 0; i < size; i++) {
            array[i] = sc.next();
            toLength += array[i].length();
        }
        System.out.println("Combined Length of array of Strings = " + toLength);
    }

    // Input a string from the user. Create a new string called ‘result’,
    // in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
    // Example : 
    // original = “eabcdef’ ; result = “iabcdif”
    // Original = “xyz” ; result = “xyz”

    public static void replaceLetter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String string = sc.next();
        String result = "";

        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i)=='e'){
                result += 'i';
            } else {
                result += string.charAt(i);
            }
        }
        System.out.println("Original String = " + string);
        System.out.println("Result = " + result);
    }

    // Input an email from the user. 
    // You have to create a username from the email by deleting the part that comes after ‘@’. 
    // Display that username to the user.
    // Example : 
    // email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
    // email = “helloWorld123@gmail.com”; username = “helloWorld123”

    public static void displayUsername() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you Email: ");
        String email = sc.next();
        String userName = "";
        for(int i = 0; i < email.length(); i++) {
            if(email.charAt(i)=='@'){
                break;
            }
            userName += email.charAt(i);
        }
        System.out.println("Username = " + userName);
    }

    public static void main(String[] args) {
        // findCCombinedLength();
        // replaceLetter();
        displayUsername();
    }
}
