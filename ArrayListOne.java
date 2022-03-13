/**
 *    author:  Abhishek Chauhan
 *    created: 13.03.2022 20:10:17       
**/

/*ArrayList ke All Operation */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ArrayListOne{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		/* ArrayList Create karne ke liye */
		ArrayList<Integer> l1=new ArrayList<Integer>();

		/* Element Add krne ke liye*/
		l1.add(0);
		l1.add(1);
		l1.add(2);
		l1.add(101);


		/* For Print ArrayList*/
		System.out.println(l1);

		/* index ke hisab se get karne ke liye */
		int Element=l1.get(0);


		/*Element Ko print Krne ke liye*/
		System.out.println(Element);


		/* 0 index pe 5 add krne ke liye or Replace krne ke liye */
		l1.set(0,5);
		/* 1 index pe 9 add krne ke liye or Replace karne ke liye */
		l1.set(1,9);
		System.out.println(l1);

		/*ArrayList ka size check krne ke liye*/
		int size=l1.size();
		/* ArrayList ka size Print krane ke liye*/
		System.out.println(size);


		/* ArrayList me se Element ko Remove krne ke liye */
		l1.remove(2);
		/* print ArrayList */
		System.out.println(l1);


		/* ArrayList ko Loop Se Aise Iterate Karte hai*/
		for(int i=0;i<l1.size();i++){
			System.out.print(l1.get(i)+" ");
		}

		/*ArrayList Ke Sabhi Element ko Sort krne ke Liye*/
		Collections.sort(l1);


		/*ArrayList lo print krne ke liye*/
		System.out.println(l1);



	}
}