import java.util.Scanner;
public class CalculatorV2 //Change this to CalculatorV2 in VS Code
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
    System.out.println("Welcome to: The Matrix Calculator V2\nNOTICE: Please put all fractions in decimal form.");
 
//--------------------------------------------------------------------------------------------------------------------------------
    System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
    System.out.print("Would you like to do multiplication? (y/n)\nEnter your answer here: ");
    char agreeMultiply = in.next().charAt(0);
 
    if (agreeMultiply == 'y') {
 
    System.out.print("How many numbers would you like to multiply? (maximum of 5 minimum of 2)\nEnter your answer here: ");
    int multNumOfNumbers = in.nextInt();
 
    if (multNumOfNumbers == 1) {
        System.out.print("That is not a valid number, please run the command again.");
 
    } else if (multNumOfNumbers == 2) {
        System.out.print("Please enter one of the two numbers you would like to multiply: ");
        double Num1 = in.nextDouble();
            System.out.print("Please enter the second of the two numbers you would like to multiply: ");
            double Num2 = in.nextDouble();
 
            double Answer = Num1 * Num2;
            System.out.println("\n----------------------------------------------------------\n");
            System.out.println("Your results for " + Num1 + " multiplied by " + Num2 + " is " + Answer);
            System.out.println("\n----------------------------------------------------------\n");
 
    } else if (multNumOfNumbers == 3) {
        System.out.print("Please enter one of the three numbers you would like to multiply: ");
        double Num1 = in.nextDouble();
            System.out.print("Please enter the second of the three numbers you would like to multiply: ");
            double Num2 = in.nextDouble();
                System.out.print("Please enter the third of the three numbers you would like to multiply: ");
                double Num3 = in.nextDouble();
 
            double Answer = Num1 * Num2 * Num3;
            System.out.println("\n----------------------------------------------------------\n");
            System.out.println("Your results for " + Num1 + " times " + Num2 + " times " + Num3 + " is " + Answer);
            System.out.println("\n----------------------------------------------------------\n");
 
    } else if (multNumOfNumbers == 4) {
        System.out.print("Please enter one of the four numbers you would like to multiply: ");
        double Num1 = in.nextDouble();
            System.out.print("Please enter the second of the four numbers you would like to multiply: ");
            double Num2 = in.nextDouble();
                System.out.print("Please enter the third of the four numbers you would like to multiply: ");
                double Num3 = in.nextDouble();
                    System.out.print("Please enter the fourth of the four numbers you would like to multiply: ");
                    double Num4 = in.nextDouble();
 
            double Answer = Num1 * Num2 * Num3 * Num4;
            System.out.println("\n----------------------------------------------------------\n");
            System.out.println("Your results for " + Num1 + " times " + Num2 + " times " + Num3 + " times " + Num4 + " is " + Answer);
            System.out.println("\n----------------------------------------------------------\n");
 
    } else if (multNumOfNumbers == 5) {
        System.out.print("Please enter the first number of the five numbers you would like to multiply: ");
        double Num1 = in.nextDouble();
            System.out.print("Please enter the second of the five numbers you would like to multiply: ");
            double Num2 = in.nextDouble();
                System.out.print("Please enter the third of the five numbers you would like to multiply: ");
                double Num3 = in.nextDouble();
                    System.out.print("Please enter the fourth of the five numbers you would like to multiply: ");
                    double Num4 = in.nextDouble();
                        System.out.print("Please enter the fifth of the five numbers you would like to multiply: ");
                        double Num5 = in.nextDouble();
 
            double Answer = Num1 * Num2 * Num3 * Num4 * Num5;
            System.out.println("\n----------------------------------------------------------\n");
            System.out.println("Your results for " + Num1 + " times " + Num2 + " times " + Num3 + " times " + Num4 + " times " + Num5 + " is " + Answer);
            System.out.println("\n----------------------------------------------------------\n");
    }
 
//------------------------------------------------------------------------------------------------------------------------------------------
 
} else if (agreeMultiply == 'n') {
    System.out.print("Would you like to do subtraction? (y/n)\nEnter your answer here: ");
    char agreeSubtraction = in.next().charAt(0);
 
    if (agreeSubtraction == 'y') {
 
    System.out.print("How many numbers would you like to subtract? (maximum of 5 minimum of 2)\nEnter your answer here: ");
    int subNumOfNumbers = in.nextInt();
 
    if (subNumOfNumbers == 1) {
        System.out.print("That is not a valid number, please run the command again.");
 
    } else if (subNumOfNumbers == 2) {
        System.out.print("Please enter the number you would like to subtract from: ");
        double Num1 = in.nextDouble();
            System.out.print("Please enter the second of the two numbers you would like to subtract: ");
            double Num2 = in.nextDouble();
 
            double Answer = Num1 - Num2;
            System.out.println("\n----------------------------------------------------------\n");
            System.out.println("Your results for " + Num1 + " subtracted by " + Num2 + " is " + Answer);
            System.out.println("\n----------------------------------------------------------\n");
 
    } else if (subNumOfNumbers == 3) {
        System.out.print("Please enter the number you would like to subtract from: ");
        double Num1 = in.nextDouble();
            System.out.print("Please enter the second of the three numbers you would like to subtract: ");
            double Num2 = in.nextDouble();
                System.out.print("Please enter the third of the three numbers you would like to subtract: ");
                double Num3 = in.nextDouble();
 
            double Answer = Num1 - Num2 - Num3;
            System.out.println("\n----------------------------------------------------------\n");
            System.out.println("Your results for " + Num1 + " minus " + Num2 + " minus " + Num3 + " is " + Answer);
            System.out.println("\n----------------------------------------------------------\n");
 
    } else if (subNumOfNumbers == 4) {
        System.out.print("Please enter the number you would like to subtract from: ");
        double Num1 = in.nextDouble();
            System.out.print("Please enter the second of the four numbers you would like to subtract: ");
            double Num2 = in.nextDouble();
                System.out.print("Please enter the third of the four numbers you would like to subtract: ");
                double Num3 = in.nextDouble();
                    System.out.print("Please enter the fourth of the four numbers you would like to subtract: ");
                    double Num4 = in.nextDouble();
 
            double Answer = Num1 - Num2 - Num3 - Num4;
            System.out.println("\n----------------------------------------------------------\n");
            System.out.println("Your results for " + Num1 + " minus " + Num2 + " minus " + Num3 + " minus " + Num4 + " is " + Answer);
            System.out.println("\n----------------------------------------------------------\n");
 
    } else if (subNumOfNumbers == 5) {
        System.out.print("Please enter the number you would like to subtract from: ");
        double Num1 = in.nextDouble();
            System.out.print("Please enter the second of the five numbers you would like to subtract: ");
            double Num2 = in.nextDouble();
                System.out.print("Please enter the third of the five numbers you would like to subtract: ");
                double Num3 = in.nextDouble();
                    System.out.print("Please enter the fourth of the five numbers you would like to subtract: ");
                    double Num4 = in.nextDouble();
                        System.out.print("Please enter the fifth of the five numbers you would like to subtract: ");
                        double Num5 = in.nextDouble();
 
            double Answer = Num1 - Num2 - Num3 - Num4 - Num5;
            System.out.println("\n----------------------------------------------------------\n");
            System.out.println("Your results for " + Num1 + " minus " + Num2 + " minus " + Num3 + " minus " + Num4 + " minus " + Num5 + " is " + Answer);
            System.out.println("\n----------------------------------------------------------\n");
   
//------------------------------------------------------------------------------------------------------------------------------------------
}
    } else if (agreeSubtraction == 'n') {
    System.out.print("Would you like to do addition? (y/n)\nEnter your answer here: ");
    char agreeAddition = in.next().charAt(0);
 
    if (agreeAddition == 'y') {
 
    System.out.print("How many numbers would you like to add together? (maximum of 5 minimum of 2)\nEnter your answer here: ");
    int addNumOfNumbers = in.nextInt();
 
    if (addNumOfNumbers == 1) {
        System.out.print("That is not a valid number, please run the command again.");
 
    } else if (addNumOfNumbers == 2) {
        System.out.print("Please enter the first of the two numbers you would like to add: ");
        double Num1 = in.nextDouble();
            System.out.print("Please enter the second of the two numbers you would like to add: ");
            double Num2 = in.nextDouble();
 
            double Answer = Num1 + Num2;
            System.out.println("\n----------------------------------------------------------\n");
            System.out.println("Your results for " + Num1 + " added to " + Num2 + " is " + Answer);
            System.out.println("\n----------------------------------------------------------\n");
 
    } else if (addNumOfNumbers == 3) {
        System.out.print("Please enter the first of the three numbers you would like to add: ");
        double Num1 = in.nextDouble();
            System.out.print("Please enter the second of the three numbers you would like to add: ");
            double Num2 = in.nextDouble();
                System.out.print("Please enter the third of the three numbers you would like to add: ");
                double Num3 = in.nextDouble();
 
            double Answer = Num1 + Num2 + Num3;
            System.out.println("\n----------------------------------------------------------\n");
            System.out.println("Your results for " + Num1 + " plus " + Num2 + " plus " + Num3 + " is " + Answer);
            System.out.println("\n----------------------------------------------------------\n");
 
    } else if (addNumOfNumbers == 4) {
        System.out.print("Please enter the first number of the four numbers you would like to add: ");
        double Num1 = in.nextDouble();
            System.out.print("Please enter the second of the four numbers you would like to add: ");
            double Num2 = in.nextDouble();
                System.out.print("Please enter the third of the four numbers you would like to add: ");
                double Num3 = in.nextDouble();
                    System.out.print("Please enter the fourth of the four numbers you would like to add: ");
                    double Num4 = in.nextDouble();
 
            double Answer = Num1 + Num2 + Num3 + Num4;
            System.out.println("\n----------------------------------------------------------\n");
            System.out.println("Your results for " + Num1 + " plus " + Num2 + " plus " + Num3 + " plus " + Num4 + " is " + Answer);
            System.out.println("\n----------------------------------------------------------\n");
 
    } else if (addNumOfNumbers == 5) {
        System.out.print("Please enter the first number of the five numbers you would like to add: ");
        double Num1 = in.nextDouble();
            System.out.print("Please enter the second of the five numbers you would like to add: ");
            double Num2 = in.nextDouble();
                System.out.print("Please enter the third of the five numbers you would like to add: ");
                double Num3 = in.nextDouble();
                    System.out.print("Please enter the fourth of the five numbers you would like to add: ");
                    double Num4 = in.nextDouble();
                        System.out.print("Please enter the fifth of the five numbers you would like to add: ");
                        double Num5 = in.nextDouble();
 
            double Answer = Num1 + Num2 + Num3 + Num4 + Num5;
            System.out.println("\n----------------------------------------------------------\n");
            System.out.println("Your results for " + Num1 + " plus " + Num2 + " plus " + Num3 + " plus " + Num4 + " plus " + Num5 + " is " + Answer);
            System.out.println("\n----------------------------------------------------------\n");
 
//------------------------------------------------------------------------------------------------------------------------------------------
 
    }
        } else if (agreeAddition == 'n') {
    System.out.print("Would you like to do division? (y/n)\nEnter your answer here: ");
    char agreeDivision = in.next().charAt(0);
 
        if (agreeDivision == 'y') {
 
    System.out.print("How many numbers would you like to divide? (maximum of 5 minimum of 2)\nEnter your answer here: ");
    int divNumOfNumbers = in.nextInt();
 
    if (divNumOfNumbers == 1) {
        System.out.print("That is not a valid number, please run the command again.");
 
    } else if (divNumOfNumbers == 2) {
        System.out.print("Please enter the first of the two numbers you would like to divide: ");
        double Num1 = in.nextDouble();
            System.out.print("Please enter the second of the two numbers you would like to divide: ");
            double Num2 = in.nextDouble();
 
            double Answer = Num1 / Num2;
            System.out.println("\n----------------------------------------------------------\n");
            System.out.println("Your results for " + Num1 + " divided with " + Num2 + " is " + Answer);
            System.out.println("\n----------------------------------------------------------\n");
 
    } else if (divNumOfNumbers == 3) {
        System.out.print("Please enter the first of the three numbers you would like to divide: ");
        double Num1 = in.nextDouble();
            System.out.print("Please enter the second of the three numbers you would like to divide: ");
            double Num2 = in.nextDouble();
                System.out.print("Please enter the third of the three numbers you would like to divide: ");
                double Num3 = in.nextDouble();
 
            double Answer = Num1 / Num2 / Num3;
            System.out.println("\n----------------------------------------------------------\n");
            System.out.println("Your results for " + Num1 + " divided by " + Num2 + " divided by " + Num3 + " is " + Answer);
            System.out.println("\n----------------------------------------------------------\n");
 
    } else if (divNumOfNumbers == 4) {
        System.out.print("Please enter the first number of the four numbers you would like to divide: ");
        double Num1 = in.nextDouble();
            System.out.print("Please enter the second of the four numbers you would like to divide: ");
            double Num2 = in.nextDouble();
                System.out.print("Please enter the third of the four numbers you would like to divide: ");
                double Num3 = in.nextDouble();
                    System.out.print("Please enter the fourth of the four numbers you would like to divide: ");
                    double Num4 = in.nextDouble();
 
            double Answer = Num1 / Num2 / Num3 / Num4;
            System.out.println("\n----------------------------------------------------------\n");
            System.out.println("Your results for " + Num1 + " divided by " + Num2 + " divided by " + Num3 + " divided by " + Num4 + " is " + Answer);
            System.out.println("\n----------------------------------------------------------\n");
 
    } else if (divNumOfNumbers == 5) {
        System.out.print("Please enter the first number of the five numbers you would like to divide: ");
        double Num1 = in.nextDouble();
            System.out.print("Please enter the second of the five numbers you would like to divide: ");
            double Num2 = in.nextDouble();
                System.out.print("Please enter the third of the five numbers you would like to divide: ");
                double Num3 = in.nextDouble();
                    System.out.print("Please enter the fourth of the five numbers you would like to divide: ");
                    double Num4 = in.nextDouble();
                        System.out.print("Please enter the fifth of the five numbers you would like to divide: ");
                        double Num5 = in.nextDouble();
 
            double Answer = Num1 / Num2 / Num3 / Num4 / Num5;
            System.out.println("\n----------------------------------------------------------\n");
            System.out.println("Your results for " + Num1 + " divided by " + Num2 + " divided by " + Num3 + " divided by " + Num4 + " divided by " + Num5 + " is " + Answer);
            System.out.println("\n----------------------------------------------------------\n");
 
//------------------------------------------------------------------------------------------------------------------------------------------
 
    }
        } else if (agreeDivision == 'n') {
    System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
    System.out.print("You have not selected an option yet, please choose a number of the following operations. If none are desired, put 0 in the blank. \n1. Minimum and maximum\n2. Raised to the power of 2\n3. Raise a base to a power of choice\n4. Rounding\n5. Absolute Value\nChooose the number of the operand you would like to do: ");
    int optionSelect = in.nextInt();
 
        if (optionSelect == 1) {
            System.out.print("Please enter one of the two numbers: ");
            double Num1 = in.nextDouble();
                System.out.print("Please enter the second of the two numbers: ");
                double Num2 = in.nextDouble();
                    int maximumAnswer = (int)Math.max(Num1,Num2);
                    int minimumAnswer = (int)Math.min(Num1,Num2);
                        System.out.println("\n----------------------------------------------------------\n");
                        System.out.println("You imput the numbers " + Num1 + " and " + Num2 + ".");
                        System.out.println("The minimum of the two numbers is: " + minimumAnswer);
                        System.out.println("The maximum of the two numbers is: " + maximumAnswer);
                        System.out.println("\n----------------------------------------------------------\n");
        } else if (optionSelect == 2) {
            System.out.print("Please enter the number you want raised to the power of 2: ");
            double Num1 = in.nextDouble();
                double raisedNum = Math.pow(Num1,2);
                System.out.println("\n----------------------------------------------------------\n");
                System.out.println(Num1 + " raised to the power of 2 is " + raisedNum);
                System.out.println("\n----------------------------------------------------------\n");
        } else if (optionSelect == 3) {
            System.out.print("Please enter the number you want raised to your power: ");
            double Num1 = in.nextDouble();
            System.out.print("Please enter your power: ");
            int Num2 = in.nextInt();
                double raisedNum = Math.pow(Num1,Num2);
                System.out.println("\n----------------------------------------------------------\n");
                System.out.println(Num1 + " raised to the power of " + Num2 + " is " + raisedNum);
                System.out.println("\n----------------------------------------------------------\n");
        } else if (optionSelect == 4) {
            System.out.print("Please enter up to 4 numbers to round to the nearest whole, starting below.\nNOTE: IF NO NUMBER TO ROUND, PUT 0!\n\nNumber 1: ");
            double Num1 = in.nextDouble();
            System.out.print("Number 2: ");
            double Num2 = in.nextDouble();
            System.out.print("Number 3: ");
            double Num3 = in.nextDouble();
            System.out.print("Number 4: ");
            double Num4 = in.nextDouble();
                int num1Round = (int)Math.round(Num1);
                int num2Round = (int)Math.round(Num2);
                int num3Round = (int)Math.round(Num3);
                int num4Round = (int)Math.round(Num4);
                    System.out.println("\n------------------------ Answers --------------------------\n");
                    System.out.println("Number 1 rounded: " + num1Round);
                    System.out.println("Number 2 rounded: " + num2Round);
                    System.out.println("Number 3 rounded: " + num3Round);
                    System.out.println("Number 4 rounded: " + num4Round);
                    System.out.println("\n----------------------------------------------------------\n");
        } else if (optionSelect == 5) {
            System.out.print("Please imput the number you would like to take the absolute value of: ");
            double Num1 = in.nextDouble();
            double absolute = Math.abs(Num1);
            System.out.println("\n----------------------------------------------------------\n");
            System.out.println("Your answer is: " + absolute);
            System.out.println("\n----------------------------------------------------------\n");
        } else if (optionSelect == 0) {
            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
            System.out.print("You have selected the none option.\nWould you like to do problem solving? (y/n)\nEnter your answer here: ");
            char agreeOperands = in.next().charAt(0);
            
//------------------------------------------------------------------------------------------------------------------------------------------
            if (agreeOperands == 'y') {
                    System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                    System.out.print("How many numbers does your problem have?\nNOTICE: THIS CANNOT COMPUTATE VARIABLES! ONLY INTEGERS!\nEnter the number of numbers your problem has here (Can go up to 5 and to at least 2): ");
                    int integerNum = in.nextInt();

//------------------------------------------------------------------------------------------------------------------------------------------

                        if (integerNum == 2) {
                            System.out.print("What operation would you like to do?\n1. Multiplication\n2. Division\n3. Addition\n4. Subtraction\n\nEnter your answer here: ");
                            int operandNum = in.nextInt();

                                if (operandNum == 1) {
                                    System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                    System.out.print("Please enter the first number of the two you would like to multiply: ");
                                    double Num1 = in.nextDouble();
                                    System.out.print("Please enter the second number of the two you would like to multiply: ");
                                    double Num2 = in.nextDouble();
                                        double Answer = Num1 * Num2;
                                            System.out.print("Your answer is: " + Answer);
                                } else if (operandNum == 2) {
                                    System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                    System.out.print("Please enter the first number of the two you would like to divide: ");
                                    double Num1 = in.nextDouble();
                                    System.out.print("Please enter the second number of the two you would like to divide: ");
                                    double Num2 = in.nextDouble();
                                        double Answer = Num1 / Num2;
                                            System.out.print("Your answer is: " + Answer);
                                } else if (operandNum == 3) {
                                    System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                    System.out.print("Please enter the first number of the two you would like to add: ");
                                    double Num1 = in.nextDouble();
                                    System.out.print("Please enter the second number of the two you would like to add: ");
                                    double Num2 = in.nextDouble();
                                        double Answer = Num1 + Num2;
                                            System.out.print("Your answer is: " + Answer);
                                } else if (operandNum == 4) {
                                    System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                    System.out.print("Please enter the first number of the two you would like to subtract: ");
                                    double Num1 = in.nextDouble();
                                    System.out.print("Please enter the second number of the two you would like to subtract: ");
                                    double Num2 = in.nextDouble();
                                        double Answer = Num1 - Num2;
                                            System.out.print("Your answer is: " + Answer);
                                }

//------------------------------------------------------------------------------------------------------------------------------------------

                        } else if (integerNum == 3) {
                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                            System.out.print("What is the first number? Enter it here: ");
                                double Num1 = in.nextDouble();
                            System.out.print("What operation would you like to do first?\n1. Multiplication\n2. Division\n3. Addition\n4. Subtraction\n\nEnter your answer here: ");
                                int operand1 = in.nextInt();
                            System.out.print("What is the second number? Enter it here: ");
                                double Num2 = in.nextDouble();
                            System.out.print("What operation would you like to do second?\n1. Multiplication\n2. Division\n3. Addition\n4. Subtraction\n\nEnter your answer here: ");
                                int operand2 = in.nextInt();
                            System.out.print("What is the third number? Enter it here: ");
                                double Num3 = in.nextDouble();

                                    if (operand1 == 1) {
                                        if (operand2 == 1) {
                                            double Answer = Num1 * Num2 * Num3;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                        } else if (operand2 == 2) {
                                            double Answer = Num1 * Num2 / Num3;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                        } else if (operand2 == 3) {
                                            double Answer = Num1 * Num2 + Num3;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                        } else if (operand2 == 4) {
                                            double Answer = Num1 * Num2 - Num3;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                        }
                                    } else if (operand1 == 2) {
                                        if (operand2 == 1) {
                                            double Answer = Num1 / Num2 * Num3;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                        } else if (operand2 == 2) {
                                            double Answer = Num1 / Num2 / Num3;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                        } else if (operand2 == 3) {
                                            double Answer = Num1 / Num2 + Num3;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                        } else if (operand2 == 4) {
                                            double Answer = Num1 / Num2 - Num3;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                        }
                                    } else if (operand1 == 3) {
                                        if (operand2 == 1) {
                                            double Answer = Num1 + Num2 * Num3;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                        } else if (operand2 == 2) {
                                            double Answer = Num1 + Num2 / Num3;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                        } else if (operand2 == 3) {
                                            double Answer = Num1 + Num2 + Num3;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                        } else if (operand2 == 4) {
                                            double Answer = Num1 + Num2 - Num3;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                        }
                                    } else if (operand1 == 4) {
                                        if (operand2 == 1) {
                                            double Answer = Num1 - Num2 * Num3;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                        } else if (operand2 == 2) {
                                            double Answer = Num1 - Num2 / Num3;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                        } else if (operand2 == 3) {
                                            double Answer = Num1 - Num2 + Num3;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                        } else if (operand2 == 4) {
                                            double Answer = Num1 - Num2 - Num3;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                        }
                                    }
                        
//------------------------------------------------------------------------------------------------------------------------------------------

                        } else if (integerNum == 4) {
                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                            System.out.print("What is the first number? Enter it here: ");
                                double Num1 = in.nextDouble();
                            System.out.print("What operation would you like to do first?\n1. Multiplication\n2. Division\n3. Addition\n4. Subtraction\n\nEnter your answer here: ");
                                int operand1 = in.nextInt();
                            System.out.print("What is the second number? Enter it here: ");
                                double Num2 = in.nextDouble();
                            System.out.print("What operation would you like to do second?\n1. Multiplication\n2. Division\n3. Addition\n4. Subtraction\n\nEnter your answer here: ");
                                int operand2 = in.nextInt();
                            System.out.print("What is the third number? Enter it here: ");
                                double Num3 = in.nextDouble();
                            System.out.print("What operation would you like to do second?\n1. Multiplication\n2. Division\n3. Addition\n4. Subtraction\n\nEnter your answer here: ");
                                int operand3 = in.nextInt();
                            System.out.print("What is the fourth number? Enter it here: ");
                                double Num4 = in.nextDouble();

                                    if (operand1 == 1) {
                                        if (operand2 == 1) {
                                            if (operand3 == 1) {
                                            double Answer = Num1 * Num2 * Num3 * Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 2) {
                                            double Answer = Num1 * Num2 * Num3 / Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 3) {
                                            double Answer = Num1 * Num2 * Num3 + Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 4) {
                                            double Answer = Num1 * Num2 * Num3 - Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            }
                                        } else if (operand2 == 2) {
                                            if (operand3 == 1) {
                                            double Answer = Num1 * Num2 / Num3 * Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 2) {
                                            double Answer = Num1 * Num2 / Num3 / Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 3) {
                                            double Answer = Num1 * Num2 / Num3 + Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 4) {
                                            double Answer = Num1 * Num2 / Num3 - Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            }
                                        } else if (operand2 == 3) {
                                            if (operand3 == 1) {
                                            double Answer = Num1 * Num2 + Num3 * Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 2) {
                                            double Answer = Num1 * Num2 + Num3 / Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 3) {
                                            double Answer = Num1 * Num2 + Num3 + Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 4) {
                                            double Answer = Num1 * Num2 + Num3 - Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            }
                                        } else if (operand2 == 4) {
                                            if (operand3 == 1) {
                                            double Answer = Num1 * Num2 - Num3 * Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 2) {
                                            double Answer = Num1 * Num2 - Num3 / Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 3) {
                                            double Answer = Num1 * Num2 - Num3 + Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 4) {
                                            double Answer = Num1 * Num2 - Num3 - Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            }
                                        }
            
                                    } else if (operand1 == 2) {
                                        if (operand2 == 1) {
                                            if (operand3 == 1) {
                                            double Answer = Num1 / Num2 * Num3 * Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 2) {
                                            double Answer = Num1 / Num2 * Num3 / Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 3) {
                                            double Answer = Num1 / Num2 * Num3 + Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 4) {
                                            double Answer = Num1 / Num2 * Num3 - Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            }
                                        } else if (operand2 == 2) {
                                            if (operand3 == 1) {
                                            double Answer = Num1 / Num2 / Num3 * Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 2) {
                                            double Answer = Num1 / Num2 / Num3 / Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 3) {
                                            double Answer = Num1 / Num2 / Num3 + Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 4) {
                                            double Answer = Num1 / Num2 / Num3 - Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            }
                                        } else if (operand2 == 3) {
                                            if (operand3 == 1) {
                                            double Answer = Num1 / Num2 + Num3 * Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 2) {
                                            double Answer = Num1 / Num2 + Num3 / Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 3) {
                                            double Answer = Num1 / Num2 + Num3 + Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 4) {
                                            double Answer = Num1 / Num2 + Num3 - Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            }
                                        } else if (operand2 == 4) {
                                            if (operand3 == 1) {
                                            double Answer = Num1 / Num2 - Num3 * Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 2) {
                                            double Answer = Num1 / Num2 - Num3 / Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 3) {
                                            double Answer = Num1 / Num2 - Num3 + Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 4) {
                                            double Answer = Num1 / Num2 - Num3 - Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            }
                                        }

                                    } else if (operand1 == 3) {
                                        if (operand2 == 1) {
                                            if (operand3 == 1) {
                                            double Answer = Num1 + Num2 * Num3 * Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 2) {
                                            double Answer = Num1 + Num2 * Num3 / Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 3) {
                                            double Answer = Num1 + Num2 * Num3 + Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 4) {
                                            double Answer = Num1 + Num2 * Num3 - Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            }
                                        } else if (operand2 == 2) {
                                            if (operand3 == 1) {
                                            double Answer = Num1 + Num2 / Num3 * Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 2) {
                                            double Answer = Num1 + Num2 / Num3 / Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 3) {
                                            double Answer = Num1 + Num2 / Num3 + Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 4) {
                                            double Answer = Num1 + Num2 / Num3 - Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            }
                                        } else if (operand2 == 3) {
                                            if (operand3 == 1) {
                                            double Answer = Num1 + Num2 + Num3 * Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 2) {
                                            double Answer = Num1 + Num2 + Num3 / Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 3) {
                                            double Answer = Num1 + Num2 + Num3 + Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 4) {
                                            double Answer = Num1 + Num2 + Num3 - Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            }
                                        } else if (operand2 == 4) {
                                            if (operand3 == 1) {
                                            double Answer = Num1 + Num2 - Num3 * Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 2) {
                                            double Answer = Num1 + Num2 - Num3 / Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 3) {
                                            double Answer = Num1 + Num2 - Num3 + Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 4) {
                                            double Answer = Num1 + Num2 - Num3 - Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            }
                                        }

                                    } else if (operand1 == 4) {
                                        if (operand2 == 1) {
                                            if (operand3 == 1) {
                                            double Answer = Num1 - Num2 * Num3 * Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 2) {
                                            double Answer = Num1 - Num2 * Num3 / Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 3) {
                                            double Answer = Num1 - Num2 * Num3 + Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 4) {
                                            double Answer = Num1 - Num2 * Num3 - Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            }
                                        } else if (operand2 == 2) {
                                            if (operand3 == 1) {
                                            double Answer = Num1 - Num2 / Num3 * Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 2) {
                                            double Answer = Num1 - Num2 / Num3 / Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 3) {
                                            double Answer = Num1 - Num2 / Num3 + Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 4) {
                                            double Answer = Num1 - Num2 / Num3 - Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            }
                                        } else if (operand2 == 3) {
                                            if (operand3 == 1) {
                                            double Answer = Num1 - Num2 + Num3 * Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 2) {
                                            double Answer = Num1 - Num2 + Num3 / Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 3) {
                                            double Answer = Num1 - Num2 + Num3 + Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 4) {
                                            double Answer = Num1 - Num2 + Num3 - Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            }
                                        } else if (operand2 == 4) {
                                            if (operand3 == 1) {
                                            double Answer = Num1 - Num2 - Num3 * Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 2) {
                                            double Answer = Num1 - Num2 - Num3 / Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 3) {
                                            double Answer = Num1 - Num2 - Num3 + Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            } else if (operand3 == 4) {
                                            double Answer = Num1 - Num2 - Num3 - Num4;
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            System.out.println("Your answer is: " + Answer);
                                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                            }
                                        }
                                    }

//------------------------------------------------------------------------------------------------------------------------------------------

                        } else if (integerNum == 5) {
                            System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                            System.out.print("What is the first number? Enter it here: ");
                                double Num1 = in.nextDouble();
                            System.out.print("What operation would you like to do first?\n1. Multiplication\n2. Division\n3. Addition\n4. Subtraction\n\nEnter your answer here: ");
                                int operand1 = in.nextInt();
                            System.out.print("What is the second number? Enter it here: ");
                                double Num2 = in.nextDouble();
                            System.out.print("What operation would you like to do second?\n1. Multiplication\n2. Division\n3. Addition\n4. Subtraction\n\nEnter your answer here: ");
                                int operand2 = in.nextInt();
                            System.out.print("What is the third number? Enter it here: ");
                                double Num3 = in.nextDouble();
                            System.out.print("What operation would you like to do second?\n1. Multiplication\n2. Division\n3. Addition\n4. Subtraction\n\nEnter your answer here: ");
                                int operand3 = in.nextInt();
                            System.out.print("What is the fourth number? Enter it here: ");
                                double Num4 = in.nextDouble();
                            System.out.print("What operation would you like to do second?\n1. Multiplication\n2. Division\n3. Addition\n4. Subtraction\n\nEnter your answer here: ");
                                int operand4 = in.nextInt();
                            System.out.print("What is the fifth number? Enter it here: ");
                                double Num5 = in.nextDouble();

                                    if (operand1 == 1) {
                                        if (operand2 == 1) {
                                            if (operand3 == 1) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 * Num2 * Num3 * Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 * Num2 * Num3 * Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 * Num2 * Num3 * Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) { 
                                                double Answer = Num1 * Num2 * Num3 * Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                            } else if (operand3 == 2) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 * Num2 * Num3 / Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 * Num2 * Num3 / Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 * Num2 * Num3 / Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) {
                                                double Answer = Num1 * Num2 * Num3 / Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                        } else if (operand3 == 3) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 * Num2 * Num3 + Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 * Num2 * Num3 + Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 * Num2 * Num3 + Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) { 
                                                double Answer = Num1 * Num2 * Num3 + Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                        } 
                                    } else if (operand2 == 2) {
                                            if (operand3 == 1) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 * Num2 / Num3 * Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 * Num2 / Num3 * Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 * Num2 / Num3 * Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) { 
                                                double Answer = Num1 * Num2 / Num3 * Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                            } else if (operand3 == 2) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 * Num2 / Num3 / Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 * Num2 / Num3 / Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 * Num2 / Num3 / Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) {
                                                double Answer = Num1 * Num2 / Num3 / Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                        } else if (operand3 == 3) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 * Num2 / Num3 + Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 * Num2 / Num3 + Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 * Num2 / Num3 + Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) { 
                                                double Answer = Num1 * Num2 / Num3 + Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                        } 
                                    } else if (operand2 == 3) {
                                            if (operand3 == 1) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 * Num2 + Num3 * Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 * Num2 + Num3 * Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 * Num2 + Num3 * Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) { 
                                                double Answer = Num1 * Num2 + Num3 * Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                            } else if (operand3 == 2) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 * Num2 + Num3 / Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 * Num2 + Num3 / Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 * Num2 + Num3 / Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) {
                                                double Answer = Num1 * Num2 + Num3 / Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                        } else if (operand3 == 3) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 * Num2 + Num3 + Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 * Num2 + Num3 + Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 * Num2 + Num3 + Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) { 
                                                double Answer = Num1 * Num2 + Num3 + Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                        } 
                                    } else if (operand2 == 4) {
                                            if (operand3 == 1) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 * Num2 - Num3 * Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 * Num2 - Num3 * Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 * Num2 - Num3 * Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) { 
                                                double Answer = Num1 * Num2 - Num3 * Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                            } else if (operand3 == 2) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 * Num2 - Num3 / Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 * Num2 - Num3 / Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 * Num2 - Num3 / Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) {
                                                double Answer = Num1 * Num2 - Num3 / Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                        } else if (operand3 == 3) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 * Num2 - Num3 + Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 * Num2 - Num3 + Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 * Num2 - Num3 + Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) { 
                                                double Answer = Num1 * Num2 - Num3 + Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                        } 
                                    }
                                } else if (operand1 == 2) {
                                        if (operand2 == 1) {
                                            if (operand3 == 1) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 / Num2 * Num3 * Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 / Num2 * Num3 * Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 / Num2 * Num3 * Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) { 
                                                double Answer = Num1 / Num2 * Num3 * Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                            } else if (operand3 == 2) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 / Num2 * Num3 / Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 / Num2 * Num3 / Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 / Num2 * Num3 / Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) {
                                                double Answer = Num1 / Num2 * Num3 / Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                        } else if (operand3 == 3) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 / Num2 * Num3 + Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 / Num2 * Num3 + Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 / Num2 * Num3 + Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) { 
                                                double Answer = Num1 / Num2 * Num3 + Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                        } 
                                    } else if (operand2 == 2) {
                                            if (operand3 == 1) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 / Num2 / Num3 * Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 / Num2 / Num3 * Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 / Num2 / Num3 * Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) { 
                                                double Answer = Num1 / Num2 / Num3 * Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                            } else if (operand3 == 2) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 / Num2 / Num3 / Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 / Num2 / Num3 / Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 / Num2 / Num3 / Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) {
                                                double Answer = Num1 / Num2 / Num3 / Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                        } else if (operand3 == 3) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 / Num2 / Num3 + Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 / Num2 / Num3 + Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 / Num2 / Num3 + Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) { 
                                                double Answer = Num1 / Num2 / Num3 + Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                        } 
                                    } else if (operand2 == 3) {
                                            if (operand3 == 1) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 / Num2 + Num3 * Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 / Num2 + Num3 * Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 / Num2 + Num3 * Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) { 
                                                double Answer = Num1 / Num2 + Num3 * Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                            } else if (operand3 == 2) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 / Num2 + Num3 / Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 / Num2 + Num3 / Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 / Num2 + Num3 / Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) {
                                                double Answer = Num1 / Num2 + Num3 / Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                        } else if (operand3 == 3) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 / Num2 + Num3 + Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 / Num2 + Num3 + Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 / Num2 + Num3 + Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) { 
                                                double Answer = Num1 / Num2 + Num3 + Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                        } 
                                    } else if (operand2 == 4) {
                                            if (operand3 == 1) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 / Num2 - Num3 * Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 / Num2 - Num3 * Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 / Num2 - Num3 * Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) { 
                                                double Answer = Num1 / Num2 - Num3 * Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                            } else if (operand3 == 2) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 / Num2 - Num3 / Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 / Num2 - Num3 / Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 / Num2 - Num3 / Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) {
                                                double Answer = Num1 / Num2 - Num3 / Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                        } else if (operand3 == 3) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 / Num2 - Num3 + Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 / Num2 - Num3 + Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 / Num2 - Num3 + Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) { 
                                                double Answer = Num1 / Num2 - Num3 + Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                        } 
                                    }
                                } else if (operand1 == 3) {
                                        if (operand2 == 1) {
                                            if (operand3 == 1) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 + Num2 * Num3 * Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 + Num2 * Num3 * Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 + Num2 * Num3 * Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) { 
                                                double Answer = Num1 + Num2 * Num3 * Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                            } else if (operand3 == 2) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 + Num2 * Num3 / Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 + Num2 * Num3 / Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 + Num2 * Num3 / Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) {
                                                double Answer = Num1 + Num2 * Num3 / Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                        } else if (operand3 == 3) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 + Num2 * Num3 + Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 + Num2 * Num3 + Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 + Num2 * Num3 + Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) { 
                                                double Answer = Num1 + Num2 * Num3 + Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                        } 
                                    } else if (operand2 == 2) {
                                            if (operand3 == 1) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 + Num2 / Num3 * Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 + Num2 / Num3 * Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 + Num2 / Num3 * Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) { 
                                                double Answer = Num1 + Num2 / Num3 * Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                            } else if (operand3 == 2) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 + Num2 / Num3 / Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 + Num2 / Num3 / Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 + Num2 / Num3 / Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) {
                                                double Answer = Num1 + Num2 / Num3 / Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                        } else if (operand3 == 3) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 + Num2 / Num3 + Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 + Num2 / Num3 + Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 + Num2 / Num3 + Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) { 
                                                double Answer = Num1 + Num2 / Num3 + Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                        } 
                                    } else if (operand2 == 3) {
                                            if (operand3 == 1) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 + Num2 + Num3 * Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 + Num2 + Num3 * Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 + Num2 + Num3 * Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) { 
                                                double Answer = Num1 + Num2 + Num3 * Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                            } else if (operand3 == 2) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 + Num2 + Num3 / Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 + Num2 + Num3 / Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 + Num2 + Num3 / Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) {
                                                double Answer = Num1 + Num2 + Num3 / Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                        } else if (operand3 == 3) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 + Num2 + Num3 + Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 + Num2 + Num3 + Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 + Num2 + Num3 + Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) { 
                                                double Answer = Num1 + Num2 + Num3 + Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                        } 
                                    } else if (operand2 == 4) {
                                            if (operand3 == 1) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 + Num2 - Num3 * Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 + Num2 - Num3 * Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 + Num2 - Num3 * Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) { 
                                                double Answer = Num1 + Num2 - Num3 * Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                            } else if (operand3 == 2) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 + Num2 - Num3 / Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 + Num2 - Num3 / Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 + Num2 - Num3 / Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) {
                                                double Answer = Num1 + Num2 - Num3 / Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                        } else if (operand3 == 3) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 + Num2 - Num3 + Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 + Num2 - Num3 + Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 + Num2 - Num3 + Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) { 
                                                double Answer = Num1 + Num2 - Num3 + Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                        } 
                                    }
                                } else if (operand1 == 4) {
                                        if (operand2 == 1) {
                                            if (operand3 == 1) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 - Num2 * Num3 * Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 - Num2 * Num3 * Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 - Num2 * Num3 * Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) { 
                                                double Answer = Num1 - Num2 * Num3 * Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                            } else if (operand3 == 2) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 - Num2 * Num3 / Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 - Num2 * Num3 / Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 - Num2 * Num3 / Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) {
                                                double Answer = Num1 - Num2 * Num3 / Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                        } else if (operand3 == 3) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 - Num2 * Num3 + Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 - Num2 * Num3 + Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 - Num2 * Num3 + Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) { 
                                                double Answer = Num1 - Num2 * Num3 + Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                        } 
                                    } else if (operand2 == 2) {
                                            if (operand3 == 1) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 - Num2 / Num3 * Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 - Num2 / Num3 * Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 - Num2 / Num3 * Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) { 
                                                double Answer = Num1 - Num2 / Num3 * Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                            } else if (operand3 == 2) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 - Num2 / Num3 / Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 - Num2 / Num3 / Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 - Num2 / Num3 / Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) {
                                                double Answer = Num1 - Num2 / Num3 / Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                        } else if (operand3 == 3) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 - Num2 / Num3 + Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 - Num2 / Num3 + Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 - Num2 / Num3 + Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) { 
                                                double Answer = Num1 - Num2 / Num3 + Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                        } 
                                    } else if (operand2 == 3) {
                                            if (operand3 == 1) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 - Num2 + Num3 * Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 - Num2 + Num3 * Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 - Num2 + Num3 * Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) { 
                                                double Answer = Num1 - Num2 + Num3 * Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                            } else if (operand3 == 2) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 - Num2 + Num3 / Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 - Num2 + Num3 / Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 - Num2 + Num3 / Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) {
                                                double Answer = Num1 - Num2 + Num3 / Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                        } else if (operand3 == 3) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 - Num2 + Num3 + Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 - Num2 + Num3 + Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 - Num2 + Num3 + Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) { 
                                                double Answer = Num1 - Num2 + Num3 + Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                        } 
                                    } else if (operand2 == 4) {
                                            if (operand3 == 1) {
                                                if (operand4 == 1) {
                                                double Answer = Num1 - Num2 - Num3 * Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 - Num2 - Num3 * Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 - Num2 - Num3 * Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) { 
                                                double Answer = Num1 - Num2 - Num3 * Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                            } else if (operand3 == 2) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 - Num2 - Num3 / Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 - Num2 - Num3 / Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 - Num2 - Num3 / Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) {
                                                double Answer = Num1 - Num2 - Num3 / Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                        } else if (operand3 == 3) {
                                                if (operand4 == 1) { 
                                                double Answer = Num1 - Num2 - Num3 + Num4 * Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 2) { 
                                                double Answer = Num1 - Num2 - Num3 + Num4 / Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 3) { 
                                                double Answer = Num1 - Num2 - Num3 + Num4 + Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                } else if (operand4 == 4) { 
                                                double Answer = Num1 - Num2 - Num3 + Num4 - Num5;
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                System.out.println("Your answer is: " + Answer);
                                                System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                                                }
                                        } 
                                    }
                                }
                        }

//------------------------------------------------------------------------------------------------------------------------------------------
                    
                
                } else if (agreeOperands == 'n') {
                    System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------\n");
                    System.out.println(" Version 2 of The Matrix Calculator does not support any more functions. Please find a different calculator or wait for the next version.");
                    System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------\n");
                }
        }
                    }  
                }  
            }
        }
    } 
} 