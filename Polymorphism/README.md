# 다형성(Polomorphism)
## 1.다형성이란
  - 조상클래스 타입의 참조변수로 자손클래스의 인스턴스를 참조할 수 있도록 한것.
  - 참조변수의 타입에 따라 사용할 수 있는 멤버의 개수가 달라진다.
  - 자손타입의 참조변수로 조상타입의 인스턴스를 참조하는 것은 불가능 하다.
  ```java
  class Tv{
   boolean power;
   int channel;
  
   void power();
    void channelUp();
    void channelDown();
  }
  class CaptionTv extends Tv{
    String text;
    void caption(){}
  }
  CaptionTv c = new CaptionTv();
  Tv t = new CaptionTv(); //t.text, t.caption() 사용 불가
  CaptionTv c = new Tv(); //error 실제인스턴스인 Tv의 멤버개수보다 참조변수 c가 사용할 수 있는 멤버 개수가 더 많기 때문에.
  ```

  ```
  조상타입의 참조변수로 자손타입의 인스턴스를 참조할 수 있다.
  반대로 자손타입의 참조변수로 조상타입의 인스턴스를 참조할 수는 없다.
  ```

## 2.참조변수의 형변환
  - 기본형 변수와 같이 참조변수도 형변환 가능.
  - 서로 상속관계에 있는 클래스사이에서만 가능하다.
  ```
  자손타입->조상타입(Up-casting):형변환 생략가능
  자손타입<-조상타입(Down-casting):형변환 생략불가
  ```
  - 참조변수의 형변환은 인스턴스에 아무런 영향을 미치지 않는다.
  - 참조변수의 형변환을 통해서, 참조하고 있는 인스턴스에서 사용할 수 있는 멤버의 범위(개수)를 조절.
  
## 3.instanceof연산자
- 참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해 instanceof연산자를 사용한다.
- instanceof를 이용한 연산결과로true를 얻었다는 것은 참조변수가 검사한 타입으로 형변환이 가능하다는 것을 뜻한다.
```
어떤 타입에 대한 instanceof연산의 결과가 true라는 것은 검사한 타입으로 형변환이 가능하다는 것을 뜻한다.
```

## 4.참조변수와 인스턴스의 연결
- 메서드의 경우 조상클래스의 메서드를 자손의 클래스에서 오버라이딩한 경우에도 참조변수의 타입에 관계없이 항상 실제 인스턴스의 메서드 호출.
- 멤버변수의 경우 참조변수의 타입에 따라 달라진다.

## 5.매개변수의 다형성
- 메서드의 매개변수에 다형성을 적용 시킬 수 있다.
```java
class Product{
  int price;
  int bonusPoint;
  }
class Tv extends Product{}
class Computer extends Product{}

class Buyer{
  int money=100;
  int bonusPoint = 0;
  void buy(Product p){ //Product 클래스를 상속받은 자손은 누구나 올 수 있다.
   ...
  }
```  

## 6.여러 종류의 객체를 배열로 다루기
- 조상타입의 참조변수 배열을 사용하면, 공통의 조상을 가진 서로 다른 종류의 객체를 배열로 묶어서 다룰 수 있다.
```java
Product[p] = new Product[3];
p[0] = new Tv();
p[1] = new Computer();
```
  
