package org.javaprograms;

public class CountOfEvenNum {

	public static void main(String[] args) {
		int Count = 0;
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				Count = Count + 1;

			}

			else {
				sum = sum + 1;

			}

		}
		System.out.println("even = " + Count);
		System.out.println("odd = " + sum);
	}
}
