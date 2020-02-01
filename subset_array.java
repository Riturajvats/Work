  // Method to find sum of the product of elements of all possible subArrays
package subset;

import java.util.*;
public class subset_array {
		  public static void main(String args[]) {
		      Scanner s = new Scanner(System.in);
		      int n = s.nextInt();
		      int arr[] = new int[n];
		      System.out.print("Enter the value");
		      for (int i = 0; i < n; i++)
		          arr[i] = s.nextInt();
		      sumOfProductOfSubsets(arr, n);
		  }
		  static void sumOfProductOfSubsets(int arr[], int n) {
		      // Wite your code here
		     
		     int zum=0;
		     for(int i=0;i<arr.length;i++)
		     {
		        if(arr[i]<0)
		        {
		            zum=1;
		            break;
		        }
		         
		     }
		   
		    if(zum==0)
		    {
		       int q=1;
		       for(int k=0;k<n;k++)
		       {
		           q=q*(arr[k]+1);
		         
		           
		       }
		         System.out.println(q-1);
		    }
		    else{
		        System.out.println("Invalid Input");
		    }
		   
		     
		  }
		
	}


