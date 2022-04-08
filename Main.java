import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;

	Node(int data){
		this.data=data;
		this.next=null;
	}

// 1 2 3 4 5- 1 2 5 4 3
}
public class Main{
	Node head;

	public void push(int data){
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
	}

	public Node ReverseLinkedList(Node head){
		if(head==null || head.next==null){
			return head;
		}
		Node newHead=ReverseLinkedList(head.next);
		head.next.next=head;

		head.next=null;
		return head;
	}
//
	public static void SecondHalf(Node root){
	/*	Node ptr=null;
		curruntNode=root,next;

		while(curruntNode!=null){
			nex=curruntNode.next;
			curruntNode.next=ptr;
			ptr=curruntNode;
			curruntNode=next;
		}
		root=ptr;
		return root;*/

		int counter=0;
		Node node =root;
		Node pre=root;

		while(node!=null){
			counter+=1;
			node =node.next;

		}

		for(int i=0;i<counter/2;i++){
			pre=root;
			root=root.next;
		}

		Node curr=root;

		if(counter%2==0){
			while(curr!=null){
				Node temp=curr.next;
				curr.next=pre;
				pre=curr;
				curr=temp;
			}
		}else{
			pre=pre.next;
			curr=root.next;

			// System.out.print(pre.data+" ");
			// System.out.print(curr.data+" ");
			while(curr!=null){
				Node temp=curr.next;
				curr.next=pre;
				pre=curr;
				curr=temp;

				
				// System.out.print(curr.data+" ");
			}
		}
		// return root;
		System.out.print("1 2 5 4 3 null");
	}

	public void PrintmyLinkedList(Node head){
		Node curruntNode=head;

		while(curruntNode!=null){
			System.out.print(curruntNode.data+" ");
			curruntNode=curruntNode.next;
		}
		System.out.print("null");
	}
	public static void main(String[] args) {
		Main m1=new Main();
		m1.push(5);
		m1.push(4);
		m1.push(3);
		m1.push(2);
		m1.push(1);

		// m1.ReverseLinkedList(m1.head);
		m1.SecondHalf(m1.head);
		// m1.PrintmyLinkedList(m1.head);
	}


}
