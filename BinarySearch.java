public class BinarySearch{
  class Node{
    int key;
    Node left,right;
    public Node(int item){
      key=item;
      left=right=null;
    }
}
Node root;
BinarySearch(){
  root=null;
}
void insert(int key){
  root=insertRec(root,key);
}
Node insertRec(Node root,int key){
  if(root==null){
     root=new Node(key);
     return root;
  }
  if(key<root.key)
     root.left=insertRec(root.left,key);
  else if(key>root.key)
     root.right=insertRec(root.right,key);
  return root;
  }
  void printSearch(){
      printSearch(root);
  }
  void printSearch(Node node)
{
    if(node!=null){
    printSearch(node.left);
    System.out.print(node.key+" ");
    printSearch(node.right);
    }
}
public static void main(String[] args){
   BinarySearch search=new BinarySearch();
     search.insert(50);
     search.insert(30);
     search.insert(20);
     search.insert(40);
     search.insert(70);
     search.insert(60);
     search.insert(100);
   System.out.println("Binary search Tree:");
     search.printSearch();
   }
}
