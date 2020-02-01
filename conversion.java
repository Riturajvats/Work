//Convert to lowercase to uppercase
//Convert  to uppercse to lowercse
public class MyClass {    
    public static void main(String[] args) {    
     String str1="Great Power";    
        StringBuffer Str=new StringBuffer(str1);    
            
        for(int i = 0; i < str1.length(); i++) {    
                
           if(Character.isLowerCase(str1.charAt(i)))
           {
               Str.setCharAt(i,Character.toUpperCase(str1.charAt(i))); //convert into uppecrase
           }
           else
           {
                Str.setCharAt(i,Character.toLowerCase(str1.charAt(i))); //convert into lower case
           }
        }
        System.out.println("Afer conversion "+ Str);
    }
}