package Problems;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrime(4));
	}

	public static Boolean isPrime(int num) {
		if(num <= 1) {
			return false;
		}
		
		for(int i=2; i<=num/2; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
}
