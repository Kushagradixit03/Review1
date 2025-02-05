public class ReverseString{
	public static void reverse(String str){
		String words[]=str.split(" ");
		String result="";
		
		for(String word:words){
			String reversewords="";
			
			for(int i=word.length()-1;i>=0;i--){
				reversewords=reversewords+word.charAt(i);
			}
			result=result+reversewords+" ";
		}
		System.out.println(result);
	}
	public static void main(String args[]){
	 String str="Java is fun";
	 reverse(str);
	 
	}
}