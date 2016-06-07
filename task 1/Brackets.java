package test_1;

import java.util.Scanner;

public class Brackets {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
	        
	        int [] C = new int [n+1];    //Create an array to store
	                
	            C[0]=1; 
	              for (int i=1; i<=n; i++)   //Calculate array for i = n
	              { 
	                C[i]=0; 
	                for (int j=0; j<i; j++) 
	                  C[i]+=C[j]*C[i-1-j]; 
	              }             
	           System.out.println(C[n]);
	}

}
