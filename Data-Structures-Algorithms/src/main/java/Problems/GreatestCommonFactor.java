package Problems;

public class GreatestCommonFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(greatestCommonFactor(98, 56));
	}
	
    public static int greatestCommonFactor(int a, int b) {
    	int min = Math.min(a, b);
    	int res = 0;
    	
    	for(int i=1; i<=min/2; i++) {
    		if(a%i == 0 && b%i == 0) {
    			res = Math.max(res, i);
    		}
    	}
    	return res;
    }

}
