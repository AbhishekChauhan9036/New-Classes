/* arr-{"tal","tall","taal","taaal"}*/
import java.util.*;
import java.io.*;
public class NewQuestion{

	public static String PrintPrefixOfThisArray(String arr[],int n){

		Arrays.sort(arr);

		int find=Math.min(arr[0].length(),arr[n-1].length());
		int j=0;
		for(;j<find && arr[0].charAt(j)==arr[n-1].charAt(j);){
			j++;
		}

		String Ans=arr[0].substring(0,j);
		return Ans;
	}
	public static void main(String[] args) {
		String arr[]={"tal","tall","taal","taaal"};
		int n=arr.length;
		String ans=PrintPrefixOfThisArray(arr,n);
		System.out.println(ans);
	}
}