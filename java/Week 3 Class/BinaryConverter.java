public class BinaryConverter {
	
	public static void main(String[] args) {
		for (int i = -5; i < 33; i++) {
			System.out.prinln(i+ ": " + toBinary(i));
			System.out.prinln(i);
		}
	}
	public static String toBinary(int base10Num) {
		boolean isNeg = base10fNum < 0;
		base10Num = Math.abs(base10Num);
		String result = "";
		
		while(base10Num > 1) {
			result = (base10Num % 2) + result;
			base10Num /=2;
		}
		
		result = base10Num + result;
		
		if( isNeg )
			result = "-" + result;
		return result;
	}
	
	public static boolean all0sAnd1s(String val) {
		boolean all = true;
		int i = 0;
		char c;
		
		while(all && i < val.length()) {
			c = val.charAt(i);
			all = c == '0' || c == '1';
			i++
		}
		return all;
	}
}