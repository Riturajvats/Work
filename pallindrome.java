//Find the pallindrome

public class MyClass {    
    public static void main(String[] args) {    
      String str = "nitin";    
      String rev="";
      int l=str.length();
      for(int i=l -1;i>=0;i--)
      {
          rev=rev+str.charAt(i);
      }
      if(str.equals(rev))
      {
          System.out.println("Pallindrome");
      }
      else
      {
           System.out.println("not a Pallindrome");
      }
    }
}