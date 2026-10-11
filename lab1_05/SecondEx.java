public class SecondEx {
	public static void main(String[] args) {
		System.out.println(sin(3.1415/2));
	}
	static double sin(double x) {
		double a = x;
		double epsilant = 1e-6;
		int n = 1;
		double s = x;
		int sign = -1;
		while (a > epsilant || a < -epsilant) {
			
			a = a * x * x / (n+1) / (n+2);
			s += a * sign;
			sign = -sign;
			
			n += 2;
	

		}
		return s;

	}
	
}