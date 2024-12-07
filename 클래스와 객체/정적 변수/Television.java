//***************************

// 파일명: Television.java

// 작성자: 박지현

// 작성일: 10/28

// 내용: hw4_2의 Television 클래스에 정적 멤버를 추가하고 이를 이용하는 프로그램

//***************************

package hw5_1;

public class Television{
    private String model;
    private int price;
 
    // 정적 변수 - 생성된 텔레비젼 객체 수를 세기 위한 변수
    private static int numberOfTVs = 0;

    // 메소드
    
    // 모델명의 getter와 setter
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // 가격의 getter와 setter
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // 생성자1 - 디폴트 생성자
    public Television() {
        this("MyTV", 0);
    }

    // 생성자2 - 모델명만 매개변수로 받아 초기화, 가격은 0
    public Television(String model) {
        this(model, 0);
    }

    // 생성자3 - 모델명과 가격을 매개변수로 받아 초기화
    public Television(String model, int price) {
        this.model = model;
        this.price = price;
        numberOfTVs++; // 텔레비젼 객체 수 1 증가시킴!
    }

    // 텔레비젼 객체 수를 리턴하는 정적 메소드
    public static int getNumberOfTVs() {
        return numberOfTVs;
    }

    // 텔레비젼의 정보를 문자열로 만들어 리턴하는 메소드
    public String toString() {
        return "모델명:" + model + " 가격:" + price;
    }
}

