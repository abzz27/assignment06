package assignments.assignment06;

public class question01 {

	public static void main(String[] args) {

		int c = 6;		
		for (int a = 1;a <= 13; a++) {
			
			if(a <= 7) {
				for (int b = 1; b <= a; b++) {
					System.out.print(b + " ");

				}	
			}else {
				for(int d = 1; d <= c; d++) {
					System.out.print(d + " ");
					
				}
				c--;
			}
			
			
			System.out.println();
		}
	}

}
