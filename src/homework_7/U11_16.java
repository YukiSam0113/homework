package homework_7;

import java.util.ArrayList;
import java.util.Scanner;

public class U11_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        list.add(answer);
        while (number1 + number2 != answer) 
        {
            System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
            answer = input.nextInt();
            while (list.contains(answer)) 
            {
                System.out.println("You already entered " + answer);
                System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
                answer = input.nextInt();
            }
            list.add(answer);
        }
        System.out.println("You got it!");
        input.close();
	}

}
