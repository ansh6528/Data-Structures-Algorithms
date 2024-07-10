package Problems;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(squareRoot(4));
	}
	
	public static int squareRoot(int num) {
		
		if(num == 0 || num == 1) {
			return num;
		}
		
		for(int i=1; i<=num/2; i++) {
			if(i*i == num) {
				return i;
			}
		}
		return -1;
	}

}
