public class SplitNum {
	public static void main(String[] args) {
		String t = split(123123131);
		System.out.println(t);
	}

	public static String split(int n) {
		if (n < 10) {
			return n + "";
		}
		return split(n/10) + " " + n%10;

	}

	
}