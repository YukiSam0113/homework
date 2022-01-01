package homework_2;

import java.util.Scanner;

public class U5_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("输入"); 
		Scanner input=new Scanner(System.in);
		int n=10000; 
		while(n<=100000) 
		{ 
			double pi=0; 
			int k=1; 
			for(int i=1;i<=n;i++) 
			{ 
				pi+=k/(2*i-1.0); 
				k=-k; 
			}
			pi*=4; 
			System.out.println(pi); 
			n+=10000; 
		}
		input.close();
	}

}
