package day18_static;

class Document {
	
	// static 필드 
	static int cnt = 0;
	
	// non-static 필드 
	String fileName;
	
	Document() {
		fileName = "새 텍스트 문서" + (++cnt) + ".txt";
	}
	
	Document(String fileName){
		this.fileName = fileName;
	}
	
	// Method
	void printDoc() {
		System.out.println(fileName);
	}
}

public class Ex05_Document {
	public static void main(String[] args) {
		Document doc1 = new Document();
		
		doc1.printDoc();
	}
}
