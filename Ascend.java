
public class Ascend {
	public static void main(String[] args) {
		int a = (int)(Math.random() * 10);
		int b = (int)(Math.random() * 10);
        int c = (int)(Math.random() * 10);

		int min = Math.min(c , Math.min(a , b));
		int max = Math.max(c , Math.max(a , b));
		
        int mid = (a + b + c) - (max + min);
        
		System.out.println(a + " " + b + " " + c);
	    System.out.println(min + " " + mid + " " + max);
	}
}
