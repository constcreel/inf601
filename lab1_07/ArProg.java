public class ArProg {
	public static void main(String[] args) {
		System.out.println(s(4,1,2));
	}

	public static int s(int n, int p, int r) {
		if (n == 1) {
			return p;
		}
		return s(n-1,p,r) + p + r * (n-1);
	}
}