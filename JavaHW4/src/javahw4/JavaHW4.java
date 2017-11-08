/*
Java Program (H/C)W 4
Programming With Java Period 3
toUpperCase and Do-While
Written in Atom 1.22.0 x64
Compiled in NetBeans IDE 8.2
Written By Dustin LeGars
Written on 11/8/2017 at 10:04
||||||||||||||||||||||||||||||||
||Take single character input ||
||from user and reply in kind ||
||Then, remake with do while  ||
||loop.                       ||
|||||||||||||||||||||||||||||||||
*/
package javahw4;
import java.util.Scanner;
/**
 *
 * @author 9djl001
 */
public class JavaHW4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String input; //Holds input
        char answer; //Holds converted input as single character

        //Creates scanner object
        Scanner keyboard = new Scanner(System.in);
        /*
        //Ask the question
        System.out.println("Is your name Eric (Y = Yes, N = No)");
        input = keyboard.nextLine().toUpperCase();            //Gets user input
        answer = input.charAt(0); //Gets first character of User input

        System.out.println("The user entered " + answer);
        */


        do {
          System.out.println("Is your name Eric (Y = Yes, N = No)");
          input = keyboard.nextLine().toUpperCase(); //Gets user input
          answer = input.charAt(0); //Gets first character of User input

          if (answer == 'Y' || answer == 'N') {
            System.out.println("The user entered " + answer);
          }
        } while (answer != 'Y' & answer != 'N');





    }

}
