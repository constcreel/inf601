public class ThirdEx {
	public static void main(String[] args) {
		int arr[] = {3,5,7,1,2};
		System.out.println(find(arr,31));
	}
	static int find(int[] array, int x) {
		int i = 0;
		while (i < array.length) {
			if (array[i] == x) {
				return i;
			}
			i++;
			
		}
		return -1;

	}
	
}