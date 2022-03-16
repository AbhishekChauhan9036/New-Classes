/*
	PreOrderTraversal this tree-------------------------

			    1
			   /\
			  /	 \
			 2    3
			/\	   \
		   /  \		\
		  4    5     6

*/
import java.util.Scanner;
public class PreeOrderTraversal{

	static class Node{
		int data;
		Node left;
		Node right;

		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}


	static class BinaryTree{
		static int index=-1;
		public static Node buidTree(int nodes[]){
			index++;
			if(nodes[index]==-1){
				return null;
			}

			Node newNode =new Node(nodes[index]);
			newNode.left=buidTree(nodes);
			newNode.right=buidTree(nodes);

			return newNode;
		}
	}
	public static void preeOrder(Node root){
		if(root ==null){
			return;
		}

		System.out.print(root.data+" ");
		preeOrder(root.left);
		preeOrder(root.right);

	}
	public static void main(String[] args) {
		int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

		BinaryTree tree =new BinaryTree();
		Node root=tree.buidTree(arr);
		preeOrder(root);
	}
}

