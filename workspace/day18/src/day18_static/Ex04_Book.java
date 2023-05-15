package day18_static;

	class Book {
		// Field
		// Static 필
		static int cnt = 0; // new Book() 이 호출될 때 마다 1씩 증가되는 변수
		
		// 인스턴스 필드 (non-static) : 인스턴스마다(book1, book2, book3) 개별적으로 가지는 값
		// 모든 인스턴스의 serialNo의 초기화는 0이다.
		int serialNo;
		
		// 방법 1.
		Book() {
			cnt++;
			serialNo = cnt;
		}
		
		// 방법 2.
//		{
//			cnt++;
//			serialNo = cnt;
//		}
	}

public class Ex04_Book {
	public static void main(String[] args) {
		
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		
		System.out.println("book1의 고유번호는 " + book1.serialNo + "이다.");
		System.out.println("book2의 고유번호는 " + book2.serialNo + "이다.");
		System.out.println("book3의 고유번호는 " + book3.serialNo + "이다.");
		
	}
}
