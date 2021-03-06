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

|메서드/설명|예제|결과|
|--|--|--|
|String(String s)|String s = new String("Hello");|s = "Hello"|
|주어진 문자열(s)을 갖는 String인스턴스를 생성한다.|
|String(char[] value)|char[]c={'H','e','l','l','o'};|s = "Hello"|
|주어진 문자열(value)을 갖는 String인스턴스를 생성한다.|String s = new String(c)|
|char charAt(int index)|String s = "Hello"|
|지정된 위치(index)에 있는 문자를 알려준다.|char c = s.charAt(1);|c = 'e'|
|int compareTo(String str)|int i = "aaa".compareTo("bbb");|i = -1|
|문자열(str)과 사전순서로 비교한다. 같으면 0,사전순으로 이전이면 음수, 이후면 양수|  

- #### join()과 StringJoiner
  - join()은 여러문자열 사이에 구분자를 넣어서 결합한다.
  ```java
  String animals = "dog,cat,bear";
  String[] arr = animals.split(","); //문자열을 ','를 구분자로 나눠서 배열에 저장
  String str = String.join("-", arr); //배열의 문자열을 '-'로 구분해서 결합
  System.out.println(str) // dog-cat-bear
  ```

- #### 숫자를 문자열로 바꾸는 방법
  ```java
  int i = 100;
  String str1 = i + ""; //편리
  String str2 = String.valueOf(i); //빠름
  ```
- #### 문자열을 숫자로 바꾸는 방법
  ```java
  int i = Integr.parseInt("100"); //"100"을 100으로 변환하는 방법 1 (old)
  int i2 = Integer.valueOf("100"); //"100"을 100으로 변환하는 방법 2 (new)
  Integer i2 = Integer.valueOf("100") //원래는 반환 타입이 Integer, 기본형으로 써도 무방(오토박싱. Integer->int)
  ```
### 3.StringBuffer클래스
- String처럼 문자형 배열(char[])을 내부적으로 가지고 있다.
- String과 달리 내용을 변경할 수 있다.(mutble)
- String과 달리 equals()가 오버라이딩되어있지 않다.(주소비교)
  - StringBuffer을 String으로 변환 후에 equals()로 비교해야 한다.
  ```java
  StringBuffer sb = new StringBuffer("abc");
  StringBuffer sb2 = new StringBuffer("abc");
  
  System.out.println(sp==sb2);//false
  System.out.println(sb.equals(sb2));//false
  
  String s = sb.toString();  
  String s2 = sb2.toString();
  
  System.out.println(s.equlas(s2)); //true
  ```
### 4.StringBuilder클래스
- StringBuffer는 동기화 되어 있다. 멀티 쓰레드에 안전(thread-safe)->동기화는 데이터 보호
- 멀티 쓰레드 프로그램이 아닌 경우, 동기화는 불필요한 성능저하(StringBuffer대신 StringBuilder를 사용하면 성능 향상)
- 싱글 쓰레드 프로그램인경우 StringBuilder를 쓰는게 좋다.(StringBuffer와는 동기화 여부에 있어서 갈린다.)
#### 멀티쓰레드, 싱글쓰레드
- 멀티쓰레드
  - 한번에 n개 작업(파일다운로드+채팅 등)
- 싱글쓰레드
  - 한번에 1개 작업
  - 
### 5.Math클래스
- 수학관련 static메서드의 집합.
- round()로 원하는 소수점 아래 세 번째 자리에서 반올림.
- 
### 6.래퍼(wrapper)클래스
-8개의 기본형을 객체로 다뤄야할 때 사용하는 클래스.(기본형을값을 감싸는 클래스)
|기본형|래퍼클래스|생성자|활용예
|--|--|--|--|
|boolean|Boolean|Booleand(boolean value) ,   Boolean(String s)|Boolean b = new Boolean(treu); ,            Boolean b2 = new Boolean("true");|
|char|Character|Character(char value)|Character c = new Character('a');|
|byte|Byte|Byte(byte value),                 Byte(String s)|Byte b = new Byte(10);,  Byte b2= new Byte("10");|
|short|Short|Short(short value), Short(String s)|Short s = new Short(10), Short s2 = new Short("10");|
|int|Integer|Integer(int value), Integer(String s)|Integer i = new Integer(100), Integer i2 = new Integer("100");|
|long|Long|Long(long value), Long(String s)|Long l = new Long(100), Long l2 = new long("100");|
|float|Float|Float(double value), Float(float value), Float(String s)|Float f = new Float(1.0), Float f2 = new Float(1.0f), Float f3 = new Float("1.0f");|
|double|Double|Double(double value), Double(String s)|Double d = new Double(1.0), | Double d2 = new Double("1.0");|
- Number클래스
 - 모든 숫자 래퍼 클래스의 조상.(추상 클래스)
 - 래퍼객체->기본형
- 문자열을 숫자로 변환하기
  - 문자열->기본형
  - byte b = Byte.parseByte("100")
  - int i= Integer.parseInt("100");
  - int i2 = Integer.parseInt("100", 2); //100이 2진법의 숫자
 - 문자열을 래퍼클래스로 변환하기
   - Byte b = Byte.valueOf("100");
   - Integer i = Integer.valueOf("100");
   - 
- 오토박싱 & 언박싱(autoboxing & unboxing
  - 기본형과 참조형 간의 자동 형변환
  - int-->Integer(오토박싱)기본형->래퍼클래스(자동변환)
  - Integer-->int(언박싱)래퍼클래스->기본형(자동변환)
  
  |컴파일 전의 코드|컴파일 후의 코드|
  |--|--|
  |int i = 5;|int i = 5;|
  |Integer iObj = new Integer(7)|Integer iObj = new Integer(7);|
  |int sum = i + iObj;|int sum = i + iObj.intValue();|
  
  
