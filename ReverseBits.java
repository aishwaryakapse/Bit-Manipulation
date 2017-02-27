
public class ReverseBits {
	
	public int reverseBits(int n){
		int total = Integer.toBinaryString(n).length();
		System.out.println(total);
		for(int i=0; i<total/2; i++){
			n = swapBits(n,i,total-i-1);
		}
		
		return n;
	}
	
	public int swapBits(int n, int i, int j){
		
		int a = (n >> i) & 1;
		int b = (n >> j) & 1;
		
		if((a^b) != 0){
			return n^((1<<i) | (1<<j));
		}
		
		return n;
	}

	public static void main(String[] args) {
		ReverseBits rb = new ReverseBits();
		int n = 4;
		System.out.println(n);
		int r = rb.reverseBits(n);
		System.out.println(r);
	}

}
