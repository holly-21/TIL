package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.util.Scanner;

public class No1032 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
		System.out.printf("%x", num);
	}

}
