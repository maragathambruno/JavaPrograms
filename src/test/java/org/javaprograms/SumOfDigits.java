package org.javaprograms;

public class SumOfDigits {
	public static void main(String[] args) {
		int num=351;
		int n=num;
		int res=0,rem=0;
		while (num>0) {
			rem=num%10;
			res=res+rem;
			num=num/10;
			
		}
		System.out.println(res);
	}

}
