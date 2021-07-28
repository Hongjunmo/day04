package day04;

import java.util.Scanner;

public class Ex04_switch {
	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		System.out.println("수 입력: ");
	int	select = scan.nextInt();
		switch (select) {
		case 1: System.out.println("1.입력값 : " + select);
		break;
		case 2: System.out.println("2.입력값 : " + select);
		break;
		case 3: System.out.println("3.입력값 : " + select);
		break;
		default:
			System.out.println("4. 1,2,3을 제외한 다른 값 입력");
		}
	
	
	}
}
