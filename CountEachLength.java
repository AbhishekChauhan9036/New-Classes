/*
  "Mohan Is Going to Market"  
  Mohan -5
  Is -2
  Going -5
  to-2
  Market=6
 */

 /*int arr[]=new int[3];
   arr[0]=1;
    arr[1]=2;
    arr[2]=3;
String arr[]={"Ram ","Shryam"};
*/
public class CountEachLength{
 /*   static String S1="",S2="";
    public static String withoutSplit(){
        for(int i=0;i<s.length();i++){
           Sytem.out.println("Ram")
        }
    }
*/
    public static void main(String[] args) {
        String s="Mohan Is Going to Market";

        String arr[]=s.split(" ");

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] +" -> "+arr[i].length());
        }
        // withoutSplit("Abhishek")
    }
}