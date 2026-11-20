import java.util.Scanner;
public class plusminus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int a = nextInt();
		String t = sc.nextLine();
		int b = nextInt();
		
		int res = 0;
		switch (t) {
			case ("+"):
				res = a+b; break;
			case ("-"):
				res = a-b; break;
			case ("*"):
				res = a*b; break;
			case ("/"):
				res = a/b; break;
		} 
		
		while (t != "=") {
			t = sc.nextLine();
			b = sc.nextInt();
			switch (t) {
				case ("+"):
					res = res+b; break;
				case ("-"):
					res = res-b; break;
				case ("*"):
					res = res*b; break;
				case ("/"):
					res = res/b; break;
			}
			System.out.println(res);
		}
		System.out.println(res);
	}
}