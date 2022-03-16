import java.io.*; 
import java.util.*; 
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int data){
        this.data = data;
    }
}
public class CountLeaves {

	public static Node insert(Node root, int key)
    {

        if (root == null) {
            return new Node(key);
        }
 
        if (key < root.data) {
            root.left = insert(root.left, key);
        }
 
        else {
            root.right = insert(root.right, key);
        }
 
        return root;
    }
    public static int countLeafNode(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        int leafNodesOnLeft = countLeafNode(root.left);
        int leafNodesOnRight = countLeafNode(root.right);
        return leafNodesOnLeft + leafNodesOnRight;
    }


	    public static Node constructBST(int[] keys)
    {
        Node root = null;
        for (int key: keys) {
            root = insert(root, key);
        }
        return root;
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		n=n+n;
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}

		Node root = constructBST(arr);
		System.out.println(countLeafNode(root));
	}
}