package test;

public class StringTest
{
	public static void main(String args[])
	{
		System.out.println(args.length);
		String str1 = "abcd";
		String str2 = "abcd";
		String str3 = "ab" + "cd";
		String str4 = "ab";
		str4 += "cd";
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1 == str4);
	}

}