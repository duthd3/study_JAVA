# 람다식(Lamda expression)
## 1.람다식이란?
  - 람다식은 메서드를 하나의 식 으로 표현한 것이다.
  - 익명함수 라고도 한다.
  ```java
  int[] arr = new int[5];
  Arrays.setAll(arr, (i) -> (int)(Math.random()*5)+1);
  ```
  - 람다식은 메서드의 매개변수로 전달되어지는 것이 가능하고, 메서드의 결과로 반환될 수도 있다.
  - 메서드를 변수처럼 다루는 것이 가능하다.

## 2.람다식 작성하기
  ```java
  반환타입 메서드이름(매개변수 선언{
            .....
  }
  
  (매개변수 선언) -> {
            .....
  }
  ```
  
  ```java
  int max(int a, int b){
    return a>b ? a:b;
  }
  
  (int a, int b) -> {
    return a>b ? a:b;
  }
  
  (int a, int b) -> a>b ? a:b
  (a,b) -> a>b ? a:b (타입이 추론가능 할 경우)
  ```

## 3.함수형 인터페이스(Functional Interface)
  - 람다식은 익명 클래스의 객체와 동등하다.
  ```java
  (int a, int b) -> a>b ? a:b
                 ∇
  new Object(){
        int max(int a, int b){
            return a>b ? a:b;
  }
  ```
  - 함수형 인터페이스는 오직 하나의 추상 메서드만 정의되어 있다.
  - @FunctionalInterface를 붙이면, 컴파일러가 함수형 인터페이스를 올바르게 정의하였는지 확인해준다.
  
  
  
