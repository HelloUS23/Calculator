import java.util.Scanner;
public class CalculatorV3 //Change this to Main in online running program linked in the ReadME
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
    System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
    System.out.println("Welcome to: The Matrix Calculator V3\nNOTICE: Please put all fractions in decimal form.");

//--------------------------------------------------------------------------------------------------------------------------------
System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
System.out.print("Would you like to solve for the roots of a quadratic equation? (yes/no)\nEnter your answer here: ");
char agreeEquation = in.next().charAt(0);

  if (agreeEquation == 'y') {
  System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
  System.out.println("The formula for the quadratic equation is ax^2+bx+c=0 ");  
  System.out.print("Please enter the value of A: ");  
    double a = in.nextDouble();  
  System.out.print("Enter the value of B: ");  
    double b = in.nextDouble();  
  System.out.print("Enter the value of C: ");  
    double c = in.nextDouble();  
      
      double d = b * b - 4.0 * a * c;  
  if (d> 0.0) {  
    double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
    double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);  
    System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
    System.out.println("The roots are " + r1 + " and " + r2);  
    System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
  } else if (d == 0.0) {  
  double r1 = -b / (2.0 * a);  
  System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
  System.out.println("The root is " + r1);  
  System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
  } else {  
    System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
    System.out.println("Roots are not real.");  
    System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
  }  
    } else if (agreeEquation == 'n') {
System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
System.out.print("Would you like to do one of the following operations? If none are desired, put 0 in the blank. \n1. Minimum and maximum\n2. Raised to the power of 2\n3. Raise a base to a power of choice\n4. Rounding\n5. Absolute Value\nChooose the number of the operand you would like to do: ");
  int optionSelect = in .nextInt();

    if (optionSelect == 1) {
      System.out.print("Please enter one of the two numbers: ");
        double Num1 = in .nextDouble();
      System.out.print("Please enter the second of the two numbers: ");
        double Num2 = in .nextDouble();
          int maximumAnswer = (int) Math.max(Num1, Num2);
          int minimumAnswer = (int) Math.min(Num1, Num2);
              System.out.println("\n----------------------------------------------------------\n");
              System.out.println("You imput the numbers " + Num1 + " and " + Num2 + ".");
              System.out.println("The minimum of the two numbers is: " + minimumAnswer);
              System.out.println("The maximum of the two numbers is: " + maximumAnswer);
              System.out.println("\n----------------------------------------------------------\n");
    } else if (optionSelect == 2) {
      System.out.print("Please enter the number you want raised to the power of 2: ");
        double Num1 = in .nextDouble();
        double raisedNum = Math.pow(Num1, 2);
              System.out.println("\n----------------------------------------------------------\n");
              System.out.println(Num1 + " raised to the power of 2 is " + raisedNum);
              System.out.println("\n----------------------------------------------------------\n");
    } else if (optionSelect == 3) {
      System.out.print("Please enter the number you want raised to your power: ");
        double Num1 = in .nextDouble();
      System.out.print("Please enter your power: ");
        int Num2 = in .nextInt();
          double raisedNum = Math.pow(Num1, Num2);
              System.out.println("\n----------------------------------------------------------\n");
              System.out.println(Num1 + " raised to the power of " + Num2 + " is " + raisedNum);
              System.out.println("\n----------------------------------------------------------\n");
    } else if (optionSelect == 4) {
      System.out.print("Please enter up to 4 numbers to round to the nearest whole, starting below.\nNOTE: IF NO NUMBER TO ROUND, PUT 0!\n\nNumber 1: ");
        double Num1 = in .nextDouble();
      System.out.print("Number 2: ");
        double Num2 = in .nextDouble();
      System.out.print("Number 3: ");
        double Num3 = in .nextDouble();
      System.out.print("Number 4: ");
        double Num4 = in .nextDouble();
          int num1Round = (int) Math.round(Num1);
          int num2Round = (int) Math.round(Num2);
          int num3Round = (int) Math.round(Num3);
          int num4Round = (int) Math.round(Num4);
              System.out.println("\n------------------------ Answers --------------------------\n");
              System.out.println("Number 1 rounded: " + num1Round);
              System.out.println("Number 2 rounded: " + num2Round);
              System.out.println("Number 3 rounded: " + num3Round);
              System.out.println("Number 4 rounded: " + num4Round);
              System.out.println("\n----------------------------------------------------------\n");
    } else if (optionSelect == 5) {
      System.out.print("Please imput the number you would like to take the absolute value of: ");
        double Num1 = in .nextDouble();
        double absolute = Math.abs(Num1);
              System.out.println("\n----------------------------------------------------------\n");
              System.out.println("Your answer is: " + absolute);
              System.out.println("\n----------------------------------------------------------\n");
  } else if (optionSelect == 0) {
System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
System.out.print("Would you like to just put in two numbers and recieve output? (yes/no)\nEnter your answer here: ");
  char agreeOutput = in.next().charAt(0);
  
  if (agreeOutput == 'y') {
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
  } else if (agreeOutput == 'n') {
    System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
    System.out.print("Would you like to do problem solving? (yes/no)\nEnter your answer here: ");
    char agreeSolve = in.next().charAt(0);

    if (agreeSolve == 'y') {
       System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                System.out.print("How many numbers does your problem have?\nNOTICE: THIS CANNOT COMPUTATE VARIABLES! ONLY INTEGERS!\nEnter the number of numbers your problem has here (Can go up to 5 and to at least 2): ");
                int integerNum = in .nextInt();

                //------------------------------------------------------------------------------------------------------------------------------------------

                if (integerNum == 2) {
                  System.out.print("What operation would you like to do?\n1. Multiplication\n2. Division\n3. Addition\n4. Subtraction\n\nEnter your answer here: ");
                  int operandNum = in .nextInt();

                  if (operandNum == 1) {
                    System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                    System.out.print("Please enter the first number of the two you would like to multiply: ");
                    double Num1 = in .nextDouble();
                    System.out.print("Please enter the second number of the two you would like to multiply: ");
                    double Num2 = in .nextDouble();
                    double Answer = Num1 * Num2;
                    System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                    System.out.println("You put in the equation " + Num1 + " * " + Num2);
                    System.out.println("Your answer is: " + Answer);
                    System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                  } else if (operandNum == 2) {
                    System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                    System.out.print("Please enter the first number of the two you would like to divide: ");
                    double Num1 = in .nextDouble();
                    System.out.print("Please enter the second number of the two you would like to divide: ");
                    double Num2 = in .nextDouble();
                    double Answer = Num1 / Num2;
                    System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                    System.out.println("You put in the equation " + Num1 + " / " + Num2);
                    System.out.println("Your answer is: " + Answer);
                    System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                  } else if (operandNum == 3) {
                    System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                    System.out.print("Please enter the first number of the two you would like to add: ");
                    double Num1 = in .nextDouble();
                    System.out.print("Please enter the second number of the two you would like to add: ");
                    double Num2 = in .nextDouble();
                    double Answer = Num1 + Num2;
                    System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                    System.out.println("You put in the equation " + Num1 + " + " + Num2);
                    System.out.println("Your answer is: " + Answer);
                    System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                  } else if (operandNum == 4) {
                    System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                    System.out.print("Please enter the first number of the two you would like to subtract: ");
                    double Num1 = in .nextDouble();
                    System.out.print("Please enter the second number of the two you would like to subtract: ");
                    double Num2 = in .nextDouble();
                    double Answer = Num1 - Num2;
                    System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                    System.out.println("You put in the equation " + Num1 + " - " + Num2);
                    System.out.println("Your answer is: " + Answer);
                    System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                  }

                  //------------------------------------------------------------------------------------------------------------------------------------------

                } else if (integerNum == 3) {
                  System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                  System.out.print("What is the first number? Enter it here: ");
                  double Num1 = in .nextDouble();
                  System.out.print("What operation would you like to do first?\n1. Multiplication\n2. Division\n3. Addition\n4. Subtraction\n\nEnter your answer here: ");
                  int operand1 = in .nextInt();
                  System.out.print("What is the second number? Enter it here: ");
                  double Num2 = in .nextDouble();
                  System.out.print("What operation would you like to do second?\n1. Multiplication\n2. Division\n3. Addition\n4. Subtraction\n\nEnter your answer here: ");
                  int operand2 = in .nextInt();
                  System.out.print("What is the third number? Enter it here: ");
                  double Num3 = in .nextDouble();

                  if (operand1 == 1) {
                    if (operand2 == 1) {
                      double Answer = Num1 * Num2 * Num3;
                      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                      System.out.println("You put in the equation " + Num1 + " * " + Num2 + " * " + Num3);
                      System.out.println("Your answer is: " + Answer);
                      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                    } else if (operand2 == 2) {
                      double Answer = Num1 * Num2 / Num3;
                      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                      System.out.println("You put in the equation " + Num1 + " * " + Num2 + " / " + Num3);
                      System.out.println("Your answer is: " + Answer);
                      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                    } else if (operand2 == 3) {
                      double Answer = Num1 * Num2 + Num3;
                      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                      System.out.println("You put in the equation " + Num1 + " * " + Num2 + " + " + Num3);
                      System.out.println("Your answer is: " + Answer);
                      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                    } else if (operand2 == 4) {
                      double Answer = Num1 * Num2 - Num3;
                      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                      System.out.println("You put in the equation " + Num1 + " * " + Num2 + " - " + Num3);
                      System.out.println("Your answer is: " + Answer);
                      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                    }
                  } else if (operand1 == 2) {
                    if (operand2 == 1) {
                      double Answer = Num1 / Num2 * Num3;
                      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                      System.out.println("You put in the equation " + Num1 + " / " + Num2 + " * " + Num3);
                      System.out.println("Your answer is: " + Answer);
                      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                    } else if (operand2 == 2) {
                      double Answer = Num1 / Num2 / Num3;
                      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                      System.out.println("You put in the equation " + Num1 + " / " + Num2 + " / " + Num3);
                      System.out.println("Your answer is: " + Answer);
                      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                    } else if (operand2 == 3) {
                      double Answer = Num1 / Num2 + Num3;
                      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                      System.out.println("You put in the equation " + Num1 + " / " + Num2 + " + " + Num3);
                      System.out.println("Your answer is: " + Answer);
                      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                    } else if (operand2 == 4) {
                      double Answer = Num1 / Num2 - Num3;
                      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                      System.out.println("You put in the equation " + Num1 + " / " + Num2 + " - " + Num3);
                      System.out.println("Your answer is: " + Answer);
                      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                    }
                  } else if (operand1 == 3) {
                    if (operand2 == 1) {
                      double Answer = Num1 + Num2 * Num3;
                      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                      System.out.println("You put in the equation " + Num1 + " + " + Num2 + " * " + Num3);
                      System.out.println("Your answer is: " + Answer);
                      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                    } else if (operand2 == 2) {
                      double Answer = Num1 + Num2 / Num3;
                      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                      System.out.println("You put in the equation " + Num1 + " + " + Num2 + " / " + Num3);
                      System.out.println("Your answer is: " + Answer);
                      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                    } else if (operand2 == 3) {
                      double Answer = Num1 + Num2 + Num3;
                      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                      System.out.println("You put in the equation " + Num1 + " + " + Num2 + " + " + Num3);
                      System.out.println("Your answer is: " + Answer);
                      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                    } else if (operand2 == 4) {
                      double Answer = Num1 + Num2 - Num3;
                      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                      System.out.println("You put in the equation " + Num1 + " + " + Num2 + " - " + Num3);
                      System.out.println("Your answer is: " + Answer);
                      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                    }
                  } else if (operand1 == 4) {
                    if (operand2 == 1) {
                      double Answer = Num1 - Num2 * Num3;
                      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                      System.out.println("You put in the equation " + Num1 + " - " + Num2 + " * " + Num3);
                      System.out.println("Your answer is: " + Answer);
                      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                    } else if (operand2 == 2) {
                      double Answer = Num1 - Num2 / Num3;
                      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                      System.out.println("You put in the equation " + Num1 + " - " + Num2 + " / " + Num3);
                      System.out.println("Your answer is: " + Answer);
                      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                    } else if (operand2 == 3) {
                      double Answer = Num1 - Num2 + Num3;
                      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                      System.out.println("You put in the equation " + Num1 + " - " + Num2 + " + " + Num3);
                      System.out.println("Your answer is: " + Answer);
                      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                    } else if (operand2 == 4) {
                      double Answer = Num1 - Num2 - Num3;
                      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                      System.out.println("You put in the equation " + Num1 + " - " + Num2 + " - " + Num3);
                      System.out.println("Your answer is: " + Answer);
                      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                    }
                  }

                  //------------------------------------------------------------------------------------------------------------------------------------------

                } else if (integerNum == 4) {
                  System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
                  System.out.print("What is the first number? Enter it here: ");
                  double Num1 = in .nextDouble();
                  System.out.print("What operation would you like to do first?\n1. Multiplication\n2. Division\n3. Addition\n4. Subtraction\n\nEnter your answer here: ");
                  int operand1 = in .nextInt();
                  System.out.print("What is the second number? Enter it here: ");
                  double Num2 = in .nextDouble();
                  System.out.print("What operation would you like to do second?\n1. Multiplication\n2. Division\n3. Addition\n4. Subtraction\n\nEnter your answer here: ");
                  int operand2 = in .nextInt();
                  System.out.print("What is the third number? Enter it here: ");
                  double Num3 = in .nextDouble();
                  System.out.print("What operation would you like to do second?\n1. Multiplication\n2. Division\n3. Addition\n4. Subtraction\n\nEnter your answer here: ");
                  int operand3 = in .nextInt();
                  System.out.print("What is the fourth number? Enter it here: ");
                  double Num4 = in .nextDouble();

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
                  double Num1 = in .nextDouble();
                  System.out.print("What operation would you like to do first?\n1. Multiplication\n2. Division\n3. Addition\n4. Subtraction\n\nEnter your answer here: ");
                  int operand1 = in .nextInt();
                  System.out.print("What is the second number? Enter it here: ");
                  double Num2 = in .nextDouble();
                  System.out.print("What operation would you like to do second?\n1. Multiplication\n2. Division\n3. Addition\n4. Subtraction\n\nEnter your answer here: ");
                  int operand2 = in .nextInt();
                  System.out.print("What is the third number? Enter it here: ");
                  double Num3 = in .nextDouble();
                  System.out.print("What operation would you like to do second?\n1. Multiplication\n2. Division\n3. Addition\n4. Subtraction\n\nEnter your answer here: ");
                  int operand3 = in .nextInt();
                  System.out.print("What is the fourth number? Enter it here: ");
                  double Num4 = in .nextDouble();
                  System.out.print("What operation would you like to do second?\n1. Multiplication\n2. Division\n3. Addition\n4. Subtraction\n\nEnter your answer here: ");
                  int operand4 = in .nextInt();
                  System.out.print("What is the fifth number? Enter it here: ");
                  double Num5 = in .nextDouble();

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
    } if (agreeSolve == 'n') {
      System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
      System.out.print("Would you like to do trig functions? (yes/no)\nEnter your answer here: ");
      char trigFunction = in.next().charAt(0);

      if (trigFunction == 'y'){
        System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.print("Would you like to do sine, cosine, or tangent?\nEnter your answer here: ");
        char trigOperation = in.next().charAt(0);

        if(trigOperation == 's') {
          System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
          System.out.print("What are the degrees of the shape? ");
        double degrees = in.nextDouble();
        double radians = Math.toRadians(degrees);
        double sinValue = Math.sin(radians);
        System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println("sin(" + degrees + ") = " + sinValue);
        System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");

        } else if (trigOperation == 'c') {
          System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
          System.out.print("What are the degrees of the shape? ");
        double degrees = in.nextDouble();
        double radians = Math.toRadians(degrees);
        double cosValue = Math.cos(radians);
        System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println("cos(" + degrees + ") = " + cosValue);
        System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");

        } else if (trigOperation == 't') {
          System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
          System.out.print("What are the degrees of the shape? ");
        double degrees = in.nextDouble();
        double radians = Math.toRadians(degrees);
        double tanValue = Math.tan(radians);
        System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println("tan(" + degrees + ") = " + tanValue);
        System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
        }
      } if (trigFunction == 'n') {
        System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------\n");
                System.out.println(" Version 3 (final) of The Matrix Calculator does not yet support any more functions. Please find a different calculator.");
                System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------\n");
      }
    }
  }
      }
    }
  }
}