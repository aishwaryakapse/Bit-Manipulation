
public class MaxProductWord {
	public int maxProduct(String[] words) {
		if(words == null || words.length == 0) {
			return 0;
		}
		int[] arr = new int[words.length];
		for(int i = 0; i < words.length; i++) {
			for(int j = 0; j<words[i].length(); j++) {
				char c = words[i].charAt(j);
				arr[i] = arr[i] | (1<<(c-'a'));
			}
		}
		
		int result = 0;
		for(int i =0; i<words.length; i++) {
			for(int j = i+1; j<words.length; j++){
				if((arr[i] & arr[j]) == 0) {
					return Math.max(result, words[i].length()*words[j].length());
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		MaxProductWord mpw = new MaxProductWord();
		String[] words = {"Aishwarya", "Kapse", "Lively", "Betu"};
		System.out.println("The Max Product Word Length is: "+mpw.maxProduct(words));
	}

}
