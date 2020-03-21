package LinkedList;
import java.util.*;
public class RevRec {
      int rev=0;
	public void rev(int n)
	{
		int rem;
		if(n!=0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
			rev(n); //recursive
		}
		else
		{
			System.out.println("Reverse  number: "+rev);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x=s.nextInt();
		RevRec obj=new RevRec();
		obj.rev(x);
	}

}
