/*
Written with GitHub's Atom editor.
Compiled with NetBeansIDE 8.2
Written by Dustin LeGars
GitHub Repository: https://github.com/Doosty295/Java-Programs
Java Programming Period 3
Started on 09/05/2017 10:11
*/
package escape;

/**
 *
 * @author 9djl001
 */
public class Escape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Print guide
        System.out.println("123456789012345678901234567890");
        //String 1
        System.out.println("Hello, World!");
        //String 2.1
        System.out.println("Hello, \nWorld!");
        //String 2.2
        System.out.println("Hello, \nWorld\n\n!");
        //String 3
        System.out.println("Hello, \"W\"orl\'d\'!");
        //String 4
        System.out.println("Hello, \\World!");
        //String 5.1
        System.out.println("Hello, \tWorld!");
        //String 5.2
        System.out.println("Hello, \t\tWorld!");
        //String 6
        System.out.println("\u00A92005 by R. Greenlee");
    }

}
