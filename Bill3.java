// Splits a restaurant bill evenly among three diners.


public class Bill3 {
    public static void main(String[] args) {
        // Read names from command-line arguments
        String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];
        int value = Integer.parseInt(args[3]);

        // Calculate each person's share rounded up
        double share = Math.ceil((double)value / 3);
        
		System.out.println("Dear " + name1 + ", " + name2 + " and " + name3 + " each owes: " + share);
        

        
    }
}