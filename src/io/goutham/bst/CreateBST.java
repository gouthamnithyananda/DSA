package io.goutham.bst;

public class CreateBST {

	public static void main(String[] args) {
		BSTNode node = null;
		CreateBST createbst = new CreateBST();
		node = createbst.insert(node,10);
		node = createbst.insert(node,12);
		node = createbst.insert(node,9);
		node = createbst.insert(node,8);
		node = createbst.insert(node,15);
    System.out.println(createbst.search(node,14));
	}
	
	private int search(BSTNode node , int data) {
		int result=0;
		if(node==null)return result;
		if(node.data==data) return data;
		
	if(data<=node.data)result=search(node.left,data);
	if(data>node.data)result=search(node.right,data);
	return result;
	}
	
	private BSTNode insert(BSTNode node , int data) {
	  if(node==null) {
		  node = getNewNode(data);
	  }else if(data <= node.data) {
		  node.left = insert(node.left,data);
	  }else if(data>node.data) {
		  node.right = insert(node.right,data);
	  }
		return node;
	}

	private BSTNode getNewNode(int data) {
		BSTNode node = new BSTNode();
		node.data=data;
		return node;
	}

}
