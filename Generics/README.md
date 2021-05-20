# 지네릭스(Generics)

## 1.지네릭스
- 컴파일 시의 타입체크를 해주는 기능
- 객체의 타입 안정성을 높이고 형변환의 번거로움이 줄어든다.
```
지네릭스의 장점
1. 타입 안정성을 제공한다.
2. 타입체크와 형변환을 생략할 수 있으므로 코드가 간결해 진다.
```

## 2.지네릭 클래스의 선언
- 지네릭 타입은 클래스와 메서드에 선언.
```java
class Box<T>{
    T item; //T가 String인 것과 같다.
    
    void setItem(T item){this.item = item;}
    T getItem(){ return item;} //T가 String인 것과 같다.
}

Box<String> b = new Box<String>();
b.setItem(new Object()); //에러. String이외의 타입은 지정불가
b.setItem("ABC");
String item = b.getItem();
}
```
- 지네릭스의 용어
```java
class Box<T>{}

Box<T> : 지네릭 클래스. T의Box 또는 T Box 라고 읽는다.
T : 타입 변수 또는 타입 매개변수(T는 타입 문자)
Box : 원시 타입(raw type)
```

- 지네릭스의 제한
  - 지네릭스는 인스턴스별로 다르게 동작하도록 하려고 만든 기능.
  - 따라서, static멤버에 타입 변수 T를 사용할 수 없다.
  - T는 인스턴스변수로 간주.
  - 지네릭 타입의 배열을 생성하는것을 허용하지 않는다.(new 연산자는 컴파일 시점에 타입 T가 뭔지 정확하게 알아야 하기 때문.)
  - 지네릭 배열타입의 참조변수를 선언하는 것은 가능.

## 3.지네릭 클래스의 객체 생성과 사용
```java
Box<Apple> appleBox = new Box<Apple>(); //참조변수와 생성자에 대입된 타입이 일치해야 한다.
Box<Fruit> appleBox = new Box<Apple>(); //에러 Apple이 Fruit의 자손이여도.
appleBox.add(new Apple());
appleBox.add(new Grape()); //에러 

Box<Fruit> fruitBox = new Box<Fruit>();
fruitBox.add(new Apple()); //가능(Apple은 Fruit의 자손이기 때문에)
```

## 4.제한된 지네릭 클래스
```java
class FruitBox<T extends Fruit> { //Fruit의 자손만 타입으로 지정가능, Fruit포함
    ArrayList<T> list = new ArrayList<T>();
}
```
- 클래스가 아니라 인터페이스를 구현해야 한다는 제약이 필요하다면, 이때도 extends를 사용한다 implements를 사용하지 않는다.
- Fruit의 자손이면서 Eatable인터페이스도 구현해야한다면 아래와 같이 '&' 기호로 연견한다.
```java
class FruitBox<T extends Fruit & Eatable>{...}
```

## 5.와일드카드
- 지네릭 타입이 다른 것만으로는 오버로딩이 성립하지 않는다.
- 지네릭 타입은 컴파일러가 컴파일할 때만 사용하고 제거해버린다.
```java
<? extends T> 와일드 카드의 상한 제한. T와 그 자손들만 가능
<? super T> 와일드 카드의 하한 제한. T와 그 조상들만 가능
<?> 제한없음. 모든 타입이 가능. <? extends Object>와 동일
```

## 6.지네릭 메서드
- 메서드의 선언부에 지네릭 타입이 선언된 메서드.
```java
static <T> void sort(List<T> list, Comparator<? super T> c)
```
- 메서드에 지네릭 타입을 선언하고 사용하는 것은 가능하다.(static메서드 에도, 메서드에 선언된 지네릭 타입은 지역변수라 생각.)


```java
static Juice makeJuice(FruitBox<? extends Fruit> box){...}
static <T exrends Fruit> Juice makeJuice(FruitBox<T> box){...}
```

## 7.지네릭 타입의 형변환
- 지네릭 타입과 원시타입(raw type)간의 형변환은 항상 가능하다. 하지만 경고가 발생한다.
- 대입도니 타입이 다른 지네릭 타인 간에는 형변환이 불가능하다.

## 8.지네릭 타입의 제거
- 컴파일러는 지네릭 타입을 이용해서 소스파일을 체크하고, 필요한 곳에 형변환을 넣어준다.
- 그리고 지네릭 타입을 제거한다.(컴파일된 파일에는 지네릭 타입에 대한 정보가 없다.)

