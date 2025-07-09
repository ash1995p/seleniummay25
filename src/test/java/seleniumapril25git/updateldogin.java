package seleniumapril25git;

public class updateldogin {

	  int i=10;
	  int j=100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String ("6666");
		StringBuffer s2 = new StringBuffer(s1);
		String s3 = new String (s2.reverse());
		System.out.println(s3);
		
		if(s3.equals(s1))
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("not palindrom");
		}

	}

}
