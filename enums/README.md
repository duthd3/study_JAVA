# 열거형(enums)
## 1.열거형이란?
- 열거형은 서로 관련된 상수를 편리하게 선언하기 위한 것으로 여러 상수를 정의할 때 사용하면 유용하다.
- 타입까지 관리한다.
```java
class Card{
  enum Kind {CLOVER, HEART, DIAMOND, SPADE}
  enum Value {TWO, THREE, FOUR}
  
  final Kind kind;
  final Value value;
```
- 실제 값이 같아도 타입이 다르면 컴파일 에러 발생
```java

if(Card.Kind.CLOVER==Card.Value.TWO) //컴파일 에러. 값은 같지만 타입이 다름.
```

## 2.열거형의 정의와 사용
```java
enum 열거형이름{ 상수명1, 상수명2, ...}
```
- 열거형이름.상수명 으로 사용
- ==연산자 사용 가능, <,>비교 연산자 사용불가, compareTo()사용 가능

## 3.열거형에 멤버 추가하기
- 열거형 상수의 값이 불연속적인 경우에는 다음과 같이 열거형 상수의 이름옆에 원하는 값을 괄호()와 함께 적어주면 된다.
```java
enum Direction{
      EAST(1), SOUTH(5), WEST(-1), NORTH(10);
      private final int value;
      Direction(int value){this.value = value;}
      public int getValue(){return value;}
      }

```
- 열거형 상수에 여러값을 지정할 수도 있다.
```java
enum Direction{
    EAST(1, ">"), SOUTH(2, "V"), WEST(3, "<"), NORTH(4,"^");
    private final int value;
    private final String symbol;
    Direction(int value, String symbol){
      this.value = value;
      this.symbol = symbol;
    }
    public int getValue(){ return value;}
    public String getSymbol(){ return symbol;}
}

## 4.열거형의 이해
```java
enum Direction{EAST, SOUTH, WEST, NORTH}
```
- 열거형 상수 하나하나가 Direction객체이다.
