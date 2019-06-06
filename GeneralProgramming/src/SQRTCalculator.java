
public class SQRTCalculator {

	public static void main(String[] args) {		
		calculateSQRTFloat(16);
		calculateSQRTDouble(162.6327643);
	}
	
	public static void calculateSQRTFloat(float number) {
		float a;
		float sqrt = number / 2;
		boolean isPositive = true;

		if (number == 0) {
			System.out.println(number);
		}

		else if (number < 0) {
			number = -number;
			isPositive = false;
		}

		do {
			a = sqrt;
			sqrt = (a + (number / a)) / 2;

		} while ((a - sqrt) != 0);

		if (isPositive) {
			System.out.println("Square root of +ve number " + number + " is: \n" + sqrt);
		} else {
			System.out.println("Square root of -ve number " + number + " is: \n" + sqrt);
		}
	}

	public static void calculateSQRTDouble(double number) {

		double sqrt = Math.sqrt(number);

		System.out.println("Square root of +ve number " + number + " is: \n" + sqrt);

	}
}
