package homework_1;

import java.util.Scanner;

public class U2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();
		double area = radius * radius * 3.14159;
		System.out.println("The area for the circle of radius " + radius + " is " + area);
		input.close();
	}

}
