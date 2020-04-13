
 public class ReverseDemo {

	public static void main(String[] args) {
		System.out.println(reverseNumber(879032));

	}
	
	public static int  reverseNumber(int number)
	{
		 String s = Integer.toString(number);
	     StringBuilder sn = new StringBuilder(s);
	     StringBuilder reverse = sn.reverse();
	     return (Integer.parseInt(reverse.substring(0)));
	          
	}
}

