package homework_2;

import java.util.Scanner;

public class U3_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("输入"); 
		Scanner input=new Scanner(System.in); 
		double a=input.nextDouble(); 
		double b=input.nextDouble(); 
		double c=input.nextDouble(); 
		if(a<b+c&&b<a+c&&c<a+b) 
			System.out.println("legal");
		else
			System.out.println("illegal");
		input.close();
	}

}
