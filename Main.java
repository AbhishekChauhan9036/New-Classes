import java.util.*;
public class Main{
	public static void main(String[] args){
		
		int a=18,b=24,c,d;

		c=a;
		d=b;

		while(c!=d){
			if(c>d){
				c=c-d;
			}else{
				d=d-c;
			}
		}

		System.out.println(d);
}
	}
