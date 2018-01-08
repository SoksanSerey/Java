package Ex;

import java.util.Scanner;

public class BiggestValue 
{
	public static void main(String[] args) 
	{
		int a[]=new int[5];
		int temp;
		Scanner san=new Scanner(System.in);
		System.out.println("Enter the 5 values to array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=san.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>a[i+1])
			{
				temp=a[i];
			}
			else
			{
				temp=a[i++];
			}
		}
	}

}
