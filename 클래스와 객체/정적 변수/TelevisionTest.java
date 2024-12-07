//***************************

// 파일명: TelevisionTest.java

// 작성자: 박지현

// 작성일: 10/28

// 내용: Television 클래스의 테스트 프로그램

//***************************

package hw5_1;

public class TelevisionTest {
    public static void main(String[] args) {
        System.out.println("과제명: hw5_1");
        System.out.println("작성자: 박지현");
        
        // 이제까지 생성된 텔레비젼 수를 출력
        System.out.println("생성된 텔레비젼 수: " + Television.getNumberOfTVs());

        // 텔레비전 객체 생성하기
        Television tv1 = new Television();
        Television tv2 = new Television("APPLE TV");
        Television tv3 = new Television("LG TV", 2000);

        // 텔레비전 정보 출력
        System.out.println(tv1.toString());
        System.out.println(tv2.toString());
        System.out.println(tv3.toString());
        
        // 이제까지 생성된 텔레비젼 수를 출력
        System.out.println("생성된 텔레비젼 수: " + Television.getNumberOfTVs());
    }
}