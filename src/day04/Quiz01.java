package day04;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		 입력받고 키와 체중을 입력받고 bmi로 환산해서 18.5이하는 저체중 18.5~23은
		  정상 25이상은 비만 으로 출력 -bmi계산법
		 * (체중/(키*키)
		 */
		
		Scanner scan = new Scanner(System.in);
//
		System.out.println("키 입력: ");
		double hei= scan.nextDouble();
		System.out.println("체중 입력: ");
		double wei= scan.nextDouble();
		double bmi = wei/((hei/100)*(hei/100));
		
		System.out.println(Math.round(bmi*100)/100.0);
		if(bmi>=0) {
		if(bmi <18.5) {
			System.out.println("저체중 입니다");
		}else if(bmi<25) {
			System.out.println("정상입니다");
		}else {
			System.out.println("비만 입니다");
		}
		}else {
			System.out.println("입력오류");
		}

//		System.out.println("국어 점수를 입력: ");
//		int num=scan.nextInt();
//		
//		if(num>=90) {
//			System.out.println("A등급 입니다.");
//		}else if(num>=80) {
//			System.out.println("B등급 입니다.");
//		}else if(num>=70) {
//			System.out.println("C등급 입니다");
//		}else if (num>=60) {
//			System.out.println("D등급 입니다.");
//		}else {
//			System.out.println("그 외");
//			
//		}

//		System.out.println("수 입력:");
//		int num1=scan.nextInt();
//		
//		if(num1%2==0) {
//			System.out.println("짝수 입니다");
//		}else {
//			System.out.println("홀수 입니다");
//		}
		
		
		
//		System.out.println("월 입력:");
//		int num2 = scan.nextInt();
//
//		if(num2==12 || num2<=2) { // 12 1 2
//			System.out.println("겨울");
//		}else if (num2<=5 && num2>2  ) { // 3 4 5 
//			System.out.println("봄");
//		}else if(num2 <= 8 && num2>5) { //6 7 8 
//			System.out.println("여름");
//		}else if (num2 <=11 && num2 > 8 ) { // 9 10 11 
//			System.out.println("가을");
//		}else {
//			System.out.println("1~12까지만 입력");
//		}
//		
		
		
//		System.out.println("나이 입력:");
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
