package ht.dataStructures;

public class Time2 {
	private int hour;
	private int minute;
	private int second;

	public Time2(int hour, int minute, int second) {
		// TODO Auto-generated constructor stub
		this.setHour(hour);
		this.setMinute(minute);
		this.setSecond(second);
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public String toString() {
		return String.valueOf(this.hour) + ":" + String.valueOf(this.minute) + ":" + String.valueOf(this.second) + " " + (this.hour > 12 ? "AM" : "PM");
	}
}
