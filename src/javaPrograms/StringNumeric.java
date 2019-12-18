package javaPrograms;

public class StringNumeric {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str = "647mahesh";
		int size = str.length();
		int i;
		for (i = 0; i < size ; i++)
		{
			char split = str.charAt(i);
			if ('0'<=split && split<='8')
			break;
		}
		String numeric = str.substring(0,i);
		String alphabets = str.substring(i);
		System.out.println(numeric);
		System.out.println(alphabets);
	}

}
