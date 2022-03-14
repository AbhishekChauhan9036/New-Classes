// input-10,1,60,30,5
// output-1,5,10,30,60

class Node{
	int data;
	Node next;

	Node(int data,Node next){
		this.data=data;
		this.next=next;
	}

	Node(){}
}
public class LinkedListOne{
	public static Node SortedLinkedList(Node head,Node newNode){
		Node SecondNode=new Node();
		Node current=SecondNode;
		SecondNode.next=head;

		while(current.next!=null && current.next.data < newNode.data){
			current=current.next;
		}

		newNode.next=current.next;
		current.next=newNode;
		return SecondNode.next;

	}

	public static Node InsertSortedLinkedList(Node head){
		Node ans=null;
		Node current=head;
		Node next;

		while(current!=null){
			next=current.next;
			ans=SortedLinkedList(ans,current);
			current=next;
		}
		return ans;

	}


	public static void PrintAllElementOfLinkedList(Node head){
		Node ptr=head;
		while(ptr!=null){
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
	}

	public static void main(String[] args) {
		/*input-10,1,60,30,5*/
		int arr[]={10,1,60,30,5};

		Node head=null;

		for(int i=arr.length-1;i>=0;i--){
			head=new Node(arr[i],head);
		}

		head=InsertSortedLinkedList(head);
		PrintAllElementOfLinkedList(head);
	}
}