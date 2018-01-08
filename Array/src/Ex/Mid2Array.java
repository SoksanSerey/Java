package Ex;

import java.util.Scanner;

public class Mid2Array 
{

	public static void main(String[] args) 
	{
		int a[]=new int[3];
		int b[]=new int[3];
		int c[]=new int[2];
		Scanner san=new Scanner(System.in);
		System.out.println("Enter the value of array A");
		for(int i=0;i<a.length;i++)
		{
			a[i]=san.nextInt();
		}
		System.out.println("Enter the value of array B");
		for(int i=0;i<b.length;i++)
		{
			b[i]=san.nextInt();
		}
		c[0]=a[1];
		c[1]=b[1];
		System.out.print("The array C is ");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}

}
