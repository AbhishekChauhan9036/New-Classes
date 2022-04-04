/*1.Maximum count of distinct sized subarrays with given sum.

Desc:--
Given a binary array arr[] of N integers,
the task is to find the maximum count of distinct sized
subarrays such that the sum of each subarray is K.

example:--
Input: arr[] = {0, 1, 1 , 0}, K = 2
Output: 3
Explanation: The subset {{0, 1, 1, 0}, {0, 1, 1}, {1, 1}} is the subset of 3 subarrays such that the sum of
 each subarray is 2 and the size of each subarray is distinct. The subarray {1, 1, 0} also has sum 2 but a subarray of 
 size 3 is already included.

Input: arr[] = {0, 1, 0, 0, 0, 1 , 0}, K = 1
Output: 5*/


/*
Longest substring with count of 0s more than 1s
Given a binary string find the longest substring which contains 0’s more than 1’s.
Examples: 
 
Input : 1010
Output : 3
Substring 010 has 0 occurring more number of times than 1.

Input : 101100
Output : 5
Substring 01100 has 0 occurring more number of times than 1.*/

import java.io.*;
import java.util.*;
public class Main{

	public static int SubArray(int arr[],int n,int k){
		int size=0;
		ArrayList<Integer> a1=new ArrayList<>();
		Set<Integer> s1=new HashSet<>();
		
		int sumofarray=0;
		size=0;

		for(int i=0;i<n;i++){
			sumofarray=sumofarray+arr[i];

			if(sumofarray>k){
				for(;sumofarray>k;){
					sumofarray=sumofarray-arr[size++];
				}
			}

			if(sumofarray==k){
				s1.add(i-size+1);
				int temp=size;

				for(;arr[temp]==0;){
					s1.add(i-temp);
					temp++;
				}

			}
		}

		return s1.size();



	}


	public static void LongestSubstring(String s){

		HashMap<Integer,Integer> mp =new HashMap<Integer,Integer>();
		mp.put(0,-1);
		int ans=0;
		int c1=0;
		int c2=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='0'){
				c1++;
			}else{
				c2++;
			}


			if(mp.containsKey(c2-c1)){
				ans=Math.max(ans,(i-mp.get(c2-c1)));
			}else{
				mp.put(c2-c1,i);
			}
		}

		System.out.println(ans);


	}
	public static void main(String[] args) {
		int arr[]= {0, 1, 1 , 0};
		int n=arr.length;
		int k=2;

		System.out.println(SubArray(arr,n,k));

		// String s="1010";
		// LongestSubstring(s);
	}
}
