package homework_5;

import java.util.Arrays;
import java.util.Random;

public class U9_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[100000];
        Random rd = new Random();
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = rd.nextInt(100000);
        }
        StopWatch sw = new StopWatch();
        Arrays.sort(arr);
        sw.stop();
        System.out.println("执行了" + sw.getElaspsedTime() + "毫秒");
	}

}
class StopWatch 
{
    private long startTime, endTime;

    public StopWatch()
    {
        startTime = System.currentTimeMillis();
    }

    public void stop()
    {
        this.endTime = System.currentTimeMillis();
    }

    public long getElaspsedTime()
    {
        return this.endTime - this.startTime;
    }
}