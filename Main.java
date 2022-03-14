import java.util.*;
class Node
{
    int data;
    Node next;
 
    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
 
class Main
{
    public static void printList(Node node)
    {
        while (node != null)
        {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.print("null");
    }

    public static Node sortedMerge(Node a, Node b)
    {
        if (a == null) {
            return b;
        }
        else if (b == null) {
            return a;
        }
 
        Node result;
 
        if (a.data <= b.data)
        {
            result = a;
            result.next = sortedMerge(a.next, b);
        }
        else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
 
        return result;
    }
 
    public static Node mergeKLists(Node[] lists)
    {

        if (lists == null || lists.length == 0) {
            return null;
        }
 
        int last = lists.length - 1;
 
        while (last != 0)
        {
            int i = 0, j = last;
 
            while (i < j)
            {
                lists[i] = sortedMerge(lists[i], lists[j]);
 

                i++;
                j--;
 
                if (i >= j) {
                    last = j;
                }
            }
        }
 
        return lists[0];
    }
 
    public static void main(String[] s)
    {
        int k = 3;  
        Node[] lists = new Node[k];
 
        lists[0] = new Node(1);
        lists[0].next = new Node(5);
        lists[0].next.next = new Node(7);
 
        lists[1] = new Node(2);
        lists[1].next = new Node(3);
        lists[1].next.next = new Node(6);
        lists[1].next.next.next = new Node(9);
 
        lists[2] = new Node(4);
        lists[2].next = new Node(8);
        lists[2].next.next = new Node(10);
 
        Node head = mergeKLists(lists);
 
        printList(head);
    }
}
