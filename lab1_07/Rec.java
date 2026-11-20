public class Rec {
	public static void main(String[] args) {
		System.out.println(t(10));
	}
	public static int t(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return 3 * t(n-1) - 5 * t(n-2);
	}
}