public class Objective2Lab5 {
  public static void main(String[] args) {
  	java.util.Scanner scanner = new java.util.Scanner(System.in);
  	
  	double side1, side2, hypotenuse; 
  	
  	System.out.print("Enter side1: "); 
  	side1 = scanner.nextDouble(); 
  	
  	System.out.print("Enter side2: "); 
  	side2 = scanner.nextDouble();
  	
  	hypotenuse = Math.sqrt((side1*side1) + (side2*side2));
  	
  	System.out.println( "The hypotenuse of a triangle with sides " + side1 + " and " + side2 + 
  	" is " + hypotenuse + ".");
  
  	scanner.close(); 
  }
} 