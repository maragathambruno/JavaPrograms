package org.javaprograms;

public class CountOfDigits {
	public static void main(String[] args) {
		int num=351;
		int n=num;
		int count=0;
		while (num>0) {
			count++;
			num=num/10;
			
		}
		System.out.println(count);
	}

}
