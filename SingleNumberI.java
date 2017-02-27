/* All numbers come twice except for one. Output that number */


import java.util.HashSet;
import java.util.Iterator;

public class SingleNumberI {

	public int singleNumber_XOR(int[] A){
		
		int x = 0;
		for(int a : A){
			x = x ^ a;
		}
		
		return x;
	}
	
	public int singleNumber_HashSet(int[] A){
		HashSet<Integer> set = new HashSet<Integer>();
		for(int a : A){
			if(!set.add(a)){
				set.remove(a);
			}
		}
		Iterator<Integer> it = set.iterator();
		return it.next();
	}
		
	public static void main(String[] args) {
	SingleNumberI sni = new SingleNumberI();
	int[] A = {3, 2, 2, 3, 5};
	int num = sni.singleNumber_XOR(A);
	System.out.println(num);
	num = sni.singleNumber_HashSet(A);
	System.out.println(num);
	}
}
