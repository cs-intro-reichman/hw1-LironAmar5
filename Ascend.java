
import com.sun.jdi.event.BreakpointEvent;
import javax.lang.model.util.ElementScanner14;

// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int num1 = (int)(Math.random() * 10);
		int num2 = (int)(Math.random() * 10);
        int num3 = (int)(Math.random() * 10);

		int min = Math.min(num3 , Math.min(num1 , num2));
		int max = Math.max(num3 , Math.max(num1 , num2));
		
        int mid = (num1 + num2 + num3) - (max + min);

	    System.out.println(min + " " + mid + " " + max);
	}
}
