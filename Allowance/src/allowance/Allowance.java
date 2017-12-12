/*
Java 13
Programming With Java Period 3
Written in Atom 1.22.1 x64
Compiled in NetBeans IDE 8.2
Written By Dustin LeGars
Written on 12/11/2017 at 10:10
{>===----===<}
Intent:
  Cumulative earnings thing.
{>===----===<}
<GitHub Link>
*/

package allowance;
import java.util.Scanner;

/**
 *
 * @author 9djl001
 */
public class Allowance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      Scanner doot = new Scanner(System.in);

      int sum = 1;
      int allow = 1;
        for (int day = 1; day <= 30; day++) {
          

          allow = allow * 2;
          sum = sum + allow;

        }
        System.out.println("This many cents " + sum);
    }

}
