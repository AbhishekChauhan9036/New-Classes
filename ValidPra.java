import java.io.*;
import java.util.*;
public class ValidPra{
	public static boolean Solve(String s){
		if(s.length()%2!=0){
			return false;
		}


		Stack<Character> stack =new Stack<>();

		for(char c:s.toCharArray()){
			if(c=='(' || c=='{' || c=='['){
				stack.push(c);
			}

			else if(c==')' && !stack.isEmpty() && stack.peek()=='('){
				stack.pop();
			}

			else if(c=='}' && !stack.isEmpty() && stack.peek()=='{'){
				stack.pop();
			}

			else if(c==']' && !stack.isEmpty() && stack.peek()=='['){
				stack.pop();
			}

			else{
				stack.push(c);
			}
		}
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		String s1="(((){{}";
		boolean print=Solve(s1);

		if(print){
			System.out.print("It is Valid");
		}else{
			System.out.print("It is not valid");
		}

	}
}