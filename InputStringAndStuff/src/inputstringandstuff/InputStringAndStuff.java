/*
Written in Atom
Compiled in NetBeans IDE 8.2
Written By Dustin LeGars
Written on 9/18/2017 @ 10:00
Recitation Assignment: User Input and String Methods
Java Programming Period 3
Java Program 7
 */
package inputstringandstuff;
  import java.util.Scanner;
/**
 *
 * @author 9djl001
 */

public class InputStringAndStuff {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {

      //Scanner
      Scanner spaceDust = new Scanner(System.in);

      //Name
      String name;
      System.out.print("Enter your name: ");
      name = spaceDust.nextLine();

      //Age
      int age;
      System.out.print("Enter your current age: ");
      age = spaceDust.nextInt();

      //Increase
      int years;
      System.out.print("Enter the amount of years to increase: ");
      years = spaceDust.nextInt();

      //Last thing
      System.out.println(name + ", your name is " + name.length() + " characters long and begins with the letter " + name.charAt(0) + ".");
      System.out.println("In " + years + " you will be " + (years + age) + " years old and someone half your age would be " + (age / 2) + " years old.");


    }

}
