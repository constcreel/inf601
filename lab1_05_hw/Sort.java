public class Sort {
	public static void main(String[] args) {
		int[] a = {4,2,3,1,7,5,6};
		sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	static int max_i(int[] arr, int len) {
		int mx_n = arr[0];
		int mx_ind = 0;
		for (int i = 0; i <= len; i++) {
			if (arr[i] > mx_n) {
				mx_n = arr[i];
				mx_ind = i;
			}
		}
		return mx_ind;
	}
	static void sort(int[] a) {
		int n = (a.length)-1;
		while (n > 0) {
			int t = a[n];
			int mx_ind = max_i(a,n);
			a[n] = a[mx_ind];
			a[mx_ind] = t;
			


			n-=1;
		}
	}
}