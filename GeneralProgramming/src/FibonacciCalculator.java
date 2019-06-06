
public class FibonacciCalculator {

	public static void main(String[] args) {
		System.out.println(fibnacciCalculator(6));
	}
	
	static int fibnacciCalculator(int number) 
    { 
        int prev1 = 0, prev2 = 1, resultFib; 
        
        if(number == 0) return 0;
		if(number <= 2) return 1;
		
        for (int i = 2; i <= number; i++) { 
            resultFib = prev1 + prev2; 
            prev1 = prev2; 
            prev2 = resultFib; 
        } 
        return prev2; 
    } 
}
