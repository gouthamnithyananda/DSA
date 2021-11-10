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
		node = createbst.insert(node,6);
		node = createbst.insert(node,15);
		node = createbst.insert(node,2);
		node = createbst.insert(node,7);
		node = createbst.insert(node,11);
    System.out.println(createbst.search(node,14));
    System.out.println(createbst.findMin(node));
    System.out.println(createbst.findMax(node));
    System.out.println("height:"+createbst.findHeight(node));
    createbst.levelOrderTraversal(node);
    System.out.println("");
    createbst.preOrderTraversal(node);
    System.out.println("");
    createbst.inOrderTraversal(node);
    System.out.println("");
    createbst.postOrderTraversal(node);
    System.out.println(createbst.isBST(node));
    
    System.out.println("Calling delete!!");
    createbst.delete(node, 12);
    createbst.inOrderTraversal(node);
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
	
	private void preOrderTraversal(BSTNode node) {
		if(node==null)return;
		System.out.print(node.data + " ");
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}
	private void inOrderTraversal(BSTNode node) {
		if(node==null)return;
	
		inOrderTraversal(node.left);
		System.out.print(node.data + " ");
		inOrderTraversal(node.right);
	}
	
	private void postOrderTraversal(BSTNode node) {
		if(node==null)return;
	
		inOrderTraversal(node.left);
		inOrderTraversal(node.right);
		System.out.print(node.data + " ");
		
	}
	
	private Boolean isBST(BSTNode node) {
		return isBSTUtil(node,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}


	private Boolean isBSTUtil(BSTNode node, int minValue, int maxValue) {
		if(node==null)return true;
		
		if(node.data>minValue && node.data<maxValue &&
				isBSTUtil(node.left,minValue,node.data)&&
				isBSTUtil(node.right,node.data,maxValue))
			return true;
		else
		return false;
	}
	
	
	private BSTNode delete(BSTNode node, int val) {
		if(node==null) return node;
		if(node.data>val) {node.left = delete(node.left,val);}
		else if(node.data<val) {node.right = delete(node.right,val);}
		else {
			if(node.right==null && node.left==null) {
				node =null;
			}else if(node.left==null) {
				node=node.right;
			}else if(node.right==null) {
				node=node.left;
			}else {
				int minNodeVal = findMin(node.right);
				node.data=minNodeVal;
				node.right=delete(node.right,minNodeVal);
			}
		}
		
		
		
		return node;
	}

}
