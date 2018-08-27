package Time;

public class time {
	
	private int hour;
	private int minute;
	private int second;
	
 
	public void setTime(int h, int m, int s) {
		hour = ((h > 0 && h < 24) ? h : 0);
		minute = ((m > 0 && m < 60) ? m : 0);
		second = ((s > 0 && s < 60) ? s : 0);
	}
	
	public String toMilitary() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	
	// "%d:%02d:%02d %s", the "%d" is going to output an integer
	// %02d is going to output an integer, but it HAS to be 2 DIGITS.
	// so the means if you put in a 1, it is going to show up in the console as "01"
	public String toString() {
		return String.format("%d:%02d:%02d %s", ((hour==0 || hour==12) ?12:hour%12), minute, second, (hour < 12? "AM" : "PM"));
	}

}
