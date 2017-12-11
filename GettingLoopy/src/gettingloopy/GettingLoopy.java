/*
Java Program 11
Programming With Java Period 3
Written in Atom 1.22.1 x64
Compiled in NetBeans IDE 8.2
Written By Dustin LeGars
Written on 12/06/2017 at 10:20
{>===----===<}
Intent:
  Doing practice with loops.
{>===----===<}
<GitHub Link>
*/

package gettingloopy;

/**
 *
 * @author 9djl001
 */
public class GettingLoopy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
System.out.println("Problem 1");

        for (int i = 1; i <= 10; i++ ) {
          for (int j = 1; j <= i; j++) {
            System.out.print("R");
          }
          System.out.println();
        }
        System.out.println();
        System.out.print("Bye");




System.out.println("\n\nProblem 2");

        for (int i = 1; i <= 5; i++ ) {
          for (int j = 1; j <= i; j++) {
            System.out.print("R");
          }
          System.out.println();
        }
        System.out.println();
        System.out.print("Bye");





        System.out.println("\n\nProblem 3");

        for (int i = 7; i >= 1; i-- ) {
          for (int j = 1; j <= i; j++) {
            System.out.print("7");
          }
          System.out.println();
        }
        System.out.println();
        System.out.print("Bye");
    }
  }
