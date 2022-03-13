/*

*
*^*
*^^*
*^^^*
*^^^^*
******

*/
public class PrintPattern{

static void Pattern(int N){
	for(int i=1;i<=N;i++){
		for(int j=1;j<=N;j++){
			if(j==1 || j==N){
					System.out.print("*");
				}
			if(j>1 && j<N){
				if(j<=i){
					System.out.print("^");
				}
			else{
				System.out.print(" ");
			}}
			}
			System.out.print("\n");
		}
		
	}

	public static void main(String[] args) {
		int n=6;

		Pattern(n);
	}
}