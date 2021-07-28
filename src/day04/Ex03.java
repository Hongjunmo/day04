package day04;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("수 입력 : ");
		int num = scan.nextInt();
		if (num > 100) {
			System.out.println(num + " : 100보다 크다");
		} else if (num > 50) {
			System.out.println(num + " : 50보다 큼");
		} else {
			System.out.println(num + " : 50보다 작은 값들");
		}

	}
}
