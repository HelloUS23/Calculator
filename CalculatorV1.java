import java.util.Scanner;
public class CalculatorV1
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
    System.out.println("Welcome to: The Matrix Calculator\n\nNOTICE: This calculator can only computate two number computations. One number and three or more number computations don't work.\n");
    
        System.out.print("Please enter one of the two numbers you would like to compute: ");
        double num1 = in.nextDouble();
    
            System.out.print("Please enter the second of the two numbers you would like to compute: ");
            double num2 = in.nextDouble();

                     int maximumAnswer = (int)Math.max(num1,num2);
                     int minimumAnswer = (int)Math.min(num1,num2);
                     double raisedNum = Math.pow(num1,num2);
                     double raisedNum2 = Math.pow(num2,num1);
                            int highest = (int)Math.ceil(num1);
                            int lowest = (int)Math.floor(num1);
                            int rounded = (int)Math.round(num1);
                                    int highest2 = (int)Math.ceil(num2);
                                    int lowest2 = (int)Math.floor(num2);
                                    int rounded2 = (int)Math.round(num2);
                                        double absolute = Math.abs(num1);
                                        double absolute2 = Math.abs(num2);
                                            double addition = num1 + num2;
                                            double subtraction = num1 - num2;
                                            double multiplication = num1 * num2; 
                                            double division = num1 / num2;
                System.out.println("\n----------------------------------------------------------\n");
                System.out.println(num1 + " and " + num2 + " were the numbers you imput.");
                System.out.println("\nBelow are the basic two number calculations of the integers you put in:");
                System.out.println(maximumAnswer + " is the maximum of the numbers you put in.");
                System.out.println(minimumAnswer + " is the minimum of the numbers you put in.");
                System.out.println(num1 + " added with " + num2 + " is " + addition);
                System.out.println(num1 + " subtracted with " + num2 + " is " + subtraction);
                System.out.println(num1 + " multiplied with " + num2 + " is " + multiplication);
                System.out.println(num1 + " divided by " + num2 + " is " + division);
                System.out.println("\nThe following are the single number calculations of the integers you put in:");
                System.out.println(raisedNum + " is " + num1 + " raised to the power of " + num2 + ".");
                System.out.println(raisedNum2 + " is " + num2 + " raised to the power of " + num1 + ".");
                System.out.println("The absolute value of " + num1 + " is " + absolute);
                System.out.println("The absolute value of " + num2 + " is " + absolute2);
                System.out.println("Highest round of " + num1 + " is: " + highest);
                System.out.println("Lowest round of " + num1 + " is: " + lowest);
                System.out.println("The overall round of " + num1 + " is: " + rounded);
                System.out.println("Highest round of " + num2 + " is: " + highest2);
                System.out.println("Lowest round of " + num2 + " is: " + lowest2);
                System.out.println("The overall round of " + num2 + " is: " + rounded2);
                System.out.println("\n----------------------------------------------------------\n");
    }
}