/*
 Remake of program Triangle with Inputs
 Written in Atom
 Compiled in NetBeans IDE 8.2
Written by Dustin LeGars on 9/20/2017
Java Programming Period 3
Java Program 4 v.2
 */
package triagonalsign;

import java.util.Scanner;
/**
 *
 * @author 9djl001
 */
public class TriagonalSign {




    public static void main(String[] args) {

      //Declaration of variables
      int repeat = 1;         //For the while loop
      int select = 0;



      //Scanner
        Scanner val = new Scanner(System.in);

        while (repeat == 1) {

          //Switch Statement
            System.out.println("What decimal based right triangle calculation would you like run?");
            System.out.println("1). Solve for base from height and hypotenuse lengths.");
            System.out.println("2). Solve for height from base and hypotenuse lengths. ");
            System.out.println("3). Solve for hypotenuse from height and base lengths.");
            System.out.println("4). Solve for area using \u00BD of the base times the height.");
            System.out.println("5). Solve for perimeter by adding all three sides together." );
            System.out.println("6). End the program.");
            System.out.println("Please select one: ");

            select = val.nextInt();



            switch (select) {

              //Base
              case 1:
                System.out.println("You have selected to solve for the base.");
                System.out.println("Please input a value for the height of the triangle.");
                double inputA = val.nextDouble();
                System.out.println("Please input a value for the hypotenuse of the triangle.");
                double inputB = val.nextDouble();

              //Declarations for1 Arithmetic
                double aSrq = Math.pow(inputA, 2);
                double bSqr = Math.pow(inputB, 2);
                double cSqr = aSrq + bSqr;
                double fin = Math.sqrt(cSqr);

                System.out.println("The length of the base of your triangle is " + fin);

                System.out.println("Would you like to run another operation? (1 = Y/2 = N)");
                repeat = val.nextInt();

                //Declarations for1 Arithmetic



                break;

              //Height
              case 2:
                System.out.println("You have selected to solve for the height.");
                System.out.println("Please input a value for the base of the triangle.");
                double inputAa = val.nextDouble();
                System.out.println("Please input a value for the hypotenuse of the triangle.");
                double inputBa = val.nextDouble();

              //Declarations for1 Arithmetic
                double aSrqa = Math.pow(inputAa, 2);
                double bSqra = Math.pow(inputBa, 2);
                double cSqra = aSrqa + bSqra;
                double fina = Math.sqrt(cSqra);

                System.out.println("The height of your triangle is " + fina);

                System.out.println("Would you like to run another operation? (1 = Y/2 = N)");
                repeat = val.nextInt();



                break;

              //Hypotenuse
              case 3:
                System.out.println("You have selected to solve for the hypotenuse.");
                System.out.println("Please input a value for the height of the triangle.");
                double inputAb = val.nextDouble();
                System.out.println("Please input a value for the base of the triangle.");
                double inputBb = val.nextDouble();

              //Declarations for1 Arithmetic
                double aSrqb = Math.pow(inputAb, 2);
                double bSqrb = Math.pow(inputBb, 2);
                double cSqrb = aSrqb + bSqrb;
                double finb = Math.sqrt(cSqrb);

                System.out.println("The length of the hypotenuse of your triangle is " + finb);

                System.out.println("Would you like to run another operation? (1 = Y/2 = N)");
                repeat = val.nextInt();



                break;

              //Area
              case 4:
                System.out.println("You have selected to solve for the area.");
                System.out.println("Please input a value for the height of the triangle.");
                double inputAc = val.nextDouble();
                System.out.println("Please input a value for the base of the triangle.");
                double inputBc = val.nextDouble();

              //Declarations for1 Arithmetic
                double high = (inputBc / 2) * inputAc;

                System.out.println("The area of your triangle is " + high);

                System.out.println("Would you like to run another operation? (1 = Y/2 = N)");
                repeat = val.nextInt();

                break;

              //Perimeter
              case 5:
              System.out.println("You have selected to solve for the perimeter.");
              System.out.println("Please input a value for the height of the triangle.");
              double inputAd = val.nextDouble();
              System.out.println("Please input a value for the base of the triangle.");
              double inputBd = val.nextDouble();
              System.out.println("Please input a value for the hypotenuse of the triangle.");
              double inputCd = val.nextDouble();

              System.out.println("The perimeter of your triangle is " + (inputAd + inputBd + inputCd));

              System.out.println("Would you like to run another operation? (1 = Y/2 = N)");
              repeat = val.nextInt();

              break;

              case 6:
                System.end(0);
              break;




            }









        }

    }

    }

}
