import java.util.Scanner;


public class SumOfArray {

	public static void main(String[] args) {
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		System.out.println("Enter the array A ");
		Scanner san=new Scanner(System.in);
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				a[i][j]=san.nextInt();
			}
		}
		System.out.println("Enter the array B ");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				b[i][j]=san.nextInt();
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
