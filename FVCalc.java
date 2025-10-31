
public class FVCalc {
	public static void main(String[] args){
		
		int currentValue = Integer.parseInt(args[0]);
		double percentage = Double.parseDouble(args[1]) / 100;
		int years = Integer.parseInt(args[2]);
        
		double futureValue = currentValue * Math.pow((1 + percentage), years);
		System.out.println("After " + years + " years, $" + currentValue + " saved at " + percentage * 100 +"% will yield $" + (int)futureValue);


	}
}