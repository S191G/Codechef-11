import java.util.*;
import java.lang.*;
import java.io.*;

class CheffDolls
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0){
		    int n = sc.nextInt();
		    int [] arr = new int[n];
		    
		    for (int i=0;i<n ;i++ ){
		        arr[i]=sc.nextInt();
		    }
		    int ans = 0;
		    for(int i=0; i<n;i++){
		        ans ^=arr[i];
		    }
		    System.out.println(ans);
		}
		sc.close();

	}
}
