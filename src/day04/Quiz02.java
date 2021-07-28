package day04;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
//		while (true) {
//			System.out.println("날짜 입력");
//			int num = scan.nextInt();
//			switch (num%7) {
//			case 1:
//				System.out.println("월");
//				break;
//			case 2:
//				System.out.println("화");
//				break;
//			case 3:
//				System.out.println("수");
//				break;
//			case 4:
//				System.out.println("목");
//				break;
//			case 5:
//				System.out.println("금");
//				break;
//			case 6:
//				System.out.println("토");
//				break;
//			case 0:
//				System.out.println("일");
//				break;
//
//			}
//			
//			scan.close();
//		}
		
		
		
		
		
		
		
		
		String home = null;
		String com = null;
		int choice ;
		while (true) {
			System.out.println("1.우리집 등록");
			System.out.println("2.회사 등록");
			System.out.println("3.등록 보기");
			System.out.print("입력 : ");
			 choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.print("집을 등록합니다 : ");
				home = scan.next();
				break;
			case 2:
				System.out.print("회사를 등록합니다 :");
				com = scan.next();
				break;
			case 3:
				System.out.println("등록지를 조회합니다");
				System.out.println("우리집 :" + home);
				System.out.println("회사 :" + com);
				System.exit(0);
				break;
			}
			
			scan.close();
		}

	}
}
