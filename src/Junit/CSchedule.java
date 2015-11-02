package Junit;

public class CSchedule {

	public Boolean checkOverlap(CMeeting m1, CMeeting m2){
		Boolean result = true;	
		CMeeting m3;
		
		if((60*m1.start.hour + m1.start.minute) < (60*m2.start.hour + m2.start.minute)){
			m3=m1;
			m1=m2;
			m2=m3;
		}
				
		if((60*m1.end.hour + m1.end.minute) - (60*m2.start.hour + m2.start.minute) > 0){
			result = false;
		}
		
		return result;
		
	}
	
	public Boolean checkTotalMeetings(CMeeting m[]){
		Boolean result = false;
		int totalMinutes = 0;
		for(int i=0; i<m.length; i++){
			totalMinutes += (60*m[i].end.hour + m[i].end.minute) - (60*m[i].start.hour + m[i].start.minute);
		}
		if(totalMinutes <= 60*8){
			result = true;
		}
	
		return result;
	
	}
}
