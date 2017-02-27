
public class PowerOfTwo {
	
	public boolean isPowerOfTwo(int n){
		if(n <= 0){
			return false;
		}
		while(n > 2){
			int t = n >> 2;
			int c = t << 2;
			if((n-c) != 0){
				return false;
			}
			n = n >> 2;
		}
		return true;
	}

	public static void main(String[] args) {
		PowerOfTwo pot = new PowerOfTwo();
		System.out.println(7 +" Is Power of Two? : "+pot.isPowerOfTwo(7));
		System.out.println(16 +" Is Power of Two? : "+pot.isPowerOfTwo(16));
	}
}
