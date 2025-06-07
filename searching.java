import java.util.Scanner;
public class searching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String searchFrom = "A labeled continue statement skips the current iteration of an outer loop marked with the given label. The following example program, ContinueWithLabelDemo,"
        + "uses nested loops to search for a substring within another string";

        System.out.println("Please input a text that you want to find");

        String find = input.next();
        input.nextLine();

        int max = searchFrom.length() - find.length();

        boolean foundIt = false;
        int i;
        //use thelabeled break and continue statement

        test:
        for(i = 0; i < max; i++) {
            // we are trying to iterate each loop by comparing them ine at a time
            int n = find.length();
            int j = i;
            int k = 0;

            //for each string that the user input; their length shoud be decrease by -1 until the loop terminate searching for the word in
            //searchFrom
            while(n-- != 0){
              if(searchFrom.charAt(j++) != find.charAt(k++)) {
                continue test;
              }  
            }

            foundIt = true;
            break test;
        }

        System.out.println(foundIt ? "Found it" : "Not available");




        input.close();;
    }
}
