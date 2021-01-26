package org.javaprograms;

public class StringReverseFromNum {

	// convert number into string and reverse the string
	public static void main(String[] args) {

		int n = 123;
		String res = "";
		String num = Integer.toString(n);
		for (int i = num.length() - 1; i >= 0; i--) {
			char c = num.charAt(i);
			res = res + c;

		}
		System.out.println(res);
int no = Integer.parseInt(res);
	System.out.println(no);
	}

}
