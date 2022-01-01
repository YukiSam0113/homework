package homework_2;

import java.util.Scanner;

public class U3_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("输入"); 
		Scanner input=new Scanner(System.in); 
		double x=input.nextDouble(); 
		double y=input.nextDouble(); 
		if(x*x+y*y<100)
			System.out.println("nei"); 
		else 
			System.out.println("wai");
		input.close();
	}

}
