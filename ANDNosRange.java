
public class ANDNosRange {

	public int bitWiseAND(int m, int n){
		while(n > m){
			n = n & n-1;
		}
		return m & n;
	}
	public static void main(String[] args) {
		ANDNosRange anr = new ANDNosRange();
		int m = 5;
		int n = 7;
		System.out.println("The Result of AND is: "+anr.bitWiseAND(m, n));
	}

}
