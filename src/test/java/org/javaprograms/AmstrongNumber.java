package org.javaprograms;

public class AmstrongNumber {
	private void checkAmstrong(int num) {
		int n=num;
		int rem=0,res=0;
		while (num>0) {
			rem=num%10;
			res=res+(rem*rem*rem);
			num=num/10;
			
		}if (n==res) {
			System.out.println(n+" is a amstron number");
		}else
			System.out.println(n+" is not a amstrong number");

	}
	public static void main(String[] args) {
		AmstrongNumber c=new AmstrongNumber();
		c.checkAmstrong(153);
		c.checkAmstrong(456);
	}

}
