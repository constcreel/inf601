public class Fib {
	public static void main() {
		int a[] = new int[10];
		// fillArrayByFibbonacci(a);
		// for (int b: a) {
		// 	System.out.println(b);
		// }
		for (int i = 0; i < a.length; i++) {
			a[i] = f(i);
			System.out.print(a[i]);
		}
	}
	public static void fillArrayByFibbonacci(int[] a) {
		a[0] = 0;
		a[1] = 1;
		for (int i = 2; i < a.length; i++) {
			a[i] = a[i-2] + a[i-1];
		}
	}
	public static int f(int n) {
		if (n > 2) {
			return f(n-2) + f(n-1);
		}
		if (n == 0) {return 0;}
		return 1;
	}
}

