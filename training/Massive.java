public class Massive {
	public static void main(String args[]) {
		int[] a = {1,2,2,3,3,3,3,4,2,2,2};
		int[] b = {2,2,3,3,3,5,4,2,2,2};
		int[] t = add(a,b);
		printMas(t);
	}
	public static void printMas(int[] a) {
		for (int x : a) {
			System.out.println(x);
		}
	}
	public static int sum(int[] a) {
		int s = 0;
		for (int x : a) {
			s += x;
		}
		return s;
	}
	public static void divMx(int[] a) {
		int mx = a[0];
		for (int x : a) {
			mx = x > mx ? x : mx;
		}
		for (int i = 0; i < a.length; i++) {
			a[i]/=mx;
		}

	}
	public static int[] set(int[] a) {
		
		int n = a.length;
		boolean[] flags = new boolean[n];
		for (int i = 0; i < n; i++) {
			flags[i] = true;
		}
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (a[i] == a[j]) {
					flags[j] = false;
				}
			}
		}
		int countN = 0;
		for (int i = 0; i < n; i++) {
			if (flags[i] == true) countN++; 
		}
		int[] res = new int[countN];
		int index = 0;
		for (int i = 0; i < n; i++) {
			if (flags[i] == true) res[index++] = a[i]; 
		} 
		return res;

	}

	public static int[] add(int[] a, int[] b) {
		int t = a.length + b.length;
		int[] c = new int[t];
		for (int i = 0; i < a.length; i++) c[i] = a[i];
		for (int i = 0 ; i < b.length; i++) c[a.length + i] = b[i];
		return set(c); 


	}
}