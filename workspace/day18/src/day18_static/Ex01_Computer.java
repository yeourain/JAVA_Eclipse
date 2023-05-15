package day18_static;

class LGComputer {
	
	// Field
	
	// non-static 필드 - 인스턴스 필드 (객체(인스턴스)마다 다른 값을 가지는 변수)
	String model;
	int price;
	
	// static
	static String manufacturer = "LG";
	
	
	LGComputer(String model, int price){
		this.model = model;
		this.price = price;
	}
}

public class Ex01_Computer {
	
	// main이 static 메소드인 이유
	// main 메소드를 포함하는 클래스인 
	// 호줄하기 위해
	
	public static void main(String[] args) {
		
		LGComputer lgCom = new LGComputer("GRAM", 200);
		System.out.println("모델 : " + lgCom.model);
		System.out.println("가격 : " + lgCom.price);
		
		System.out.println("제조사 : " + LGComputer.manufacturer);
		
		// new 전에 사용가능한 것 : static
		// 아닌 것 : non-static
		
	}

}
