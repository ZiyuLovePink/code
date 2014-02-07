
public class FizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fizzBuzz(100));
	}
	public static String fizzBuzz(int n){
		if(n < 1){
			return "";
		}
		 String result = "1";
		 for(int i = 2; i <= n; i++){
			 if(i % 3 == 0 && i % 5 ==0){
				 result += ", FizzBuzz";
			 }else if(i % 3 == 0){
				 result += ", Fizz";
			 }else if(i % 5 == 0){
				 result += ", Buzz";
			 }else{
				 result += ", "+ i;
			 }
		 }
		 return result;
	 }
}
