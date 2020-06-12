package assignments.assignment06;

public class question02 {

	public static void main(String[] args) {
		
		int c = 7;
		int e = 1;
		for (int a = 13;a >= 1; a--) {
			
			if(a > 7) {

				for(int b = 1; b <= c; b++) {
					System.out.print(b + " ");
					
				}
				c--;
			}else {
				
				for (int d = 1; d <= e; d++) {
					System.out.print(d + " ");
				}
				e++;
			}
			System.out.println();
		}
	}
}

