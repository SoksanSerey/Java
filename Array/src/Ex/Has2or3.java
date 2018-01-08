package Ex;

import java.util.Scanner;

public class Has2or3 
{

	public static void main(String[] args) 
	{
		int a[]=new int[2];
		Scanner san=new Scanner(System.in);
		System.out.println("Enter the value of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=san.nextInt();
		}
		if(a[0]==2||a[1]==2||a[0]==3||a[1]==3)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

}
