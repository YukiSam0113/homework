package homework_2;

import java.util.Scanner;

public class U5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入"); 
		Scanner input=new Scanner(System.in); 
		double n=10000;
		for(int i=1;i<=10;i++) 
			n=n*1.05; 
		double sum=0; 
		for(int i=1;i<=4;i++) 
		{ 
			sum+=n; 
			n*=1.05; 
		}
		System.out.println(sum);
		input.close();
	}

}
