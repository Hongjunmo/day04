package day04;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
//		while (true) {
//			System.out.println("��¥ �Է�");
//			int num = scan.nextInt();
//			switch (num%7) {
//			case 1:
//				System.out.println("��");
//				break;
//			case 2:
//				System.out.println("ȭ");
//				break;
//			case 3:
//				System.out.println("��");
//				break;
//			case 4:
//				System.out.println("��");
//				break;
//			case 5:
//				System.out.println("��");
//				break;
//			case 6:
//				System.out.println("��");
//				break;
//			case 0:
//				System.out.println("��");
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
			System.out.println("1.�츮�� ���");
			System.out.println("2.ȸ�� ���");
			System.out.println("3.��� ����");
			System.out.print("�Է� : ");
			 choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.print("���� ����մϴ� : ");
				home = scan.next();
				break;
			case 2:
				System.out.print("ȸ�縦 ����մϴ� :");
				com = scan.next();
				break;
			case 3:
				System.out.println("������� ��ȸ�մϴ�");
				System.out.println("�츮�� :" + home);
				System.out.println("ȸ�� :" + com);
				System.exit(0);
				break;
			}
			
			scan.close();
		}

	}
}
