package deciscionstructures;
/*
Java Program 9
Programming With Java Period 3
CS0007 - Deciscion Structures
Written in Atom 1.21.1 x64
Compiled in NetBeans IDE 8.2
Written By Dustin LeGars
Written on 10/5/2017 at 09:50
|||||||||||||||||||||||||||||||||||
||Test ability to make deciscions||
||based on a users input by using||
||deciscion structures.          ||
||Multiple error messages too!   ||
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
          //Time
            System.out.println("Please input the time the first runner took. As a whole number or a decimal.");
              timeA = input.nextDouble();

        //Section for Runner B
          //Name
            System.out.println("Please input the name of the second runner.");
              runnerB = input.nextLine();
              runnerB = input.nextLine();
          //Time
            System.out.println("Please input the time the second runner took. As a whole number or a decimal.");
              timeB = input.nextDouble();

        //Section for Runner C
          //Name
            System.out.println("Please input the name of the third runner.");
              runnerC = input.nextLine();
              runnerC = input.nextLine();
          //Time
            System.out.println("Please input the time the third runner took. As a whole number or a decimal.");
              timeC = input.nextDouble();

        //Placments
          //A, B, C
          if (timeA < timeB && timeB < timeC) {
            System.out.println("The race is over! First place goes to " + runnerA +
             " followed by " + runnerB + " in second, \nand lastly, " + runnerC + " coming in last place.");
          }
          //A, C, B
          else if (timeA < timeC && timeC < timeB) {
            System.out.println("The race is over! First place goes to " + runnerA +
             " followed by " + runnerC + " in second, \nand lastly, " + runnerB + " coming in last place.");
          }
          //B, A, C
          else if (timeB < timeA && timeA < timeC) {
            System.out.println("The race is over! First place goes to " + runnerB +
             " followed by " + runnerA + " in second, \nand lastly, " + runnerC + " coming in last place.");
          }
          //B, C, A
          else if (timeB < timeC && timeC < timeA) {
            System.out.println("The race is over! First place goes to " + runnerB +
             " followed by " + runnerC + " in second, \nand lastly, " + runnerA + " coming in last place.");
          }
          //C, A, B
          else if (timeC < timeA && timeA < timeB) {
            System.out.println("The race is over! First place goes to " + runnerC +
             " followed by " + runnerA + " in second, \nand lastly, " + runnerB + " coming in last place.");
          }
          //C, B, A
          else if (timeC < timeB && timeB < timeA) {
            System.out.println("The race is over! First place goes to " + runnerC +
             " followed by " + runnerB + " in second, \nand lastly, " + runnerA + " coming in last place.");
          }


          //Error
          else {
            double errCode = (Math.random() * 10);
            if (errCode < 1) {
              System.out.println(" These errors are popping up because there was a tie.");
            }
            else if (errCode < 2) {
              System.out.println(" You broke it.");
            }
            else if (errCode < 3) {
              System.out.println(" There was a problem. It broke something. Probably something important.");
            }
            else if (errCode < 4) {
              System.out.println(" CATS: \'Someone set us up the error.\'");
            }
            else if (errCode < 5) {
              System.out.println(" Critical Error.");
            }
            else if (errCode < 6) {
              System.out.println(" Sorry, Virtual machine broke.");
            }
            else if (errCode < 7) {
              System.out.println(" I'm sorry Dave, I'm afraid I can't do that.");
            }
            else if (errCode < 8) {
              System.out.println(" That doesn't look right. Try again.");
            }
            else if (errCode < 9) {
              System.out.println(" I am no longer functioning within normal parameters.");
            }

            else {
              System.out.println(" Error for the error gods!");
            }
            }
          }




    }

}
