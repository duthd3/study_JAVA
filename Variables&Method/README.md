# 변수와 메서드(Variables&Method)
- 변수는 클래스변수, 인스턴스변수, 지역변수 가 있다.
- 멤버변수를 제외한 나머지 변수들은 모두 지역변수이며, 멤버변수 중 static이 붙은 것은 클래스변수, 붙지 않은 것은 인스턴스변수 이다.

|변수의 종류|선언위치|생성시기|
|--|--|--|
|클래스변수|클래스영역|클래스가 메모리에 올라갈 때|
|인스턴스변수|클래스영역|인스턴스가 생성되었을 때|
|지역변수|클래스영역 이외의 영역|변수 선언문이 수행되었을 때|

## 변수
- 1.인스턴스 변수
  - 클래스의 인스턴스를 생성할 때 만들어 진다.
  - 사용하기 위해서 인스턴스를 생성해야 한다.
  - 인스턴스마다 고유한 상태를 유지해야하는 속성의 경우, 인스턴스변수로 선언한다.
- 2.클래스 변수
  - 인스턴스 변수앞에 static을 붙이기만 하면된다.
  - 모든 인스턴스가 공통된 저장공간(변수)을 공유하게 된다.
  - 인스턴스 생성없이 바로사용 가능 하다.
  - 클래스이름.클래스변수
- 3.전역 변수
  - 메서드 내에 선언되어 메서드 내에서만 사용 가능.
  - 메서드 종료되면 소멸.
  
## 메서드
- 특정 작업을 수행하는 일련의 문장들을 하나로 묶은 것.
- 높은 재사용성, 중복된 코드의 제거, 프로그램의 구조화.
- 1.메서드의 선언과 구현
  - 선언부, 구현부    
    - 반환타입 메서드이름(타입 변수명, 타입 변수명...............)-->선언부
    - {메서드 호출시 수행될 코드}-->구현부
- 2.메서드의 호출
  - 메서드이름(값1,값2........)
  - 값1,값2......을 인자 또는 인수라고 한다.
  - 인자의 개수와 순서는 호출된 메서드에 선언된 매개변수와 일치해야 한다.
  - 호출시 매개변수로 지정된 값은 메서드의 매개변수로 복사 된다.
## return문
- 현재 실행중인 메서드를 종료하고 호출한 메서드로 되돌아간다.
- 메서드 반환타입과 return 반환타입이 일치해야 한다.
## JVM의 메모리 구조
- 1.메서드영역
- 2.힙 영역
- 3.호출스택
  - 메서드가 호출되면 수행에 필요한 만큼의 메모리를 스택에 할당 받는다.
  - 메서드가 수행을 마치고나면 사용했던 메모리를 반환하고 스택에서 제거된다.
  - 호출스택의 제일 위에 있는 메서드가 현재 실행 중인 메서드이다.
  - 아래에 있는 메서드가 바로 위의 메서드를 호출한 메서드이다.
  
## 기본형 매개변수와 참조형 매개변수
- 1.기본형 매개변수
  - 변수의 값을 읽기만 할 수 있다.(read only)
- 2.참조형 매개변수
  - 변수의 값을 읽고 변경할 수 있다.(read & write)
  
## 참조형 반환타입  
- 참조형 타입의 값은 객체의 주소이므로 그저 정수값이 반환되는 것일 뿐이다.

## 클래스 메서드(static메서드)와 인스턴스 메서드
- 메서드앞에 static이 붙어잇으면 클래스 메서드.
- 클래스이름.메서드이름과 같은식으로 호출이 가능.
- 인스턴스 메서드는 인스턴스 변수와 관련된 작업을 하는, 즉 메서드의 작업을 수행하는데 인스턴스 변수를 필요로 하는 메서드이다.
- 클래스 메서드(static메서드)는 인스턴스와 관계없는 메서드이다.
- 모든 인스턴스에 공통으로 사용하는 것에 static을 붙인다.(모든 인스턴스에서 같은 값이 유지되어야 하는 변수.)
- 클래스 변수(static변수)는 인스턴스를 생성하지 않아도 사용할 수 있다.
- 클래스 메서드(static메서드)는 인스턴스 변수를 사용할 수 없다.
- 메서드 내에서 인스턴스 변수를 사용하지 않는다면, static을 붙이는 것을 고려한다.

## 클래스 멤버와 인스턴스 멤버간의 참조와 호출
- 같은 클래스에 속한 멤버들 간에는 별도의 인스턴스를 생성하지 않고도 서로 참조 또는 호출이 가능하다.
- static메서드는 인스턴스 메서드를 호출할 수 없다.
- static메서드는 인스턴스 변수를 사용할 수 없다.