import java.util.Scanner;

public class Objective4Lab3 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int userNum;

      System.out.println("Please enter a number: ");
      userNum = input.nextInt();

      if (userNum == 0) {
      	System.out.println("Number is 0, not positive or negative."); 
      } 
      else if (userNum > 0) {
      	System.out.println("The number is positive");
      } 
      else if (userNum < 0) {
      	System.out.println("The number is negative"); 
      } 
      
      input.close();
  }
}