package Junit;

public class CMeeting {
	public CTime start;
	public CTime end;
	public Boolean checkValid(CTime start, CTime end){
		Boolean result = false;		
		if((60*end.hour + end.minute) > (60*start.hour + start.minute)){
			if((60*end.hour + end.minute) - (60*start.hour + start.minute) <= 60){
				result = true;
			}
		}
		return result;		
	}
}
