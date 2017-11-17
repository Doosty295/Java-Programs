package graded.input;

/*
Java Program 10
Programming With Java Period 3
Written in Atom 1.22.1 x64
Compiled in NetBeans IDE 8.2
Written By Dustin LeGars
Written on 11/16/2017 at 10:00
{>===----===<}
Intent:
  Take 10 inputs and average them.
  Use a For loop.
{>===----===<}
*/

 import java.util.Scanner;
/**
 *
 * @author 9djl001
 */
public class GradedInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Scanner
        Scanner input = new Scanner(System.in);

        //Declarations
        int repeat = 0;


        //Repeater
        do {
          //Grade Declarations and Initializations
            double valueA = 0;
            double valueB = 0;
            double valueC = 0;
            double valueD = 0;
            double valueE = 0;
            double valueF = 0;
            double valueG = 0;
            double valueH = 0;
            double valueI = 0;
            double valueJ = 0;

          //Input request and response
            System.out.println("Please input the value for grade one.");
            valueA = input.nextDouble();

            System.out.println("Please input the value for grade two.");
            valueB = input.nextDouble();

            System.out.println("Please input the value for grade three.");
            valueC = input.nextDouble();

            System.out.println("Please input the value for grade four.");
            valueD = input.nextDouble();

            System.out.println("Please input the value for grade five.");
            valueE = input.nextDouble();

            System.out.println("Please input the value for grade six.");
            valueF = input.nextDouble();

            System.out.println("Please input the value for grade seven.");
            valueG = input.nextDouble();

            System.out.println("Please input the value for grade eight.");
            valueH = input.nextDouble();

            System.out.println("Please input the value for grade nine.");
            valueI = input.nextDouble();

            System.out.println("Please input the value for grade ten.");
            valueJ = input.nextDouble();


          //Average
            double average = ((valueA + valueB + valueC + valueD + valueE + valueF + valueG + valueH + valueI + valueJ)/10);

          //Final Output
            System.out.println("The average grade for all ten subjects is " + average + ".");

          //Repeat query
          while (repeat != 1 && repeat != 2) {
            System.out.println("If you would like to enter another ten grades to average, type \"1\". Otherwise, type \"2\".");
            repeat = input.nextInt();
          }
        } while (repeat == 1);
    }

}
