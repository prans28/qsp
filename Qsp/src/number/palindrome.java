package number;

public class palindrome {
	// sample input 1221 
		// sample output 1221
		public static void main(String[] args) {
			int num = 1221 ; int rev = 0 ;int temp=num;
			while(num!=0) {
				rev = rev*10 + num%10; 
				num =num/10; 
				
			}
			System.out.print((rev==temp)?"palindrome": "not a palindrome");
	       
		}

	}

