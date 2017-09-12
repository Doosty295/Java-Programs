/*
Written with GitHub's Atom editor.
Compiled with NetBeansIDE 8.2
Written by Dustin LeGars
GitHub Repository: https://github.com/Doosty295/Java-Programs
Java Programming Period 3
Started on 09/05/2017 15:58
Learning to use Unicode and Escape sequences 
*/
package program1;

/**
 * @author 9djl001
 */
public class Program1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Name in two outputs
        System.out.println("Dustin");
        System.out.println("LeGars");
        System.out.println(""); //This is here to space out the outputs
      //One output with escapes
      System.out.println("John \nDoe \n\u00B1 \n\u00BD \n\n\"\u00BD\'");
    }

}
