
public class NumberReverser {
	
	public static void main(String[] args) {	
			reverseNumber(1234);
	}
	
	public static void reverseNumber(int number) {
		int reversedNumber=0;
		while( number != 0 )
	      {
			reversedNumber = reversedNumber * 10;
			reversedNumber = reversedNumber + number%10;
	          number = number/10;
	      }
		System.out.println(reversedNumber);
	}
}
