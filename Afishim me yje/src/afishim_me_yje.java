import java.util.Scanner;
public class afishim_me_yje {

	public static void main(String[] args) {
		int n;
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		char y='*';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(y);
			}
			System.out.println();
		}
		

	}

}
