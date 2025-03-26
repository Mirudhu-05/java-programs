class BinarySearchTree{
//node structure for the Binary Search tree
static class Node{
  int data;
  Node left,right;
  
  public Node(int item){
    data=item;
    left=right=null;
  }
}
Node root;
//constructor
public BinarySearchTree(){
  root=null;
}
public Node insert(Node root,int Key){
  if (root==null){
     root=new Node(Key);
     return root;
  }
if(Key<root.data){
  root.left=insert(root.left,Key);
}else if (Key>root.data){
  root.right=insert(root.right,Key);
}
  return root;
}
public Boolean search(Node root,int Key){
if(root==null){
  return false;
}
if (root.data==Key){
  return true;
}
if(Key>root.data){
  return search(root.right,Key);
}
return search(root.left,Key);
}
public void inorder(Node root){
 if(root!=null){
   inorder(root.left);
   System.out.print(root.data + " ");
   inorder(root.right);
 }
}
public static void main(String[] args){
 BinarySearchTree tree=new BinarySearchTree();
tree.root=tree.insert(tree.root , 50);
tree.root=tree.insert(tree.root , 30);
tree.root=tree.insert(tree.root , 20);
tree.root=tree.insert(tree.root , 40);
tree.root=tree.insert(tree.root , 70);
tree.root=tree.insert(tree.root , 60);
tree.root=tree.insert(tree.root , 80);
System.out.print("Inorder traversal of the BST: ");
tree.inorder( tree.root );
System.out.println();
int KeyToSearch=40;
System.out.println("Searching for node with Key: " + KeyToSearch);
if (tree.search(tree.root,KeyToSearch)){
  System.out.println("Node with Key " + KeyToSearch + " found");
}else{
  System.out.println("Node with Key " + KeyToSearch + " not found");
}
KeyToSearch=90;
System.out.println("Searching for node with key: "+ KeyToSearch);
if(tree.search(tree.root,KeyToSearch)){
System.out.println("Node with Key " + KeyToSearch + " found.");
}else{
System.out.println("Node with Key " + KeyToSearch + " not found");
}
}
}

