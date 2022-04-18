import java.io.*;
import java.util.*;
import java.util.Scanner;
class Queuell{
	int key;
	Queuell next;

	public Queuell(int key){
		this.key=key;
		this.next=null;
	}
}
 class QueueUsing{
	Queuell Front,Rear;
	public QueueUsing(){
		this.Front=this.Rear=null;
		
	}

	public void Enqueue(int key){
		Queuell Q1=new Queuell(key);

		if(this.Rear==null){
			this.Front=this.Rear=Q1;
			return;
		}

		this.Rear.next=Q1;
		this.Rear=Q1;

	}

	public void Dequeue(){
		if(this.Front==null){
			return;
		}


		Queuell Q1=this.Front;
		this.Front=this.Front.next;

		if(this.Front==null){
			this.Rear=null;
		}
	}
}

public class QueueUsingLL{
	public static void main(String[] args) {
		QueueUsing q1=new QueueUsing();
		q1.Enqueue(1);
		q1.Dequeue();
		q1.Enqueue(2);

		System.out.println(q1.Front.key);
	}
}