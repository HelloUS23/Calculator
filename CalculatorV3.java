import java.util.Scanner;
public class CalculatorV3 //Change this to Main in online running program linked in the ReadME
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
    System.out.println("Welcome to: The Matrix Calculator V3\nNOTICE: Please put all fractions in decimal form.");

//--------------------------------------------------------------------------------------------------------------------------------
System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------\n");
System.out.print("Please enter your equation, seperating every new number and operator by a space (Equation cannot include variables): ");
  String equation = in.nextLine();

    String Num1 = equation.substring(0,equation.indexOf(' '));


 