package day04;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		 �Է¹ް� Ű�� ü���� �Է¹ް� bmi�� ȯ���ؼ� 18.5���ϴ� ��ü�� 18.5~23��
		  ���� 25�̻��� �� ���� ��� -bmi����
		 * (ü��/(Ű*Ű)
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Ű �Է�: ");
		double hei= scan.nextDouble();
		System.out.println("ü�� �Է�: ");
		double wei= scan.nextDouble();
		double bmi = wei/((hei/100)*(hei/100));
		
		System.out.println(Math.round(bmi*100)/100.0);
		if(bmi <18.5) {
			System.out.println("��ü�� �Դϴ�");
		}else if(bmi<25) {
			System.out.println("�����Դϴ�");
		}else {
			System.out.println("�� �Դϴ�");
		}

//		System.out.println("���� ������ �Է�: ");
//		int num=scan.nextInt();
//		
//		if(num>=90) {
//			System.out.println("A��� �Դϴ�.");
//		}else if(num>=80) {
//			System.out.println("B��� �Դϴ�.");
//		}else if(num>=70) {
//			System.out.println("C��� �Դϴ�");
//		}else if (num>=60) {
//			System.out.println("D��� �Դϴ�.");
//		}else {
//			System.out.println("�� ��");
//			
//		}

//		System.out.println("�� �Է�:");
//		int num1=scan.nextInt();
//		
//		if(num1%2==0) {
//			System.out.println("¦�� �Դϴ�");
//		}else {
//			System.out.println("Ȧ�� �Դϴ�");
//		}
//		System.out.println("������� �Է�:");
//		int num2 = scan.nextInt();
//
//		if(num2==12 || num2<=2) { // 12 1 2
//			System.out.println("�ܿ�");
//		}else if (num2<=5 && num2>2  ) { // 3 4 5 
//			System.out.println("��");
//		}else if(num2 <= 8 && num2>5) { //6 7 8 
//			System.out.println("����");
//		}else if (num2 <=11 && num2 > 8 ) { // 9 10 11 
//			System.out.println("����");
//		}else {
//			System.out.println("1~12������ �Է�");
//		}
//		
		
		
//		System.out.println("���� �Է�:");
//		int age = scan.nextInt();
//		if(age<=8) {
//			System.out.println("1000");
//		}else if(age <=14) {
//			System.out.println("1500");
//		}else if (age<=17) {
//			System.out.println("3000");
//		}else {
//			System.out.println("5000");
//		}
		
		
		
	}
	
}
