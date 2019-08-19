package kh.java.array.sort;

import java.util.Arrays;

/*
 * 정렬 : 값에 따라 오름차순 / 내림차순으로 재배치 하는것.
 * ex) 2,4,1,3,5 -> 1,2,3,4,5
 * ex) 2,4,1,3,5 -> 5,4,3,2,1
 * 
 * 알고리즘 : 프로그램 로직 단골 주제 중 하나
 * 정렬 알고리즘
 * - 순차정렬
 * - 선택정렬
 * - 버블정렬
 * - 삽입정렬
 * - 합병정렬
 * - 퀵정렬
 * - 팀정렬
 * 
 */

public class ArraySortTest {
	public static void main(String[] args) {
		ArraySortTest a = new ArraySortTest();
//		a.test1();
		
		int[] arr = {4,3,0,2,1};

		//순차정렬
//		a.sequentialSort(arr);
		
		//선택정렬
//		a.selectionSort(arr);
		
		
		
	}
	
	/*
	 * 변수의 값 교환
	 */
	public void test1() {
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		
		//값 교환 후
		//임시로 값을 저장하는 변수 : temp
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		
		//배열에서 값 교환
		//0번지와 1번지의 값을 교환
		int[] arr = {2,1,3};
		
		//임시 변수 temp선언후 값 바꾸기
//		int temp2 = arr[0];
//		arr[0] = arr[1];
//		arr[1] = temp2;
		
		//메소드로 분리
		//배열,자리바꿀 인덱스1, 인덱스2 사용
		swap(arr,0,1);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	/**
	 * 결과 값 : {0,1,2,3,4}
	 * 순차 정렬
	 * 
	 * 0,1,2,3번지에 대해서 정렬함
	 * @param arr
	 */
	public void sequentialSort(int[] arr) {
		//i = 0,1,2,3
		for(int i=0;i<arr.length;i++) {
			//1번지와 비교할 인덱스
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					swap(arr,i,j);					
				}
				print(arr,i);
			}
		}
	}
	
	/**
	 * 매회차에 최소값에 해당하는 변수를 선정하고,
	 * 이를 차례로 비교하여 정렬함.
	 * 보다 작은 수가 발견되면, 최소값으로 재지정.
	 * 매회차의 마지막에만 swap한다.
	 */
	public void selectionSort(int[] arr) {
		
		//i=0,1,2,3
		for(int i=0;i<arr.length-1;i++) {
			int min = i;//각 회차에 해당하는 최소값의 index
			
			//인덱스 교환만 발생
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min]>arr[j]) {
					min = j;
				}
				print(arr,i);
			}
			
			//실제 값 교환
			swap(arr,min,i);
			
			//회차 최종 결과 출력
			System.out.println("===============");
			print(arr,i);
			System.out.println("===============");
			
		}
	}
	
	
	/**
	 * 
	 * @param arr : 참조형 변수(arr의 주소값)
	 * @param i : 기본형 변수(전달한 값)
	 * @param j : 기본형 변수(전달한 값)
	 */
	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public void print(int[] arr,int i) {
		System.out.printf("%d :%2d%2d%2d%2d%2d\n", i, arr[0], arr[1], arr[2], arr[3], arr[4]);
	}
}
