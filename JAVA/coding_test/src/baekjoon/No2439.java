package baekjoon;

import java.util.Scanner;

public class No2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<(n+1);i++) {
			System.out.println(" ".repeat(n-i)+"*".repeat(i));
		}
	}

}
