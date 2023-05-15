package day18_static;

class MyMath {
	// Field
	final static double PI = 3.141592;
	
	// static 메소드 선정 기준
	// non-static 필드(인스턴스 필드)를 사용하지 않는 메소
	
	// Method
	static int add(int a, int b) { return a + b; }
	static double add(double a, double b) { return a + b; }
	static double pow(double a, double b) {
		// a의 b제곱 리턴
		double result = 1;
		for(int i = 0; i < b; i++) {
			result *= a;
		}
		return result;
	}
	
}

public class Ex02_MyMath {
	public static void main(String[] args) {
		System.out.println("")
	}
}
