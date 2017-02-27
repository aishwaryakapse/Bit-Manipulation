
public class CountingBits {
	
	public int[] countingBits(int n){
		int[] result = new int[n+1];
		int p = 1;
		int pow = 1;
		for(int i = 1; i<=n; i++){
			if(i == pow){
				result[i] = 1;
				pow = pow << 1;
				p = 1;
			}else{
				result[i] = result[p] + 1;
				p++;
			}
		}
		return result;
	}
	
	public int[] countingBits_Man(int n){
		int[] result = new int[n+1];
		for(int i = 1; i <= n; i++){
			result[i] = Integer.bitCount(i);
		}
		return result;
	}
	
	public int[] countBits(int num) {
	    int[] result = new int[num+1];
	 
	    for(int i=0; i<=num; i++){
	        result[i] = countEach(i);
	    }
	 
	    return result;
	}
	 
	public int countEach(int num){
	    int result = 0;
	 
	    while(num!=0){
	        if(num%2==1){
	            result++;
	        }
	        num = num/2;
	    }
	 
	    return result;
	}
	
	public static void main(String[] args) {
		CountingBits cb = new CountingBits();
		int n = 2;
		int[] result = cb.countingBits(n);
		int[] result1 = cb.countingBits_Man(n);
		int[] result2 = cb.countBits(n);
		for(int i = 0; i < result.length; i++){
			System.out.print(result[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < result1.length; i++){
			System.out.print(result1[i]+" ");
		}
		System.out.println();
		for(int i = 0; i < result2.length; i++){
			System.out.print(result2[i]+" ");
		}
		
	}

}
