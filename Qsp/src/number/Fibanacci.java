package number;
public class Fibanacci {
		public static void main(String[] args) {
			//Sample output  0 1 1 2 3 5 8 .......
			int sum = 0 ; 
			int a = 0; 
			int b = 1; 
			System.out.print(a+ " " +b);
			for(int i = 2 ; i<10 ; i++) {
				sum = a+b; 
				System.out.print(" "+ sum);
				a = b; 
				b = sum;
				
			}
	}

}
