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
import java.util.Scanner;

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
        Scanner input = new Scanner(System.in);





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
          //A first, B second, C third
      if ((timeA < timeB && timeA < timeC) && (timeB < timeC)) {
        System.out.println("First place goes to " + runnerA + " with second place going to " + runnerB + " and finishing last is " + runnerC);

          //A first, C second, B third
      if ((timeA < timeB && timeA < timeC) && (timeC < timeB)) {
        System.out.println("First place goes to " + runnerA + " with second place going to " + runnerC + " and finishing last is " + runnerB);

          //B first, A second, C third
      if ((timeB < timeA && timeB < timeC) && (timeA < timeC)) {
        System.out.println("First place goes to " + runnerB + " with second place going to " + runnerA + " and finishing last is " + runnerC);

          //B first, C second, A third
      if ((timeB < timeA && timeB < timeC) && (timeA < timeB)) {
        System.out.println("First place goes to " + runnerB + " with second place going to " + runnerC + " and finishing last is " + runnerA);

          //C first, A second, B third
      if ((timeC < timeA && timeB < timeC) && (timeA < timeB)) {
        System.out.println("First place goes to " + runnerC + " with second place going to " + runnerA + " and finishing last is " + runnerB);

          //C first, B second, A third
      if ((timeC < timeA && timeB < timeC) && (timeA < timeB)) {
        System.out.println("First place goes to " + runnerC + " with second place going to " + runnerB + " and finishing last is " + runnerA);

      



    }

}
