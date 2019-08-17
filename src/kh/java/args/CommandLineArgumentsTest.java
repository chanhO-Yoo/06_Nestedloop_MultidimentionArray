package kh.java.args;

/**
 * 프로그램 최초 실행시 사용자로부터
 * 입력갑(매개인자,매개변수 : arguments) 받기
 *
 * "홍길동 서울 남 175 90"
 * ["홍길동","서울","남","175","70"]
 *
 */

public class CommandLineArgumentsTest {
	public static void main(String[] args) {
//		for(int i=0;i<args.length;i++) {
//			System.out.println("args["+i+"] = "+args[i]);
//		}

		CommandLineArgumentsTest c = new CommandLineArgumentsTest();
		c.test(args);
		
		
		System.out.println("=====END=====");
	}
	
	/*
	 * 학생 정보 처리
	 * 홍길동 남 30 175 70
	 * @param args
	 */
	public void test(String[] args) {
		String name = "";
		char gender = ' ';
		int age = 0;
		double height = 0;
		double weight = 0;
		
		for(int i=0;i<args.length;i++) {
			switch(i) {
			case 0:
				name = args[i];
				break;
			case 1:
				gender = args[i].charAt(0);//문자열의 첫글자 가져오기
				break;
			case 2:
				age = Integer.parseInt(args[i]);//문자열을 정수타입으로 변환
				break;
			case 3:
				height = Double.parseDouble(args[i]);//실수형인 문자열을 double타입으로 변환
				break;
			case 4:
				weight = Double.parseDouble(args[i]);//실수형인 문자열을 double타입으로 변환
				break;
			}
		}
	System.out.println("name = "+name);	
	System.out.println("gender = "+gender);	
	System.out.println("age = "+age);	
	System.out.println("height = "+height);	
	System.out.println("weight = "+weight);	
	}
}
