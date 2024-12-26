public class Patterns {
    public static void main(String[] args) {
    /*
        1. Print the pattern

            *   *   *   *   *
            *   *   *   *   *
            *   *   *   *   *
            *   *   *   *   *
        */
        
        for(int i=1; i<=4; i++) {
            for(int j=1; j<=5; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("");

    /*
        2. Print the pattern

            *   *   *   *   *
            *               *
            *               *
            *   *   *   *   *
    */
        
        for(int i=1; i<=4; i++) {
            for(int j=1; j<=5; j++) {
                if(i==1 || i==4 || j==1 || j==5) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
