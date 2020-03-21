package BinaryTree;

class Node
{
  int data;
  Node left;
  Node right;
}
class binary
{
 public Node createNode(int x)
 {
	 Node a=new Node();
	 a.data=x;
	 a.left=null;
	 a.right=null;
        return a;
   } 

}
public class CreateBT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         binary a=new binary();
         Node root=a.createNode(1);
         Node left=a.createNode(2);
         Node right=a.createNode(3);	
	}

}
