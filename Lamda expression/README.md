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
  
## 4.java.util.function패키지


## 5.Function의 합성과 Predicate의 결합
  - Function의 합성
    - f.andThen(g)는 f를 먼저 적용, 그 다음에 함수 g를 적용한다.
    - f.compose(g)는 g를 먼저 적용, 그 다음에 함수 f를 적용한다.
    - identity()는 함수를 적용하기 이전과 이후가 동일한 항등 함수.
  - Predicate의 결합
    - and(),or(),negate()로 연결해서 하나의 새로운 Predicate로 결합할 수 있다.
       
## 6.메서드 참조
  - 람다식이 하나의 메서드만 호출하는 경우에는 '메서드 참조' 라는 방법으로 람다식을 간략히 할 수 있다.
  ```java
    Function<String, Integer> f = (String s) -> Integer.parseInt(s);
                               ∇
    Function<String, Integer> f = Integer::parseInt;
    
    하나의 메서드만 호출하는 람다식은 '클래스이름::메서드이름' 또는 '참조변수::메서드이름'으로 바꿀 수 있다.
  ```
  
  - 생성자의 메서드 참조
  ```java
    Supplier<MyClass> s = () -> new MyClass();
    Supplier<MyClass> s = MyClass::new;
  ```
  - 배열을 생성할 때
  ```java
    Function<Integer, int[]> f = x->new int[x];
    Function<Integer, int[]> f = int[]::new;
  ```
  
