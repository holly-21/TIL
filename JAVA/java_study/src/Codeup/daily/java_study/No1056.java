package Codeup.daily.java_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1056 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num[] = br.readLine().split(" ");
		int a = Integer.parseInt(num[0]);
		int b = Integer.parseInt(num[1]);
		System.out.println(a!=b ? 1:0);
	}

}
