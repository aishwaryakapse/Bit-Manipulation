
public class MaxBinaryGap {

	public int solution(int N){
		int max = 0;
		int count = -1;
		int r = 0; // right most bit
		
		while(N > 0){
			//get right most bit and shift right
			r = N & 1;
			N = N >> 1;
			if(r == 0 && count >= 0){
				count++;
			}
			//if right most bit is 1, update max and count
			if(r==1){
				max = count > max ? count : max;
				count = 0;
			}
			//keep updating max until the number becomes zero
		}
		
		return max;
	}
	
	
	public static void main(String[] args) {
		MaxBinaryGap mbg = new MaxBinaryGap();
		int N = 65;
		System.out.println(mbg.solution(N));
	}

}
