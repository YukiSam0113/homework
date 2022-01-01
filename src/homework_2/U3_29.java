package homework_2;

import java.util.Scanner;

public class U3_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("输入"); 
		Scanner input=new Scanner(System.in); 
		double x1=input.nextDouble(); 
		double y1=input.nextDouble(); 
		double w1=input.nextDouble(); 
		double h1=input.nextDouble(); 
		double x2=input.nextDouble(); 
		double y2=input.nextDouble(); 
		double w2=input.nextDouble(); 
		double h2=input.nextDouble(); 
		if((Math.abs(x2-x1)+w2/2<Math.abs(w1/2)) && (Math.abs(y2- y1)+h2/2<Math.abs(h1/2))) 
			System.out.println("inside"); 
		else if(x2-x1<w1/2+w2/2) 
			System.out.println("inside");
		else 
			System.out.println("notinside");
		input.close();
	}

}
