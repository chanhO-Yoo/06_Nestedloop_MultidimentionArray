package kh.java.nested.loop;

import java.util.Scanner;

public class NestedLoopTest {
	public static void main(String[] args) {
		NestedLoopTest n = new NestedLoopTest();
//		n.test1();
//		n.test2();
//		n.test3();
		n.test4();
	}
	
	
	//중첩 for문 으로 좌표찍기
	public void test1() {
//		for(int i=0; i<5; i++) {
//			System.out.print(i+"행: ");
//			for(int j=0; j<5; j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<5; j++) {
				System.out.print("("+i+","+j+")");
				
			}
			System.out.println();
		}
	}
	
	//3행 5열에 대한 좌표를 출력하세요.
	//★★★★★
	//★★★★★
	//★★★★★

	public void test2() {
		//바깥반복문 : 행
//		for(int i=0; i<3; i++) {
//			//안반복문 : 열
//			for(int j=0;j<5;j++) {
//				System.out.print("("+i+","+j+")");
//			}
//			System.out.println();
//		}
		for(int i=0; i<3; i++) {
			//안반복문 : 열
			for(int j=0;j<5;j++) {
				System.out.print("☆");
			}
			System.out.println();
		}
	}
	
	//사용자로부터 행과 열의 정보를 입력받아
	//별을찍는 프로그램
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("행을 입력하세요 : ");
		long i = sc.nextLong();
		System.out.print("열을 입력하세요 : ");
		long j = sc.nextLong();
		
		for(long a=0;a<i;a++) {
			for(long b=0;b<j;b++) {
				System.out.print("☆");
			}
			System.out.println();
		}
	}
	
	//구구단 출력하기
	public void test4() {
		for(int i=2;i<=9;i++) {
			System.out.println("========================");
			System.out.printf("%d단\n",i);
			System.out.println("========================");
			
			for(int j=1;j<=9;j++) {
				System.out.printf("%d X %d = %2d\n",i,j,i*j);
			}
		}
	}
}
