import java.util.Scanner;


public class MergeArray {
	/*public static void Merge(int a[],int b[]){
	
	}*/
	public static void main(String[] args) {
		int a[]=new int[20],b[]=new int[20],size,sa,sb;
		int c[]=new int[20];
		Scanner san=new Scanner(System.in);
		System.out.println("Enter the size of array A:");
		sa=san.nextInt();
		System.out.println("Enter the size of array B:");
		sb=san.nextInt();
		size=sa+sb;
		System.out.println("Enter the ele of array A");
		for(int i=0;i<sa;i++){
			a[i]=san.nextInt();
		}
		System.out.println("Enter the ele of array B");
		for(int i=0;i<sb;i++){
			b[i]=san.nextInt();
		}
		for(int i=0;i<sa;i++){
			c[i]=a[i];
		}
		for(int i=size-1,j=0;i>=sa;i--){
			c[i]=b[j++];
		}
		for(int i=0;i<size;i++){
			System.out.print(c[i]+" ");
		}
	}
}
