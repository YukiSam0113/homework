package homework_1;

public class U2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinutes = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;
		System.out.println("Current time is " + currentHour + ":" + currentMinutes + ":" + currentSecond + " GMT");
	
	}

}
