package assignments.assignment06;

public class question04 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 7; i++) {
			
			for(int j = 1; j <= i; j++) {
				
				if(j % 2 != 0) {
					System.out.print("1");
				}
				if(j % 2 == 0) {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}

}
