import java.util.Scanner;

public class calcMonth {
    public static void main(String... arg) {
        //our task is to get the number os days in a month
         //we want to get an input from the user
         Scanner input = new Scanner(System.in);

         System.out.println("Please enter a year : ");
         int year = input.nextInt();
         input.nextLine();

         int numDays = 0;

         System.out.println("Enter a month using the convention 1-12: ");
         int month = input.nextInt();
         input.nextLine();

         // now we are goig to classify the month into cases eg case1 for january etc

         switch (month) {
            //month with 31 days
            case 1: case 3: case 5: case 7: case 8:
            case 10: case 12:
            numDays = 31;
                break;

                //month with 30days
                case 4: case 6: case 9: case 11:
                numDays = 30;
                break;


                //special case february which has leap year

                // it means that if no. 1 leap year are divisible by 4 and 400, but not by 100

                case 2:
                if(( (year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) 
                numDays = 29;
                else {
                    numDays = 28;
                }
                break;
         
            default:
                System.err.println("Invalid input");
                break;
           }
        
           //printing the no. of days
         System.out.println("the number of days is: " + numDays);

         input.close();
    }
}
