
public class SumOfTwo {
	
	public int add(int a, int b) {
		if(b == 0) {
			return a;
		}
		
		int sum = a^b;
		int carry = (a&b) << 1;
		return add(sum, carry);
	}
	public static void main(String[] args) {
		SumOfTwo sot = new SumOfTwo();
		System.out.println("The sum of two integers 3 and 7 is : " + sot.add(3, 7));
	}

}
