package kh.java.array.sort;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		Lotto l = new Lotto();
		l.test();
	}
	
	/**
	 * 1~45까지 중복없는 난수 생성하기
	 * @실습문제 : 오름차순으로 정렬해서 출력하기
	 * 
	 */
	public void test() {
		Random rnd = new Random();
		
		int[] lotto = new int[6];
		
		for(int i=0;i<6;i++) {
			//non-static : 객체.메소드
			lotto[i] = rnd.nextInt(45)+1;
			//static : 클래스명.메소드
//			lotto[i] = (int)(Math.random()*45)+1;
			
			//중복 제거
			for(int j=0;j<i;j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
	}
}
