package deciscionstructures;
/*
Java Program 9
Programming With Java Period 3
CS0007 - Deciscion Structures
Written in Atom 1.21.0 x64
Compiled in NetBeans IDE 8.2
Written By Dustin LeGars
Written on 10/5/2017 at 09:50
|||||||||||||||||||||||||||||||||||
||Test ability to make deciscions||
||based on a users input by using||
||deciscion structures.          ||
||Also, trying to document better||
|||||||||||||||||||||||||||||||||||
*/

//Imports
importjava.util.Scanner;
importjava.util.Arrays;
/**
 *
 * @author 9djl001
 */
public class DeciscionStructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      //Runner Names
        String runnerA, runnerB, runnerC;

      //Runner Times
        double timeA, timeB, timeC;

      //Scanner
        Scanner input = new Scanner;

      //Position
        int firstPlace = 1;
        int secondPlace = 2;
        int thirdPlace = 3;

      //Loop Resources
        int repeat = 1;

      //Loop
      while (repeat == 1) {
        //Section for Runner A
          //Name
            System.out.println("Please input the name of the first runner.");
              runnerA = input.nextLine();
              runnerA = input.nextLine();
          //Time
            System.out.println("Please input the time the first runner took.");
              timeA = input.nextDouble();

        //Section for Runner B
          //Name
            System.out.println("Please input the name of the second runner.");
              runnerB = input.nextLine();
              runnerB = input.nextLine();
          //Time
            System.out.println("Please input the time the second runner took.");
              timeB = input.nextDouble();

        //Section for Runner C
          //Name
            System.out.println("Please input the name of the third runner.");
              runnerC = input.nextLine();
              runnerC = input.nextLine();
          //Time
            System.out.println("Please input the time the third runner took.");
              timeC = input.nextDouble();

        //Placments
          //
      }



    }

}
