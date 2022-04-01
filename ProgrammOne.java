import java.util.*;
public class ProgrammOne{
	public static void PairSum(int arr[],int n,int target){
		HashMap<Integer,Integer>map=new HashMap<>();

		for(int i=0;i<n;i++){
			int temp=target-arr[i];
			if(map.containsKey(temp)){
				// System.out.printf("%d %d",(arr[map.get(target-arr[i])]),arr[i]);
				// return;
				int sum=map.get(temp);
				for(int j=0;j<sum;j++){
					System.out.println(temp+" "+arr[i]);
				}
			}
		    if(map.containsKey(arr[i])){
		    	map.put(arr[i],map.get(arr[i])+1);
		    }else{
		    	map.put(arr[i],1);
		    }
		}
			// System.out.println("Pair Not Found");

	}
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6};
		int target=8;
		int n=arr.length;
		PairSum(arr,n,target);
	}
}