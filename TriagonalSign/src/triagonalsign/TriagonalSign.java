/*
 Remake of program Triangle with Inputs
 Written in Atom
 Compiled in NetBeans IDE 8.2
Written by Dustin LeGars on 9/14/2017
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
  //Declarations
    double base, height, hyp, area, perim;
    char queryInput;
    Scanner inputBase, inputHeight, inputHyp, operationSelector = new Scanner(System.in);



    public static void main(String[] args) {

//Operation query
  System.out.println("What form of operation would you like to perform? \nTo caclulate for base, press \'A\'. \nTo calculate for height, press \'B\'. \nTo calculate for hypotenuse, press \'C\'. \nTo calculate for area, press \'D\'. \nTo calculate for perimeter, press \'E\'. \n\nTo terminate this program, press \'F\'.");
  queryInput = input.nextChar();



  //Switch
    switch (queryInput) {
    //Base
      case 'A': System.out.println("What is the height?");
        inputHeight = input.nextDouble();
        System.out.println("What is the Hypotenuse?");
        inputHyp = input.nextDouble();
        
    //Height
      case 'B':

    //Hypotenuse
      case 'C':

    //Area
      case 'D':

    //Perimeter
      case 'E':

    //Termination
      case 'F':

    }





    }

}
