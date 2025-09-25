import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       System.out.println("Please enter the first number:");
       double firstNumber = input.nextDouble();

        System.out.print("Enter the second number: ");
       double SecondNumber = input.nextDouble();

       System.out.println("operation would you like to preform");
       System.out.println("1. Addition");
       System.out.println("2. Subtraction");
       System.out.println("3. Multiplication");
       System.out.println("4. Division");
       System.out.println("enter your choice (1-4);");
       int choice = input.nextInt();
       double result = firstNumber - SecondNumber;
       System.out.println("The result of Substraction is : " + result);
       input.close();



    }
}
