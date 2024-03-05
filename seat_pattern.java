package nothing;
import java.util.*;
public class seat_pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 5;
		
		for(int a=n;a>=1;a--) {	
		for(int b=1;b<=n-a;b++) {
			System.out.print(" ");
		}
		for(int b=1;b<=2*a-1;b++) {
			System.out.print("*");
		}
		System.out.println();
	  }
		for(int a=2;a<=n;a++) {
			for(int b=1;b<=n-a;b++) {
				System.out.print(" ");
			}
			for(int b=1;b<=2*a-1;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
