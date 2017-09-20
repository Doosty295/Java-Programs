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

//Declarations were here, but error


    public static void main(String[] args) {

        //Declarations again
        double base, height, hyp, area, perim;
        double inputHyp = 0;
        double inputHeight = 0;
        double inputBase = 0;



//Arithmetic
  //Base from Height and hyp
     base = Math.sqrt((Math.pow(inputHyp, 2)) + (Math.pow(inputHeight, 2)));

  //Height from Base and hyp
     height = Math.sqrt((Math.pow(inputHyp, 2)) + (Math.pow(inputBase, 2)));

  //Hyp from Base and Height
     hyp = Math.sqrt((Math.pow(inputBase, 2)) + (Math.pow(inputHeight, 2)));

  //Area from Height and base
     area = ((base / 2) * height);

  //Perimeter from Base, Height, and Hypotenuse
     perim = (base + height + hyp);

//Operation query
  System.out.println("What form of decimal based right triangle operation would you like to perform?");
   System.out.println("To caclulate for base, press 0.");
   System.out.println("To calculate for height, press 1.");
   System.out.println("To calculate for hypotenuse, press 2.");
   System.out.println("To calculate for area, press 3.");
   System.out.println("To calculate for perimeter, press 4.");
   System.out.println("To terminate this program, press 5.");

   Scanner choice = new Scanner(System.in);

   int ask;
        ask = choice.nextInt();



  //Switch
    switch (ask) {
    //Base
      case 0: System.out.println("What is the height?");
        inputHeight = choice.nextDouble();
        System.out.println("What is the hypotenuse?");
        inputHyp = choice.nextDouble();
        System.out.println("The length of the triangle's base is " + base);
        break;

    //Height
      case 1: System.out.println("What is the base?");
        inputBase = choice.nextDouble();
      System.out.println("What is the hypotenuse?");
        inputHyp = choice.nextDouble();
      System.out.println("The height of the triangle is " + height);
      break;

    //Hypotenuse
      case 2: System.out.println("What is the height?");
        inputHeight = choice.nextDouble();
      System.out.println("What is the base?");
        inputBase = choice.nextDouble();
      System.out.println("The length of the triangle's hypotenuse is " + hyp);
      break;


    //Area
      case 3: System.out.println("What is the height?");
        inputHeight = choice.nextDouble();
      System.out.println("What is the base?");
        inputBase = choice.nextDouble();
      System.out.println("The area of the triangle is " + area);
      break;



    //Perimeter
      case 4: System.out.println("What is the height?");
        inputHeight = choice.nextDouble();
      System.out.println("What is the base?");
        inputBase = choice.nextDouble();
      System.out.println("What is the hypotenuse?");
        inputHyp = choice.nextDouble();
      System.out.println("The perimeter of the triangle is " + perim);
      break;

    //Termination
      case 5:
        System.end(0);
      break;

    //Default
    default :
      System.out.println("Your selection was recognized as invalid. Please restart the program and enter a value between 0 and 5.");
      break;


    }





    }

}
