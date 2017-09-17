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
<<<<<<< HEAD
=======
import Math.java;
>>>>>>> 535c9cefb1342d541ad4e0af8239ba43ce09d3c6
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
<<<<<<< HEAD
  System.out.println("What form of decimal based right triangle operation would you like to perform?");
   System.out.println("To caclulate for base, press 0.");
   System.out.println("To calculate for height, press 1.");
   System.out.println("To calculate for hypotenuse, press 2.");
   System.out.println("To calculate for area, press 3.");
   System.out.println("To calculate for perimeter, press 4.");
   System.out.println("To terminate this program, press 5.");

   int ask;
        ask = input.nextInt();
=======
  System.out.println("What form of decimal based right triangle operation would you like to perform? \nTo caclulate for base, press \'A\'. \nTo calculate for height, press \'B\'. \nTo calculate for hypotenuse, press \'C\'. \nTo calculate for area, press \'D\'. \nTo calculate for perimeter, press \'E\'. \n\nTo terminate this program, press \'F\'.");

  queryInput = input.nextChar();
>>>>>>> 535c9cefb1342d541ad4e0af8239ba43ce09d3c6



  //Switch
    switch (ask) {
    //Base
      case 0: System.out.println("What is the height?");
        inputHeight = input.nextDouble();
        System.out.println("What is the hypotenuse?");
        inputHyp = input.nextDouble();
        System.out.println("The length of the triangle's base is " + base);
        break;

    //Height
      case 1: System.out.println("What is the base?");
      inputBase = input.nextDouble();
      System.out.println("What is the hypotenuse?");
      inputHyp = input.nextDouble();
      System.out.println("The height of the triangle is " + height);
      break;

    //Hypotenuse
      case 2: System.out.println("What is the height?");
      inputHeight = input.nextDouble();
      System.out.println("What is the base?");
      inputBase = input.nextDouble();
      System.out.println("The length of the triangle's hypotenuse is " + hyp);
      break;


    //Area
      case 3: System.out.println("What is the height?");
      inputHeight = input.nextDouble();
      System.out.println("What is the base?");
      inputBase = input.nextDouble();
      System.out.println("The area of the triangle is " + area);
      break;



    //Perimeter
      case 4: System.out.println("What is the height?");
      inputHeight = input.nextDouble();
      System.out.println("What is the base?");
      inputBase = input.nextDouble();
      System.out.println("What is the hypotenuse?");
      inputHyp = input.nextDouble();
      System.out.println("The perimeter of the triangle is " + perim);
      break;

    //Termination
<<<<<<< HEAD
      case 5:
=======
      case 'F':
>>>>>>> 535c9cefb1342d541ad4e0af8239ba43ce09d3c6
        System.end(0);
      break;

    //Default
    default :
      System.out.println("Please select an option to continue.");
      break;


    }





    }

}
