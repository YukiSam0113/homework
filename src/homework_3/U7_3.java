package homework_3;

import java.util.Scanner;

public class U7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in); 
		int[] a=new int [11]; 
		int cnt; 
		while(true) 
		{ 
			cnt=input.nextInt(); 
			if(cnt==0)
				break; 
			a[cnt]+=1; 
		}
		for(int i=1;i<=10;i++) 
		{ 
			System.out.println(i+" "+a[i]); 
		}
		input.close();
	}

}
