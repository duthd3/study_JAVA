# java.lang패키지
- java.lang패키지는 자바프로그래밍에 가장 기본이 되는 클래스들을 포함하고 있다.
- import문 생략가능.

### 1.Object클래스
|Object클래스의 메서드|설 명|
|--|--|
|protected Object clone()|객체 자신의 복사본을 반환한다.|
|public boolean equals(Object obj)|객체 자신과 객체 obj가 같은 객체인지 알려준다.(같은면true)|
|protected void finalize()|객체가 소멸될 때 가비지 컬렉터에 의해 자동적으로 호출된다.(거의 사용안함)|
|public Class getClass()|객체 자신의 클래스 정보를 담고 있는 Class인스턴스를 반환한다.(대문자C)|
|public int hashCode()|객체 자신의 해시코드를 반환한다.|
|public String toString()|객체 자신의 정보를 문자열로 반환한다.|
|public void notify()|객체 자신을 사용하려고 기다리는 쓰레드를 하나만 깨운다.|
|public void notifyAll()|객체 자신을 사용하려고 기다리는 모든 쓰레드를 깨운다.|
|public void wait()|다른 쓰레드가 notify()나 notifiAll()을 호출할 때까지 현재 쓰레드를 무한히 또는 지정된 시간(timeout, nanos)동안 기다리게 한다.|
|public void wait(lont timeout)
|public void wait(long timeout, int nanos)
- Object클래스는 멤버변수는 없고, 오직 11개의 메서드만 가지고 있다.
- ### equals(Object obj) 
  - 매개변수로 객체의 참조변수를 받아서 비교하여 그 결과를 boolean값으로 알려주는 역할을 한다.
  - 보통 instance variable을 가지고 같은지 다른지를 판단하도록 오버라이딩 한다.
- ### hashCode()
  - 해시코드가 같은 두 객체가 존재하는 것이 가능하지만, Object클래스에 정의된 hashCode메서드는 객체의 주소값으로 해시코드를 만들어 반환하기 때문에 32bitJVM에서는 서로다른 두 객체는 결코 같은 해시코드를 가질 수 없었지만 64bitJVM에서는 해시코드가 중복될 수 있다.
  - equals메서드를 오버라이딩 하면 hashCode()메서드도 오버라이딩 해주어야 한다. 
  - String클래스는 문자열의 내용이 같으면, 동일한 해시코드를 반환하도록 hashCode()메서드가 오버라이딩 되어있다.
  - System.identityHashCode(Object x)는 Object클래스의  hashCode메서드처럼 객체의 주소값으로 해시코드를 생성하기 때문에 모든 객체에 대해 항상 다른 해시코드값을 반환한다.
- ### toString()
  - 인스턴스에 대한 정보를 문자열(String)로 제공할 목적으로 정의한 것이다.
- ### clone()
  - 자신을 복제하여 새로운 인스턴스를 생성하는 일을 한다.
  - Object클래스에 정의된 clone()은 단순히 인스턴스변수의 값만 복사하기 때문에 참조타입의 인스턴스 변수가 있는 클래스는 완전한 인스턴스 복제가 이루어지지 않는다.
  - clone()을 사용하려면, 먼저 복제할 클래스가 Cloneable 인터페이스를 구현해야하고, clone()을 오버라이딩하면서 접근 제어자를 public으로 변경한다.
  - ### 얕은복사(swallow copy)와 깊은복사(deep copy)
    - 얕은복사(swallow copy)는 객체에 저장된 값을 그대로 복제할 뿐, 객체가 참조하고 있는 객체까지 복제하지는 않는다.
    - 따라서 원본과 복제본이 같은 객체를 공유하게 된다.
    - 깊은복사(deep copy)는 원본이 참조하고 있는 객체까지 복제한다. 원본과 복사본이 서로 다른 객체를 참조하기 때문에 원본의 변경이 복사본에 영향을 미치지 않는다.
- ### getClass()
  - 자신이 속한 클래스의 Class객체를 반환하는 메서드이다.
  - Class객체를 얻는 방법에는 여러가지가 있다.
  ```java
  Class cObj = new Card().getClass(); //생성된 객체로부터 얻는 방법
  Class cObj = Card.class; //클래스 리터럴로 부터 얻는 방법
  Class cObj = Class.forName("Card"); //클래스 이름으로 부터 얻는 방법
  ```
### 2.String클래스
- 데이터(char[]) + 메서드(문자열 관련).
- 내용을 변경할 수 없는 불변(immutable) 클래스.
```java
String a = "a";
String b = "b";
a = a+b; //"a"가 "ab"로 변경되는 것이 아니라 새로운 문자열을 만들어 새로운 객체를 가르킨다.
```
- 문자열의 결합이나 변경이 잦다면, 내용을 변경가능한 StringBuffer를 사용
- 문자열의 비교
  ```java
  String str = "abc"; //"abc"의 주소가 str1에 저장됨(공유)
  String str2 = "abc"; //"abc"의 주소가 str2에 저장됨(공유)
  String str3 = new String("abc"); //새로운String인스턴스를 생성
  String str4 = new String("abc"); //새로운String인스턴스를 생성
  ```
  - 문자열은 equals()를 사용해서 내용 비교를 해야한다.
- 문자열 리터럴
  - 문자열 리터럴은 프로그램 실행시 자동으로 생성된다.(constant pool에 저장)
  - 같은 내용의 문자열 리터럴은 하나만 만들어진다.
  - 빈문자열("", empty string)
    - 내용이 없는 문자열. 크기가 0인 char형 배열을 저장하는 문자열
    - 크기가 0인 배열을 생성하는 것은 어느 타입이나 가능 
- 문자와 문자열 초기화
  ```java
  String s = " ";//빈 문자열로 초기화
  char c = ' ';//공백으로 초기화
  ```
- String클래스의 생성자와 메서드
| 메서드/설명|예제|결과|
|--|--|--|
|String(String s)|String s = new String("Hello");|s = "Hello"|
|주어진 문자열(s)을 갖는 String인스턴스를 생성한다.|
|
  
