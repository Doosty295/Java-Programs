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
import Math.java;
/**
 *
 * @author 9djl001
 */
public class TriagonalSign {
  //Declarations
    double base, height, hyp, area, perim;
    char queryInput;
    Scanner inputBase, inputHeight, inputHyp, operationSelector = new Scanner(System.in);

//Arithmetic
  //Base from Height and hyp
    double base = Math.sqrt((Math.pow(inputHyp, 2)) + (Math.pow(inputHeight, 2)));

  //Height from Base and hyp
    double height = Math.sqrt((Math.pow(inputHyp, 2)) + (Math.pow(inputBase, 2)));

  //Hyp from Base and Height
    double hyp = Math.sqrt((Math.pow(inputBase, 2)) + (Math.pow(inputHeight, 2)));

  //Area from Height and base
    double area = ((base / 2) * height);

  //Perimeter from Base, Height, and Hypotenuse
    double perim = (base + height + hyp);

    public static void main(String[] args) {

//Operation query
  System.out.println("What form of decimal based right triangle operation would you like to perform? \nTo caclulate for base, press \'A\'. \nTo calculate for height, press \'B\'. \nTo calculate for hypotenuse, press \'C\'. \nTo calculate for area, press \'D\'. \nTo calculate for perimeter, press \'E\'. \n\nTo terminate this program, press \'F\'.");

  queryInput = input.nextChar();



  //Switch
    switch (queryInput) {
    //Base
      case 'A': System.out.println("What is the height?");
        inputHeight = input.nextDouble();
        System.out.println("What is the hypotenuse?");
        inputHyp = input.nextDouble();
        System.out.println("The length of the triangle's base is " + base);
        break;

    //Height
      case 'B': System.out.println("What is the base?");
      inputBase = input.nextDouble();
      System.out.println("What is the hypotenuse?");
      inputHyp = input.nextDouble();
      System.out.println("The height of the triangle is " + height);
      break;

    //Hypotenuse
      case 'C': System.out.println("What is the height?");
      inputHeight = input.nextDouble();
      System.out.println("What is the base?");
      inputBase = input.nextDouble();
      System.out.println("The length of the triangle's hypotenuse is " + hyp);
      break;


    //Area
      case 'D': System.out.println("What is the height?");
      inputHeight = input.nextDouble();
      System.out.println("What is the base?");
      inputBase = input.nextDouble();
      System.out.println("The area of the triangle is " + area);
      break;



    //Perimeter
      case 'E': System.out.println("What is the height?");
      inputHeight = input.nextDouble();
      System.out.println("What is the base?");
      inputBase = input.nextDouble();
      System.out.println("What is the hypotenuse?");
      inputHyp = input.nextDouble();
      System.out.println("The perimeter of the triangle is " + perim);
      break;

    //Termination
      case 'F':
        System.end(0);
      break;

    //Default
    default :
      System.out.println("Please select an option to continue.");
      break;


    }





    }

}
