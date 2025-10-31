 
public class TimeFormat {
	public static void main(String[] args) {
		
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        
		int hoursAm = 12;
        
		if (hours != 12 ) { 
			hoursAm = 0 + hours % 12;
		}

        if (hours >= 12) {
		System.out.println(hoursAm + ":"+ minutes / 10 + minutes % 10 + " PM");	
		}
		else { 
        System.out.println(hoursAm + ":"+ minutes / 10 + minutes % 10 + " AM" );
		}
        
	}
}