package com;

public class Testarray {  
		public static void main(String args[])
		{  
		int a[][]={{7,4,10},{8,10,12}};  
		int b[][]={{4,3,9},{2,4,6}};  
		int c[][]=new int[2][3]; 
		int x[][]=new int[2][3];
		for(int i=0;i<2;i++){  
		for(int j=0;j<3;j++){  
		c[i][j]=a[i][j]+b[i][j]; 
		x[i][j]=a[i][j]-b[i][j]; 
		System.out.print(c[i][j] +" ");
		System.out.println(x[i][j] +" ");  
		}
		System.out.println();
		}  
		  
		}
}

	

