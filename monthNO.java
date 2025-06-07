import java.util.Scanner;
public class monthNO {
    //let create a parameter called a method getNumber with a parameter of month
    public static int getNumber(String month) {
        // intialize a value
        int monthNumber = 0;

        // for when it is empty 
        if(month == null) {
            return monthNumber;
        }


        // for each string of character the user input is been converted to lower case
        switch (month.toLowerCase()) {
            case "january":
            monthNumber = 1;
                break;

            case "february":
            monthNumber = 2;
            break;

            case "march":
            monthNumber = 3;
            break;

            case "april":
            monthNumber = 4;
            break;

            case "may":
            monthNumber = 5;
            break;

            case "june":
            monthNumber = 6;
            break;

            case "july":
            monthNumber = 7;
            break;

            case "august":
            monthNumber = 8;
            break;

            case "september":
            monthNumber = 9;
            break;

            case "october":
            monthNumber =10;
            break;

            case "november":
            monthNumber = 11;
            break;

            case "december":
            monthNumber =12;
            break;

            default:
            monthNumber = 0;    
            break;
        }

        return monthNumber;
    }

       

    public static void main(String... arg) {
        Scanner input = new Scanner(System.in);
        // get user unput
        System.out.println("Enter a Month: ");
        String month = input.next();
        input.nextLine();

        int returnValue = monthNO.getNumber(month);
        if(returnValue == 0) {
            System.err.println("invalid");
        }
        else{
            System.out.println("the number for the month of " + month.toUpperCase() + " is: " + returnValue);
        }
    

        input.close();
    }
}
