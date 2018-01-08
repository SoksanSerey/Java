import java.util.Scanner;


public class Star {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number of line you want to see: ");
		n=new Scanner(System.in).nextInt();
		for(int i=1;i<=n;i++){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
