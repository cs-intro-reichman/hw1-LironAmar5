// Splits a restaurant bill evenly among three diners.


public class Bill3 {
    public static void main(String[] args) {
        
        String a = args[0];
        String b = args[1];
        String c = args[2];
        int value = Integer.parseInt(args[3]);

        
        double share = Math.ceil((double)value / 3);
        
		System.out.println("Dear " + c + ", " + b + " and " + a + ": pay " + share + " Shekels each.");
        

        
    }
}