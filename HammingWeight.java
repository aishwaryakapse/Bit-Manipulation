
public class HammingWeight {

	public int hamming(int n){
		System.out.println("The number in decimal form is: " +n);
		//say the number of bits in the int are 
		System.out.println("Bit Representation of the number is: "+Integer.toBinaryString(n));
		int count =0;
		for(int i =0; i < Integer.toBinaryString(n).length(); i++){
			if(getBit(n , i) == true){
				count++;
			}
		}
		System.out.println("No. of Ones using Direct Method: "+Integer.bitCount(n)); // direct method to count the no of ones
		return count;
	}
	
	public boolean getBit(int n, int i){
		return ((n & (1<<i)) != 0);
	}
	
	public static void main(String[] args) {
		HammingWeight hw = new HammingWeight();
		int n = 77;
		System.out.println("No. Of Ones using Code: " +hw.hamming(n));
	}

}
