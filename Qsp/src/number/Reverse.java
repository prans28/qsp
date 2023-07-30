package number;
import java.util.Scanner; 
public class Reverse {
	public static void main(String[] args) {
		//sample input 1234
		// sample output 4321
		Scanner sc = new Scanner(System.in);
		System.out.print("enter name you want to rev : ");
		int num = sc.nextInt(); 
		int rev = 0; 
		while(num!=0) {
			rev = rev*10 + num%10; 
			num = num/10;
		}
		System.out.print(rev);
     
	}

}
