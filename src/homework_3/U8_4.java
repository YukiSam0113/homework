package homework_3;

import java.util.Arrays;
import java.util.Scanner;
public class U8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int[][] a=new int [10][10]; 
		for(int i=0;i<7;i++) 
		{ 
			for(int j=0;j<7;j++) 
			{ 
				a[i][j]=input.nextInt(); 
			}
			Arrays.sort(a[i],0,7); 
		}
		for(int i=0;i<7;i++) 
		{ 
			for(int j=0;j<7;j++) 
			{ 
				System.out.print(a[i][j]+" "); 
			}
			System.out.println(""); 
		}
		input.close();
	}

}
