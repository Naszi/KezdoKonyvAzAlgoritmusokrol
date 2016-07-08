package hu.naszi.algoritmus.powercalculator;

public class PowerCalculator {

	public static final PowerCalculator INSTANCE = new PowerCalculator();

	public PowerCalculator() {

	}

	public int calculate(int base, int exponent) {
		
		assert exponent >= 0 : "Az 'exponent' nem lehet kisebb mint 0";
		
		int result = 1;
		
		for (int i = 0; i < exponent; i++) {
			
			result *= base;
		}
		
		return result;
	}

}
