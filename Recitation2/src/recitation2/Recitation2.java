package recitation2;

/*
Java Program 8
Programming With Java Period 3
CS0007 - Fun With Names
Written in Atom 1.21.0 x64
Compiled in NetBeans IDE 8.2
Written By Dustin LeGars
Written on 10/3/2017 at 10:00
|||||||||||||||||||||||||||||||||||
|| Take user input (String) and  ||
|| print relevant information    ||
|| related to their name         ||
|||||||||||||||||||||||||||||||||||
*/

import java.util.Scanner;


/**
 *
 * @author 9djl001
 */
public class Recitation2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declarations
        int length, space, uniVal;
        String name, extraS;
        char initial1, initial2;

        //Scanner
        Scanner input = new Scanner(System.in);



        //Interaction
        System.out.println("Welcome to Recitation Project #1: Fun With Names. \nPlease input your name below.");

        name = input.nextLine();

        space = name.indexOf(' ');
        initial1 = name.charAt(0);
        initial2 = name.charAt(space + 1);

        uniVal = (int)initial1 + (int)initial2;




        System.out.println("\n\n\nThank you for your name. \nYour name is " + name);

        System.out.println("Your initials are: " + initial1 + initial2);

        System.out.println("The value of your initials in Unicode is: " + uniVal);

    }

}
