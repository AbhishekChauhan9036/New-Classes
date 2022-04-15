import java.io.*;
import java.util.*;
public class Mock2{

	public static void main(String[] args) {
		int arr[]={5,4,7,3,1,1,1,2,9};
		int n=arr.length;
		int i=0;int k=0;
		int j=0;
		int ans=0;
		for(i=0;i<n;i++){
			k=i;
			ans=-1;
			for(j=i+1;j<n;j++){
				if(arr[i]<arr[j]){
					ans=arr[j];
					break;
				}
			}
			System.out.println(arr[k]+" "+ans);
		}

	}

}