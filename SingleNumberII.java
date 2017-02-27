/*Each number occurs thrice except for one. Output that no. */
public class SingleNumberII {

	
	public int singleNumber(int[] A){
		int ones = 0, twos = 0, threes = 0;
		for(int i = 0; i < A.length; i++){
			twos = twos | (ones & A[i]);
			ones = ones ^ A[i];
			threes = ones & twos;
			ones = ones & ~threes;
			twos = twos & ~threes;
		}
		
		return ones;
	}
	public static void main(String[] args) {
		SingleNumberII snii = new SingleNumberII();
		int[] A = {2,3,2,2};
		int num = snii.singleNumber(A);
		System.out.println(num);

	}

}
