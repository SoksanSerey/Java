package Ex;

import java.util.Scanner;

public class Sum2Arrays 
{

	public static void main(String[] args) 
	{
		int a[]=new int[3];
		int sum;
		Scanner san=new Scanner(System.in);
		System.out.println("Enter the value of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=san.nextInt();
		}
		sum=a[0]+a[1];
		System.out.println(sum);
	}

}
