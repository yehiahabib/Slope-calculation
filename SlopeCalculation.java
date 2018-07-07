import java.util.Scanner;

public class SlopeCalculation {
  
  public static void main(String[] args) {
    
	double gradient;	// Declares the double variables x and gradient
    Scanner input = new Scanner(System.in);	// creates a new scanner object called input
    System.out.print("Enter the coordinates for two points: ");	// outputs prompt to user
    
	double x1 = input.nextDouble();// creates variable x1 to store the x-coordinate of the first point
    double y1 = input.nextDouble();// creates variable y1 to store the y-coordinate of the first point
    double x2 = input.nextDouble();// creates variable x2 to store the x-coordinate of the first point
    double y2 = input.nextDouble();// creates variable y2 to store the y-coordinate of the first point
    
	
	gradient = ((y2 - y1) / (x2 - x1));//// creates variable gradient to store the value of the slope of the line connecting the 2 points
    
	System.out.println("The slope of the line connecting two points " + "(" + x1 + "," + y1 + ") ("
        + x2 + "," + y2 + ") is " + gradient);// outputs the gradient to user
    
	input.close(); // closes the user input
  }
}
