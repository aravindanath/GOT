package videoRecorder;

import java.util.Date;

public class DateAndTimer {
	
	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d);
		String today =  d.toString();
		System.out.println(today);
		String finalDate =today.replace(" ", "_").replace(":", "_");
		System.out.println(finalDate);
		
	}

}
