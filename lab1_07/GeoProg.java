// 2. Найти сумму геометрической прогрессии
public class GeoProg {
	public static void main(String[] args) {
		double a = sum(4,1,2);
		System.out.println(a);
	}

	public static double sum(int n, int p, int r) {
		if (n == 1) {return p;}
		return sum(n-1,p,r) + exp(r,n-1);
	}
	public static double exp(int n,int k) {
		double t = 1;
		for (int i = 1; i <= k; i++) {
			t*=n;
		}
		return t;
	}
}