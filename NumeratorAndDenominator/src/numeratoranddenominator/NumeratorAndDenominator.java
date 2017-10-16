package numeratoranddenominator;
/*
Java Program (HW-1)
Programming With Java Period 3
Written in Atom 1.21.0 x64
Compiled in NetBeans IDE 8.2
Written By Dustin LeGars
Written on 10/10/2017 at 10:10
|||||||||||||||||||||||||||||||||||
||Take input in form of int      ||
||then plug in values and also   ||
||convert the fraction to a      ||
||decimal.                       ||
|||||||||||||||||||||||||||||||||||
*/

import java.util.Scanner;




public class NumeratorAndDenominator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

        int inputNumer, inputDenom;
        int repeat = 1;

        while(repeat == 1)
          {
            System.out.println("Please input a whole number for the numerator.");
            inputNumer = input.nextInt();

            System.out.println("Please input a whole non-zero number for the denominator.");
            inputDenom = input.nextInt();

            if(inputDenom == 0){
              System.out.println("Hey, dingus! Try it again. And this time? Don't set the denominator to zero.");

              break;
            }


            System.out.println("The numerator is " + inputNumer + " and the denominator is " + inputDenom);
            System.out.println("Converted to a decimal, the fraction is " + ((double)inputNumer/inputDenom));

            System.out.println("\n\n\nWould you like to do another?\nAnswer with a 1 for yes, and a 0 for no.");
            repeat = input.nextInt();

            if(repeat > 1 || repeat < 0){
              break;
              
            }

          }





    }

}
