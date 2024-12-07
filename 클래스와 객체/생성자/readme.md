[hw4_2] Television 생성자

---------------------------------------------------------

- Television 클래스

인스턴스 변수: 모델명, 가격(정수형)

* 모든 변수는 Private으로 

 

메소드: 

     모델명의 getter와 setter

     가격의 getter와 setter

 

     생성자1 - 매개변수가 없는 디폴트 생성자. 모델명은 "MyTV", 가격은 0으로 초기화 

     생성자2 - 모델명을 매개변수로 받아 초기화, 가격 0으로 초기화하되, 

               직접 필드값을 지정하지 말고 생성자3을 호출하여 초기화 

     생성자3 - 모델명과 가격을 매개변수로 받아 초기화 

     

     텔레비젼의 정보를 문자열로 만들어 리턴하는 toString 메소드를 다음과 같이 정의 

     public String toString() {

         return "모델명:" + model + " 가격:" + price;

     } 

 

- TelevisionTest 클래스의 main 메소드는 다음을 수행

 

텔레비젼 객체 tv1을 생성 - 생성자1 호출하도록

텔레비젼 객체 tv2를 생성 - 적당한 매개변수를 주어 생성자2 호출하도록

텔레비젼 객체 tv3을 생성 - 적당한 매개변수를 주어 생성자3 호출하도록

 

텔레비젼들의 정보를 출력하기 위해 다음 세 문장을 수행

 System.out.println(tv1); // System.out.println(tv1.toString()); 으로 해도 됨

 System.out.println(tv2); 

 System.out.println(tv3); 

 

- 입력: 없음

- 출력: tv1, tv2, tv3의 정보(모델명과 가격)
