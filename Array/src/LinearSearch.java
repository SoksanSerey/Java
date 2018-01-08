import java.util.Scanner;


public class LinearSearch {
	public static int Lsearch(int a[],int ele,int s){
		int pos=-1;
		for(int i=0;i<s;i++){
			if(a[i]==ele){
				pos=1;
				return pos;
			}
		}
		return pos;
	}
	public static void main(String[] args) {
		int a[]=new int[35],ele,pos,size;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		size=s.nextInt();
		System.out.println("Enter the Array ele");
		for(int i=0;i<size;i++){
			a[i]=s.nextInt();
		}
		System.out.println("Enter the ele to be found ");
		ele=s.nextInt();
		pos=Lsearch(a,ele,size);
		if(pos==-1){
			System.out.println("Element not found");
		}
		else{
			System.out.println("Element found at "+pos);
		}
	}

}
