package com.greatlearning.iitr.dsa.labsession2;


import java.util.Scanner;

public class TransactionTarget {
	
	static int sum;
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size=sc.nextInt();			// size the number of total transactions that will be completed
		int i;
		int trans[]=new int[size];

		for(i=0;i<size;i++)
		{
			System.out.println("Enter Values of the array");
			trans[i]=sc.nextInt();
		}

		System.out.println("Enter the number of Targets");
		int targets=sc.nextInt();			// targets: these are the values of totals that sum of transactions must be equal to or more  
		int flag;
		for(i=1;i<=targets;i++)
		{
			sum=0;
			flag=0;    //target not met

			System.out.println("Enter the target Amount  number " + i);
			int target=sc.nextInt();  //the i-th  target is input 

			for(int j=0;j<trans.length;j++)
			{
				sum+=trans[j];
				if(sum>=target)
				{
					flag=1;
					System.out.println("Target achieved after " + (j+1) +  " transaction(s).");
					break;
				}
			}
			
			if(flag==0)
				System.out.println("Given target+  "  + i + " is not achieved.");
		}

		System.out.println("Thank You!Execution completed");
	} 
}