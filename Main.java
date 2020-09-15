import java.util.Scanner;
/**
 *lets the user know if the number if odd or even 
 * @author Jason
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);

    //asks user for input
    System.out.println("Please enter an integer:");

    // takes users input
    int number = input.nextInt();
    
    //does the math to see if number is odd or even 
     if (number % 2 == 0)
      System.out.println("The number is even.");
    else
      System.out.println("The number is odd."); 
  
    
  }
}
