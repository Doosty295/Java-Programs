/*
Written in Atom
Compiled in NetBeans IDE 8.2
Written By Dustin LeGars
Written on 9/18/2017 @ 10:00
Recitation Assignment: User Input and String Methods
Java Programming Period 3
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


      String name;
      System.out.println("Enter your name: " + name);
      name = spaceDust.nextLine();

      int age;
      System.out.println("Enter your current age: " + age);
      age = spaceDust.nextInt();

      int years;
      System.out.println("Enter the amount of years to increase: " + years);
      years = paceDust.nextInt();



    }

}
