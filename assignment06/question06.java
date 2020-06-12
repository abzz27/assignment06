package assignments.assignment06;

public class question06 {

	public static void main(String[] args) {
		
		int row = 5;
		for(int i = 1; i <= row; i++) {
			
			int num = i;
			
			for(int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num = num + row - j;
			}
			System.out.println();
		}
	}

}
