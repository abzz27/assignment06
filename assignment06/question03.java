package assignments.assignment06;

public class question03 {

	public static void main(String[] args) {
		
		int num = 7;
		for (int i = 1; i <= num; i++) {
             
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }            
            for (int j = i; j <= num; j++) { 
                System.out.print(j+" "); 
            }       
            System.out.println(); 
        }          
        for (int i = num-1; i >= 1; i--) {            
            
        	for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }             
            for (int j = i; j <= num; j++){
                System.out.print(j+" ");
            }            
            System.out.println();
        }
	}

}
