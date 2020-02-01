// Programn to print the array in the asscending order
import java.util.*;
public class MyClass  
{    
    public static void main(String[] args) {    
  int n,temp;
   Scanner s1=new Scanner(System.in);
  System.out.println("Enter the size of the array");
  n=s1.nextInt();
   int arr[]=new int[n];
   System.out.println("Enter elements");
   for(int i=0;i<n;i++)
   {
       arr[i]=s1.nextInt();
   }
   for(int i=0;i<n;i++)
   {
       for(int j=i+1;j<n;j++)
       {
           if(arr[i]>arr[j])
           {
           temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
       }
       }
   }
   System.out.println("Accending order: ");
   for(int i=0;i<n-1;i++)
   {
       System.out.println(arr[i]+ " ");
   }
   System.out.println(arr[n-1]);
}
}