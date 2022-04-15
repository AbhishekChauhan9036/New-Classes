import java.io.*; 
import java.util.Scanner;
import java.util.*; 
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int data){
        this.data = data;
    }
}
class BuildTreeThree {
    private static void Postorder(Node root)
    {
        if (root == null)
            return;
 
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data + " ");
    }
    private static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

     private static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] arr = new Node[n];
        for(int i =0; i <n;i++){
            arr[i] = new Node(i + 1);
        }
        for(int i = 0;i<n;i++){
            int left = sc.nextInt();
            int right = sc.nextInt();
            if(left != -1){
                arr[i].left = arr[left -1];
            }
            if(right != -1){
                arr[i].right = arr[right - 1];
            }
        }
		inOrder(arr[0]);
	}

	
}