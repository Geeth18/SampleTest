package org.test;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		//Scanner sca = new Scanner(System.in);
		//int i = sca.nextInt();
		int i;
		int j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}