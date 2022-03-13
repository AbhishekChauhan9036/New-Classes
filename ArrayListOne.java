import java.util.*;
public class ArrayListOne{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		ArrayList<Integer> l1=new ArrayList<Integer>();// ArrayList Create karne ke liye
		l1.add(0);//Element Add krne ke liye
		l1.add(1);
		l1.add(2);

		System.out.println(l1);//For Print ArrayList

		int Element=l1.get(0);// index ke hisab se get karne ke liye
		System.out.println(Element);//Element Ko print Krne ke liye

		l1.set(0,5);//0 index pe 5 add krne ke liye or Replace krne ke liye
		l1.set(1,9);//1 index pe 9 add krne ke liye or Replace karne ke liye
		System.out.println(l1);








	}
}