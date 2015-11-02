package Junit;

public class CTime {
	public int hour;
	public int minute;
	
	public Boolean setTime(int hour, int minute){
		Boolean result = false;
		if(hour >= 0 && hour <=23){
			this.hour = hour;
			if(minute >= 0 && minute <=59){
				this.minute = minute;
				result = true;
			}
		}
		if(result == false){
			this.hour = 0;
			this.minute = 0;
		}
		return result;
	}
	
	public static void main(String args[]){
		System.out.println("testing");
	}
}
