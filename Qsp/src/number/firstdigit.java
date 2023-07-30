package number;

public class firstdigit {
         //sample output
	public static void main(String[] args) {
        int i =18979;
        int Firstnum=0;
        while(i>0) {
        	Firstnum=i%10;
        	i=i/10;
        	
        }
        System.out.print(Firstnum);
	}

}
