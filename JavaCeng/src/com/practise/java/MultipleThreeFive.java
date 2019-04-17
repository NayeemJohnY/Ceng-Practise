package com.practise.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MultipleThreeFive {

	public static void main(String[] args) throws IOException {

		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int range = Integer.parseInt(buf.readLine());
		for (int i = 1; i <= range; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("ThreeFive");
			} else if (i % 3 == 0) {
				System.out.println("Three");
			} else if (i % 5 == 0) {
				System.out.println("Five");
			} else
				System.out.println(i);
		}

	}

}
