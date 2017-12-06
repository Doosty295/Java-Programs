/*
Java 12
Programming With Java Period 3
Written in Atom 1.22.1 x64
Compiled in NetBeans IDE 8.2
Written By Dustin LeGars
Written on 12/06/2017 at 10:50
{>===----===<}
Intent:
  Back of page for JP11
{>===----===<}
<GitHub Link>
*/

package moreloops;

/**
 *
 * @author 9djl001
 */
public class MoreLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//single
System.out.println("single");
        for (int i = 1; i<=5; i++ ) {
          System.out.print("x");
        }
//double
System.out.println("\n\n\n double");
        for (int j = 1; j<=4; j++) {
          for (int k = 1; k<=5 ;k++ ) {
            System.out.print("x");
          }
          System.out.println();
        }
//triple
System.out.println("\n\n\n triple");
        for (int a = 1; a <= 3; a++ ) {
          for (int b = 1; b <= 4 ; b++ ) {
            for (int x = 1; x <= 5; x++ ) {
              System.out.print("x");
            }
            System.out.println();
          }
          System.out.println();
        }
    }

}
