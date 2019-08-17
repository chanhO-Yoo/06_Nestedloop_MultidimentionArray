package kh.java.multi.dimentional.array;

import java.util.Arrays;

public class MultiDimentionalArrayTest {
	public static void main(String[] args) {
		MultiDimentionalArrayTest m = new MultiDimentionalArrayTest();
//		m.test1();
//		m.test2();
//		m.test3();
//		m.test4();
		m.test5();
		
	}
	
	public void test1() {
		//1. 2차원배열 선언
		int[][] arr;
		
		//2. 할당
		arr = new int[2][3];
		
		//3. 각 번지수에 대입
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	/*
	 * 실습문제
	 * 각 분단의 사람을 2차원 배열로 표현
	 */
	public void test2() {
		String[][] arr = new String[5][3];
		String printArr = "";
		
		arr[0][0] = "1";
		arr[0][1] = "2";
		arr[0][2] = "3";
		arr[1][0] = "정주영";
		arr[1][1] = "임하라";
		arr[1][2] = "신하진";
		arr[2][0] = "서경환";
		arr[2][1] = "정영균";
		arr[2][2] = "김효정";
		arr[3][0] = "장예찬";
		arr[3][1] = "오근호";
		arr[3][2] = "김민호";
		arr[4][0] = "유찬호";
		arr[4][1] = "최광식";
		arr[4][2] = "최주영";
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				printArr += arr[i][j] + " ";
			}
			printArr += "\n";
		}
		System.out.println(printArr);	
	}
	
	/*
	 * 2차원 배열에서 배열 요소간 규칙성이 있는 경우
	 * 반복문을 통해 값을 할당할 수 있다.
	 * 
	 */
	public void test3() {
		int[][] arr = new int[4][4];
		
		//1~16의 수를 차례대로 할당
//		int k = 1;
//		for(int i=0;i<arr.length;i++) {
//			
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j] = k;
//				k++;
//				//arr[i][j] = k++;
//				
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		//1~16의 수를 차례대로 할당
		int k = 16;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = k;
				k--;
				//arr[i][j] = k++;
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
//		System.out.println(Arrays.toString(Arrays.toString(arr)));
	}
	
	/*
	 * 리터럴로 초기화하기
	 */
	public void test4() {
		//초기화
//		int[][] arr = new int[2][4];
		char[][] arr = new char[][] {{'a','b','c','d'},{'e','f','g','h'}};
//		int[][] arr = {{1,2,3,4},{5,6,7,8}};
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
	
	/*
	 * 가변 배열
	 * 2차원 배열은 자료형이 같은 1차원 배열의 묶음.
	 * 사용된 1차원 배열의 길이가 꼭 같을 필요는 없다.
	 */
	public void test5() {
		//가변배열 선언(무조건 첫번째 배열의 크기가 필요하다.)
		int[][] arr = new int[3][];
		
		//참조형 변수에서 할당된 주소 값이 없을 때
		//null(값없음)을 출력
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		//각각 할당
		arr[0] = new int[5];
		arr[1] = new int[8];
		arr[2] = new int[10];
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		int k =1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = k++;
			}
		}
		
		//출력
		for(int i=0; i<arr.length;i++) {
			System.out.print(i+" : ");
			System.out.println(Arrays.toString(arr[i]));
		}
		
		
	}
}
