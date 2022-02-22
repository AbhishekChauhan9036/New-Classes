/*
	You are given a string Your task To Find count words 
	Mohan Is Going to Market->5
		" " ""	  ""  ""

		charAt();
*/
import java.util.Scanner;
public class CountString{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=1;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '){
				count++;
			}
		}

		System.out.println(count+ s.length());

	}
}

