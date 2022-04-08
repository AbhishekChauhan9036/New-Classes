import java.io.*;
import java.util.*;

public class Main2{
	static class Node{
		int data;
		Node next;
		int element;
	};
// 1 2 3 4 5
	static Node Push(Node head,int newdata){
		Node newnode=new Node();
		newnode.data=newdata;
		newnode.element=0;
		newnode.next=head;
		head=newnode;
		return head;
	}

	static Node LoopPresentOrNot(Node head){
/*		while(head!=null){
			if(head.element==1){
				return true;
			}

			head.element=1;

			head=head.next;
		}

		return false;*/

		Node start=head,last=head;
		start=start.next;
		last=last.next.next;

		while(start!=null && last.next!=null){
			if(start==last){
				break;
			}

			start=start.next;
			last=last.next.next;
		}


		if(start!=last){
			return null;
		}

		while(start!=last){
			start=start.next;
			last=last.next;
		}

		return start;

	}

	public static void main(String[] args) {
		Node head=null;
		head=Push(head,1);
		head=Push(head,2);
		head=Push(head,3);
		head=Push(head,4);

		head.next.next.next.next=head;

		Node ans=LoopPresentOrNot(head);
		System.out.println(ans.data+" ");
	}
}