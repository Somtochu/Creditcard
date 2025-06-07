import java.util.Scanner;

public class simple_calculator {
    public static int calculator(int num1, int operator, int num2) {
        //for if divided by zero
        if(operator == 4 && num2 == 0) 
        return 0;


        switch(operator) {
            case 1: return num1 + num2;

            case 2: return num1 - num2;

            case 3: return num1 * num2;

            case 4: return num1 / num2;

            default: throw new IllegalArgumentException("Invalid Operator");
        }
    }

    public static void main(String... arg) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter a number: ");
        int num1 = input.nextInt();
        input.nextLine();

        System.out.println("Please enter a second No.: ");
        int num2 = input.nextInt();
        input.nextLine();

        System.out.println("Please enter the operation u want to perform\n"
                    + "1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");

        int sign = input.nextInt();
        int calculate =  simple_calculator.calculator(num1, sign, num2);

        System.out.println("The value is " + calculate);


        input.close();
    }
} 