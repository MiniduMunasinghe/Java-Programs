package question02;

public class DemoApp {
	public static void main(String args[]) {
		
		TCalculation<Integer> integer = new TCalculation<>();
		integer.append(23);
		integer.append(25);
		integer.append(22);
		
		
		TCalculation<Double> dob = new TCalculation<>();
		dob.append(11.0);
		dob.append(11.2);
		dob.append(12.2);
		
		System.out.println(integer.average());
		System.out.println("\n"+dob.average());
		
	}
}
