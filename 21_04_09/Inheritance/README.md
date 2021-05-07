# 상속(Inheritance)



- ### 상속
1. 기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것이다.
2. 코드의 추가 및 변경이 매우 용이하다.(재사용성++,생산성,유지보수++)
3. extends 키워드를 사용한다.
4. 생성자와 초기화 블럭은 상속되지않는다. 멤버만 상속된다.
5. 자손 클래스의 멤버 개수는 조상 클래스보다 항상 같거나 많다.
6. 자바는 단일상속 만을 허용한다.
```java
class SportsCar extends Car{
   //
}
```


- ### 포함
1. 한 클래스의 멤버변수로 다른 클래스 타입의 참조변수를 선언하는 것이다.
```java
class Circle{ //다른클래스와 관계가 없는경우      class Point{
      int x;                                          int x;      
      int y;                                          int y;
      int r;                                      }
 }
class Circle{
     Point c = new Point();
     int r;
} 
```
 
2. ~ 은~ 이다(is - a)관계이면 상속
3. ~ 은~ 을 가지고 있다.(has - a)관계이면 포함

- ### Object
1. Object클래스는 모든 클래스 상속계층도의 최상위에 있는 조상클래스이다. 
2. to String()은 Object클래스에 정의된 것으로, 어떤 종류의 객체에 대해서도 toString()을 호출하는 것이 가능하다.

