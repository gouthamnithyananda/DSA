package io.goutham.bst;

import java.util.LinkedList;
import java.util.Queue;

public class CreateBST {

	public static void main(String[] args) {
		BSTNode node = null;
		CreateBST createbst = new CreateBST();
		node = createbst.insert(node,10);
		node = createbst.insert(node,12);
		node = createbst.insert(node,9);
		node = createbst.insert(node,8);
		node = createbst.insert(node,15);
		node = createbst.insert(node,7);
    System.out.println(createbst.search(node,14));
    System.out.println(createbst.findMin(node));
    System.out.println(createbst.findMax(node));
    System.out.println(createbst.findHeight(node));
    createbst.levelOrderTraversal(node);
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
	
	private int findMin(BSTNode node) {
		if(node==null) return -1;
		
		if(node.left==null)return node.data;
		return findMin(node.left);
	}
	private int findMax(BSTNode node) {
		if(node==null) return -1;
		
		if(node.right==null)return node.data;
		return findMax(node.right);
	}
	
	private int findHeight(BSTNode node) {
		if(node==null)return -1;
		int leftHeight = findHeight(node.left);
		int rightHeight = findHeight(node.right);
		return Math.max(leftHeight, rightHeight)+1;
	}
	
	private void levelOrderTraversal(BSTNode node){
		if(node==null)return;
		BSTNode currentNode = node;
		Queue<BSTNode> tmpQ = new LinkedList<BSTNode>();
		tmpQ.add(node);
		while(!tmpQ.isEmpty()) {
			currentNode=tmpQ.peek();
			System.out.print(currentNode.data + " ");
			if(currentNode.left!=null)tmpQ.add(currentNode.left);
			if(currentNode.right!=null)tmpQ.add(currentNode.right);
			tmpQ.remove();
		}
		
		
	}

}
