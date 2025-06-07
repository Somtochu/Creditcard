import java.util.Scanner;
public class CreditCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long cardno;
        while(true) {
            System.out.println("Enter card number: ");
            String card = sc.next();

            //check if there is a special character
            if(specialChar(card)){
            }
            else {
                cardno = Long.parseLong(card);
                break;
            }
        }
        //print the cardname
        if(check(cardno) && (cardName(cardno) != null)) {
            System.out.println(cardName(cardno));
        }
        else {
            System.out.println("INVALID");
        }
    }


    //method that cheeck if the card is valid by using luhn algorithm
    private static boolean check(long cardno) {
        String convert = Long.toString(cardno);
        char[] charArr = convert.toCharArray();
        int sum = 0;
        // iterate starting seconfd to the back
        for (int i = charArr.length - 2; i >= 0; i-=2) {
            int store = (charArr[i] - '0') * 2;
            int real, remainder;
            if (store > 9){
                real = store / 10; 
                remainder = store % 10;
                sum += (real + remainder);
            }
            else {
                sum += store;
            }
        }

       for(int j = charArr.length - 1; j >= 0; j-=2) {
            sum += (charArr[j] - '0');
        }

        if(sum % 10 == 0) {
            return true;
        }
        return false;
    }

    //get card name
    private static String cardName(long cardio){
        String convert = Long.toString(cardio);
        int length = convert.length();
        if((length == 15) && ((convert.charAt(0) == '3' && convert.charAt(1) =='4') ||
                (convert.charAt(0) == '3' && convert.charAt(1) == '7'))){
            return "AMERICAN EXPRESS";
        }

        else if (((length == 13) || (length == 16)) && (convert.charAt(0) == '4')) {
            return "VISA";
        }

        else if((length == 16) && ((convert.charAt(0) == '5' && convert.charAt(1) == '1') ||
                (convert.charAt(0) == '5' && convert.charAt(1) == '2') ||
                (convert.charAt(0) == '5' && convert.charAt(1) == '3') ||
                (convert.charAt(0) == '5' && convert.charAt(1) == '4') ||
                (convert.charAt(0) == '5' && convert.charAt(1) == '5'))){
            return "MASTERCARD";
        }
        else {
            return null;
        }
    }

    //check if there is presence of a special character
    private static boolean specialChar(String check){
        int length = check.length();
        int i = 0;
        while(i < length){
            if(!Character.isDigit(check.charAt(i))){
                return true;
            }
            i++;
        }
        return false;
    }

}
