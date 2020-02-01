// To print the repeated character in given two strings

package ClassQuestion;

public class pattern {

	public static int func(String input,String patrn)
	{
		int i=0;
		while(i<input.length())
		{
			int x=i;
			int j=0;
		while(j<patrn.length() && input.charAt(x)==patrn.charAt(j))
		{
			x++;
			j++;
			if(j==patrn.length())
			
				return i;
			
		}
		i++;
	}
		return -1;
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s1="abcdefsh";
      String patrn="def";
	System.out.println(func(s1,patrn));
  }

}
