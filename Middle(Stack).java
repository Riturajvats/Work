package Stack;
import java.util.Stack;
public class middle {

	public static void middle_element(Stack <Integer> s1,int n,int curr)
	{
		if(s1.isEmpty() || curr==n)
		{
			return;
		}
		int x=s1.pop();
		middle_element(s1,n,curr+1);    //Recursive call
		if(curr!=n/2)
		{
			s1.push(x);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack <Integer>s1 =new Stack<>();
	s1.push(1);
	s1.push(2);
	s1.push(3);
	s1.push(4);
	s1.push(5);
	s1.push(6);
	s1.push(7);
	middle_element(s1,s1.size(),0);    //Recursive call
	//print the stack after deletion of the middle element
	while(!s1.isEmpty())
	{
		int p=s1.pop();
		System.out.println("stack is: "+p);
	}
	}

}
