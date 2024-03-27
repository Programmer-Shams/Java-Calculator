import java.util.Scanner;
public class Calculator {
    public  static  void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter First Number For Calculation");
        double firstNumber = in.nextDouble();
        in.nextLine();
        System.out.println("Enter Second Number For Calculation");
        double secondNumber = in.nextDouble();
        in.nextLine();
        System.out.println("Enter Operator For Calculation");
        char operator = in.nextLine().charAt(0);

        System.out.println("First Number is " + firstNumber );
        System.out.println("Second Number is " + secondNumber);
        System.out.println("Operator is " + operator);

        Calculations cal = new Calculations();

         double result =  cal.Calculation(firstNumber, secondNumber, operator);
        System.out.println("Your Result is " + result);

    }
}
class Calculations {

    public double Calculation(double firstNumber, double secondNumber, char operator)
    {
        switch (operator)
        {
            case '+' :
                return firstNumber + secondNumber;

            case '-' :
                return firstNumber - secondNumber;

            case '*' :
                return firstNumber * secondNumber;

            case '/' :
                return firstNumber / secondNumber;
            default:
                System.out.println("Invalid Operator");
                return 0;
        }
    }
}