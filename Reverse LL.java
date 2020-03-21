package ImportantQ;

class Node
{
  int data;
  Node next;
  Node(int data)
  {
	  this.data=data;
  }
}
public class Reverse {
      static Node head;
      public void insert(int n)
      {
     	 Node temp=new Node(n);
     	 if(head==null)
     	 {
     		
     		 head=temp;
     		 return;
     	 }
     	 
     	 temp.next=head;
     	 head=temp;
      }
      public Node revrec(Node curr)
     {
      curr=head;
      if(curr==null)
      {
    	  return null ;
      }
      else if(curr.next==null)
      {
    	  return curr ;
      }
      else
      {
    	  Node newNode=curr.next;
    	  curr.next=null;
    	  Node rest= revrec(newNode);
    	  newNode.next=curr;
    	  return rest;
      }

    }
      public Node  nthNode(int n)   //Nth node from end of linked list
      {
    	  if(head==null)
    	  {
    		  return null;
    	  }
    	  if(n<=0)
    	  {
    		  throw new IllegalArgumentException("Invalid value n = "+n );
    	  }
    	  Node mainptr=head;
    	  Node refptr=head;
    	  int count=0;
    	  while(count<n)
    	  {
    		  refptr=refptr.next;
    		  count++;
    	  }
    	  while(refptr!=null)
    	  {
    		  refptr=refptr.next;
    		  mainptr=mainptr.next;
    	  }
    	 return mainptr;
      }
     public void display()
     {
    	 Node temp=head;
    	 while(temp!=null)
    	 {
    		 System.out.print(temp.data+" ");
    	   temp=temp.next;
    	 }
    	 System.out.println(" ");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Reverse obj=new Reverse();
          obj.insert(5);
          obj.insert(4);
          obj.insert(3);
          obj.display();
          obj.revrec(head);
          obj.display();
          obj.nthNode(2);
          
		System.out.println("nth node from end  is: "+mainptr.data);
	}

}
