package day04;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n;
		System.out.println("�� �Է�");
		n = scan.nextInt();
		if (n % 3 == 0) {
			System.out.println("3�� ���");

		} else {
			System.out.println("3�ǹ�� �ƴ�");
		}

	}
}
