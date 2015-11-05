package Junit;

public class CMeeting {
	public CTime start;
	public CTime end;
	public Boolean checkValid(CTime start, CTime end){
		Boolean result = false;		
		if((60*end.hour + end.minute) >= (60*start.hour + start.minute)){
			if((60*end.hour + end.minute) - (60*start.hour + start.minute) <= 60){
				result = true;
			}
		}
		return result;		
	}
	public void setTimes(int h1, int m1, int h2, int m2){
		this.start = new CTime();
		this.end = new CTime();
		this.start.hour = h1;
		this.start.minute = m1;
		this.end.hour = h2;
		this.end.minute = m2;		
	}
//	public static void main(String args[]){
//		CMeeting cm = new CMeeting();
//		cm.setTimes(0 , 1 , 2 , 3);
//	}
}
