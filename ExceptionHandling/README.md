# 예외처리

### 1.프로그램오류
- 컴파일에러:컴파일 시에 발생하는 에러
- 런타임에러:실행 시에 발생하는 에러
  - 에러(error):프로그램 코드에 의해서 수습될 수 없는 심각한 오류
  - 예외(exception):프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류
    - RuntimeException클래스와 그자손(자바의 프로그래밍 요소들과 관계가 깊다 ex)ArrayIndexOutOfBoundsException, NullPointerException)
    - Exception클래스와 그자손(사용자들의 동작에 의해서 발생하는 경우가 많다 ex)FileNotFoundException)
- 논리적에러:실행은 되지만, 의도와 다르게 동작하는 것

### 2.예외처리하기 - try-catch문
- 정의:프로그램 실행 시 발생할 수 있는 예외에 대비한 코드를 작성하는 것
- 목적:프로그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는 것
- 처리되지 못한 예외는 JVM의 예외처리기가 받아서 예외의 원인을 화면에 출력한다
```java
try{
      //예외가 발생할 가능성이 있는 문장들을 넣는다.
   }catch(Exception1 e1){
   //Exception1이 발생했을 경우, 이를 처리하기 위한 문장
   }catch(Exception2 e2){
   //Exception2가 발생했을 경우, 이를 처리하기 위한 문장
   }
```
- 발생한 예외의 종류와 일치하는 단 한개의 catch블럭만 수행된다.
- 일치하는 catch블럭이 없으면 예외는 처리되지 않는다.

### 3.try-catch문에서의 흐름
- #### try블럭 내에서 예외가 발생한 경우
  - 예외가 발생하면 try블럭을 바로 벗어난다
  - 발생한 예외와 일치하는 catch블럭이 있는지 확인
  - 일치하는 catch블럭을 찾게 되면, 그 catch블럭 내의 문장들을 수행하고 전체 try-catch문을 빠져나가서 그다음 문장을 계속해서 수행
  - 일치하는 catch블럭을 찾이 못하면, 예외는 처리되지 못한다.
- #### try블럭 내에서 예외가 발생하지 않은 경우
  - catch블럭을 거치지 않고 전체 try-catch문을 빠져나가서 수행을 계속한다
 
 ### 4.예외의 발생과 catch블럭
 - 예외가 발생하면, 발생한 예외에 해당하는 클래스의 인스턴스 생성.
 - catch블럭의 괄호()내에 선언된 참조변수의 종류와 생성된 예외클래스의 인스턴스에 instanceof연산자를 이용해서 검사.
 ```java
 try{
  ///
 }catch(ArithmeticException ae){
       if(ae instanceof ArithmeticException)
            ///
  }
  ```
 - 모든 예외클래스는 Exception클래스의 자손.
 - catch블럭의 괄호()에 Exception클래스 타입의 참조변수를 선언해 놓으면 어떤 종류의 예외가 발생하더라도 처리.
  
 - #### printStackTrace()와 getMessage()
    -  printStackTrace():예외발생 당시의 호출스택(Call Stack)에 있었던 메서드의 정보와 예외 메시지를 화면에 출력한다.
    -  getMessage():발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있다. 
    -  예외가 발생해도 비정상적으로 종료하지 않도록 해주는 동시에, 예외의 발생원인을 알 수 있다.
- #### 멀티catch블럭
```java
try{
 ///
 }catch(ExceptionA e){
 e.printStackTrace();
 }catch(ExceptionB e2){
 e2.printStackTrace();
 }
 ```
 ```java
try{
///
}catch(ExceptionA | ExceptionB e){
e.printStackTrace();
}
```
  - 중복된 코드를 줄일 수 있다.
  - 만일 '|'기호로 연결된 예외 클래스가 조상과 자손의 관계에 있다면 에러발생.
  - 조상클래스만 써주는 것과 똑같기 때문.
   
### 5.예외 발생시키기 
- 키워드 throw를 사용해서 프로그래머가 고의로 예외를 발생시킬 수 있다.
  - 연산자new를 이용해서 발생시키려는 예외 클래스의 객체를 만든다.
    - Exception e = new Exception("고의로 발생");
    - Exception인스턴스를 생성할 때, 생성자에 String을 넣어주면, getMessage()를 이용해서 얻을 수 있다.
  - 키워드 throw를 이용해서 예외를 발생시킨다.
    - throw e;
  - Unchecked예외 & Checked에외 
    - 컴파일러가 예외처리를 확인하지 않는 RuntimeException클래스들은 'Unchecked예외'.
    - 컴파일러가 예외처리를 확인하는 Exception클래스들은 'Checked예외'.

### 6.메서드에 예외 선언하기
- 예외를 처리하는 방법에는 try-catch문과 예외를 메서드에 선언하는 방법이 있다.
- 키워드 throws를 사용한다.(throw와 구별)
```java
void method() throws Exception1, Exception2, ExceptionN{
  //메서드의 내용
  }
```
-RuntimeException클래스의 자손은 적지 않는다.


    
    
      







