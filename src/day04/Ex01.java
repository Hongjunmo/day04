package day04;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n;
		System.out.println("수 입력");
		n = scan.nextInt();
		if (n % 3 == 0) {
			System.out.println("3의 배수");

		} else {
			System.out.println("3의배수 아님");
		}

	}
}
