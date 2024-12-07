//***************************

// 파일명: BookTest.java

// 작성자: 박지현

// 작성일: 2024.10.07

// 내용: 책을 나타내는 Book 클래스를 정의하고 이를 이용한 프로그램

//***************************

class Book{
	public String name;
	public int price;
	public int year;
	
	void print() {
		System.out.println ("제목은 " + (name) +  "이고, 가격은 " + (price) + "원이며, 발행연도는 " + year + "입니다.");
	}
	
	void discount(int amount) {
		price-=amount;
	}
	
	void discount() {
		if (year == 2014) {
			price *= 0.9;
		} else if (year < 2014) {
			price *= 0.5;
		}
	}	
}

public class BookTest {
	public static void main(String[] args) {
		// 과제명, 이름 출력
		System.out.println("과제명: hw4_1");
		System.out.println("작성자: 박지현");
		
		Book myBook = new Book();
		Book yourBook = new Book();
		Book ourBook = new Book();
		
		myBook.name = "java";
		myBook.price = 10000;
		myBook.year = 2014;
		
		yourBook.name = "database";
        yourBook.price = 20000;
        yourBook.year = 2013;

        ourBook.name = "computer";
        ourBook.price = 30000;
        ourBook.year = 2009;

        System.out.println("\n------- 할인 전 세 책의 정보 출력를 출력합니다 -------");
        myBook.print();
        yourBook.print();
        ourBook.print();

        // 정액 1000원 할인 들어감
        myBook.discount(1000);
        yourBook.discount(1000);
        ourBook.discount(1000);

        // 재고 할인 들어감
        myBook.discount();
        yourBook.discount();
        ourBook.discount();

        System.out.println("\n------- 할인 후 세 책의 정보 출력 --------");
        myBook.print();
        yourBook.print();
        ourBook.print();
		
	}

}
