//***************************

// 파일명: TelevisionTest.java

// 작성자: 박지현

// 작성일: 10/14

// 내용: tv1, tv2, tv3의 정보 (모델명과 가격) 출력하는 프로그램

//***************************

class Television{
    private String model;
    private int price;

    public Television() {
        this("MyTV", 0);
    }

    public Television(String model) {
        this(model, 0);
    }

    public Television(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "모델명:" + model + " 가격:" + price;
    }
}

public class TelevisionTest {
    public static void main(String[] args) {
        System.out.println("과제명: hw4_2");
        System.out.println("작성자: 박지현");

        Television tv1 = new Television();
        Television tv2 = new Television("APPLE TV");
        Television tv3 = new Television("LG TV", 2000000);

        System.out.println(tv1.toString());
        System.out.println(tv2.toString());
        System.out.println(tv3.toString());
    }
}

