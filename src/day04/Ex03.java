package day04;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("�� �Է� : ");
		int num = scan.nextInt();
		if (num > 100) {
			System.out.println(num + " : 100���� ũ��");
		} else if (num > 50) {
			System.out.println(num + " : 50���� ŭ");
		} else {
			System.out.println(num + " : 50���� ���� ����");
		}

	}
}
