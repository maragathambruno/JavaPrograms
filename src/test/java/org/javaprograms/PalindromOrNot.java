package org.javaprograms;

public class PalindromOrNot {
	public static void main(String[] args) {
		int num=161;
		int n=num;
		int res=0,rem=0;
		while(num>0) {
			rem=num%10;
			res=(res*10)+rem;
			num=num/10;
		}
		if (n==res) {
			System.out.println("palindrom");
			
		}else {
			System.out.println("not a palindrom");
		}
	}
	
	

}
