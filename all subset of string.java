// print all possible subset of string 
public class MyClass {
    public static void main(String args[]) {
        String str="FUN";
         int l=str.length();
         int temp=0;
         String arr[]=new String[l*(l+1)/2];
         for(int i=0;i<l;i++)
         {
             for(int j=i;j<l;j++)
             {
                 arr[temp] = str.substring(i,j+1);
                 temp++;
             }
         }
        System.out.println("all subsets of given string are: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
