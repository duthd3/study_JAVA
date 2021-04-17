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
