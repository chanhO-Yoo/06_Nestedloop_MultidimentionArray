package kh.java.nested.loop;

public class BreakContinueWithLabelTest extends NestedLoopTest {

	public static void main(String[] args) {	
		BreakContinueWithLabelTest b = new BreakContinueWithLabelTest();
//		b.test1();
//		b.test2();
//		b.test3();
		b.test4();
	}
	
	
	/*
	 *break
	 * 전체 구구단 중에서 결과값이 50미만일 경우까지만 출력
	 *
	 */
	public void test1() {
		outer: // 반복문을 outer란 이름으로 지정한다.
		for(int i=2;i<=9;i++) {
			System.out.println("========================");
			System.out.printf("%d단\n",i);
			System.out.println("========================");
			
			for(int j=1;j<=9;j++) {
				if(i*j>=50) {
//					break; //현재 속한 안쪽 반복문에 대한 브레이크
						   //전체 구구단 중에서 결과값이 50미만일 경우만 출력
					break outer;//outer란 이름을 가진 반복문을 탈출한다.
				}
				else {
					System.out.printf("%d X %d = %2d\n",i,j,i*j);
				}
			}
		}
	}
	
	/*
	 * continue
	 * 각 단에서 두 수가 같을 때까지만 출력
	 * 
	 */
	public void test2() {
		outer:
			for(int i=2;i<=9;i++) {
				System.out.println("========================");
				System.out.printf("%d단\n",i);
				System.out.println("========================");
				
				for(int j=1;j<=9;j++) {
					System.out.printf("%d X %d = %2d\n",i,j,i*j);
					
					if(i==j) {
						continue outer;//i 반복문의 증감식으로 이동한다.(for문의 경우 continue는 증감식으로간다.)
									   //(while문의 경우 조건식으로 간다.)
						
					}
				}
			}
	}
	
	/*
	 * 실습문제
	 * □□□
	 * □
	 * □□□
	 * □
	 * □□□
	 * 
	 * 5행 3열의 2차원 배열로 보고
	 * 해결책 찾기
	 */
	
	public void test3() {
		
		//문자열 변수로 concatenating으로 출력
//		String a = "";
//		loop1:for(int i=0;i<5;i++) {
//			for(int j=0;j<3;j++) {
//				a += "□";
//				if(i%2==1) {
//					a += "\n";
//					continue loop1;					
//				}
//			}
//			a += "\n";
//		}
//		System.out.println(a);
		
		loop1:for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				System.out.print('□');
				if(i%2==1) {
					System.out.println();
					continue loop1;					
				}
			}
			System.out.println();
		}
	}
	
	/*
	 * 실습문제
	 * ★
	 * ★★
	 * ★★★
	 * ★★★★
	 * ★★★★★
	 */
	public void test4() {
		String star="";
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				star += "★";				
			}
			star += "\n";
		}
		System.out.println(star);
	}
}
