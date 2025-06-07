import java.util.Scanner;
public class counterOccurence {
    public static void main(String... args) {
        String word = "myname is somtochukwu i am in ss3, my dad is a billionaire, " 
        + "i am th firstborn son of my family," +
         "may God almighty contiue to bless my parent through jess christ our Lord. Amen";

        // Scanner input = new Scanner(System.in);

        // System.out.println("Please input a character");
        // input.nextLine();

        int max = word.length();

        int i;
        int numletter = 0;
        for(i = 0; i < max; i++) {
            if (word.charAt(i) != 'i') {
                continue;
            }

            // proceed
            numletter++;

        }

        System.out.println("there are "+ numletter + " I\'s");

    }
}
