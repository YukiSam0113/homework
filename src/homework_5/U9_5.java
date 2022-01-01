package homework_5;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class U9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
        GregorianCalendar g=new GregorianCalendar();
        g.setTimeInMillis(input.nextLong());
        System.out.println(g.get(Calendar.YEAR)+"-"+g.get(Calendar.MONTH)+"-"+g.get(Calendar.DAY_OF_MONTH));
        input.close();
	}

}
