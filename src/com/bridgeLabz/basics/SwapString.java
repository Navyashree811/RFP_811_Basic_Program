package com.bridgeLabz.basics;

public class SwapString {  
	public static void main(String[] args) {  
		int []x = {1,0,1,0,1,0,1,0};
//		double num=0;
//		int l=0;
//		for(int i=7;i>=0;i--)
//		{
//			num=num+((y[i])*(Math.pow(2,l)));
//		l++;
//		}
//		//return (int)num;
//		System.out.println(num);
		
		int[] arr_new = new int[8]; 
		int p=0;
		int q=4; 
		for(int i=0;i<=7;i++)
		{
			if(i<=3)
			{
				arr_new[q]=x[i];
			q++;
			}
			else
			{
				arr_new[p]=x[i]; 
			p++;
			}
		}
		for( int z :arr_new ) {
			System.out.print(z);
		}
	}
	

}
