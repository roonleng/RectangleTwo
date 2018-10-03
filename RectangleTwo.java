/**
 * 
 */
import java.util.Scanner;
public class RectangleTwo 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the width of the rectangle: ");
		double width = in.nextDouble();
		in.nextLine();
		System.out.print("Please enter the length of the rectangle: ");
		double length = in.nextDouble();
		in.nextLine();
		in.close();
		
		double area = length*width;
		double perimeter = (2*width) + (2*length);
		double diagonal = Math.sqrt((length*length) +(width*width));
		
		System.out.printf("The area is: %6.2f", area);
		System.out.printf("The area is: %6.2f", perimeter);
		System.out.printf("The area is %6.2f",  diagonal);
	}

}
