# 스트림(Stream)

## 1.스트림이란?
  - 데이터소스를 추상화하고, 데이터를 다루는데 자주 사용되는 메서드들을 정의
  - 데이터소스 추상화는 데이터 소스가 무엇이던 간에 같은 방식으로 다룰 수 있게 되었다는 것과 코드의 재사용성이 높아진다는 것을 의미.
  ```java
    String[] strArr = { "aaa", "ddd", "ccc"};
    List<String> strList = Arrays.asList(strArr);
    
    Stream<String> strStream1 = strList.stream();
    Stream<String> strStream2 = Arrays.stream(strArr);
  ```
  - 스트림은 데이터 소스를 변경하지 않는다.
  - 스트림은 일회용이다.
  - 스트림은 작업을 내부 반복으로 처리한다.
  - 스트림의 연산
    - 스트림에 정의된 메서드 중에서 데이터 소스를 다루는 작업을 수행하는 것은 연산(operation)이라고 한다.
    - 중간연산:연산결과를 스트림으로 반환, 중간연산을 연속해서 연결할 수 있다.
    - 최종연산:스트림의 요소를 소모하면서 연산을  수행하므로 단 한번만 연산이 가능하다.
    ```java
      중간연산 연산결과가 스트림인 연산. 스트림에 연속해서 중간 연산할 수 있음
      
      최종연산 연산결과가 스트림이 아닌 연산. 스트림의 요소를 소모하므로 단 한번만 가능
      
      stream.distinct().limit(5).sorted().forEach(System.out::println)
    ```
  - 지연된 연산
    - 스트림 연산에서 한 가지 중요한 점은 최종 연산이 수행되기 전까지는 중간 연산이 수행되지 않는다는 것이다.
    - distinct()나 sort()같은 중간 연산을 호출해도 즉각적인 연산이 수행되는 것은 아니다.
    - 최종연산이 수행되어야 비로소 스트림의 요소들이 중간 연산을 거쳐 최종 연산에서 소모된다.
  - Stream<Integer>와 IntStream
    - Stream<Integer>대신 IntStream을 사용하는것이 더 효율적이다.
  - 병렬 스트림
    - 스트림으로 데이터를 다룰 떄의 장점 중 하나가 바로 병렬 처리가 쉽다는 것이다.
    - parallel()이라는 메서드를 호출하면 병렬로 연산을 수행한다.
    - sequential()이라는 메서드를 호출하면 병렬로 처리되지 않는다.(parallel()을 호출한 것을 취소할 때만 사용한다.)

## 2.스트림 만들기
  - Collection에 stream()이 정의되어 있다.
  ```java
  Stream<T> Collection.stream()
  
  List<Integer> list = Arrays.asList(1,2,3,4,5);
  Stream<Integer> intStream = list.stream();
  ```
  - forEach()는 지정된 작업을 스트림의 모든 요소에 대해 수행한다.
  - forEach()가 스트림의 요소를 소모하면서 작업을 수행하므로 같은 스트림에forEach()를 두번 호출할 수 없다.
  - 스트림의 요소를 한번 더 출력하려면 스트림을 새로 생성해야 한다.
  
  - 배열 스트림
  ```java
  Stream<T> Stream.of(T...values)가변인자
  Stream<T> Stream.of(T[])
  Stream<T> Arrays.stream(T[])
  Stream<T> Arrays.stream(T[] array, int startInclusive, int endExclusive)
  ```
  - 기본형배열 스트림
  ```java
  IntStream IntStream.of(int.. values)
  IntStream IntStream.of(int[])
  IntStream Arrays.stream(int[])
  IntStream Arrays.stream(int[] array, int startInclusive, int endExclusvie)
  ```
  - 특정 범위의 정수
  ```java
  IntStream IntStream.range(int begin, int end)->end는 범위에 포함되지 않는다.
  IntStream IntStream.rangeClosed(int begin, int end)->end가 범위에 포함된다.
  ```
  - 임의의 수
    - IntStream ints()
    - LongStream longs()
    - DoubleStream doubles()
    - 위 메서드들은 무한 스트림을 반환한다.
    - limit()을 이용하여 무한 스트림을 유한 스트림으로 만들수 있다..
    ```java
    IntStream intStream = new Random().ints();
    intStream.limit(5).forEach(System.out::println);
    ```
    - 유한 스트림
      - IntStream ints(long streamSize)
      - LongStream longs(long streamSize)
      - DoubleStream doubles(logn streamSize)
  
  - 람다식:iterate(), generate()
    - 람다식을 매개변수로 받아서 이 람다식에 의해 계산되는 값들을 요소로 하는 무한 스트림을 생성.
    ```java
    static <T> Stream<T> iterate(T seed, UnaryOperator<T> f)
    static <T> Stream<T> generate(Supplier<T> s)
    ```
    - iterate()는 씨앗값(seed)로 지정된 값부터 시작해서, 람다식 f에 의해 계산된 결과를 다시seed 값으로 해서 계산을 반복.
    - generate()도 iterate()처럼 람다식에 의해 계산되는 값을 요소로 하는 무한스트림 생성. 그러나 seed 사용 x.
  
## 3.스트림의 중간연산  
  - 스트림 자르기:skip(), limit()
  ```java
  Stream<T> skip(long n)
  Stream<T> limit(long maxSize)
  ```
  - 스트림의 요소 걸러내기:filter(), distinct()
    - distinct():스트림에서 중복된 요소들을 제거
    - filter():주어진 조건에 맞지 않는 요소를 걸러낸다.
  - 정렬:sorted()
  ```java
  Stream<T> sorted()
  Stream<T> sorted(Comparator<? super T> comparator)
  ```
  - 변환:map()
  - T타입을 R타입으로 변환.
  ```java
  Stream<R> map(Function<? super T, ? extends R> mapper)  
  ```

  - 조회:peek()
  
## 4.Optional<T>, OptionalInt
- Optional<T>는 지네릭 클래스로, 'T타입의 객체'를 감싸는 래퍼 클래스 이다.
- 최종 연산의 결과를 그냥 반환 하는게 아니라 Optional객체에 담아서 반환.
- 반환된 결과가 null인지 매번 if문으로 체크하는 대신 Optional에 정의된 메서드를 통해서 간단히 처리 가능.
- Optional객체 생성.
  - of()또는 ofNullable()사용.
```java
String str = "abc";
Optional<String> optVal = Optional.of(str);
Optional<String> optVal = Optional.of("abc");
Optional<String> optVal = Optional.of(new String("abc"));
```
  - of()는 매개변수의 값이 Null이면 NullPointerException 발생.(ofNullable()사용)
  - Optional<T> 타입의 참조변수를 초기화 할때는 empty()사용.
- Optional객체의 값 가져오기
  - get(),ofElse()사용.
```java
Optional<String> optVal = Optional.of("abc");
String str1 = optVal.get(); //optVal에 저장된 값을 반환. null이면 예외 발생
String str2 = optVal.orElse(""); //optVal에 저장된 값이 null일 때는, ""를 반환
```
- Optional객체에도 filter(), map(), flatMap()을 사용할 수 있다.
- isPresent()는 Optional객체의 값이 null이면 false를, 아니면 true를 반환한다.
- OptionalInt, OptionalLong, OptionalDouble

## 5.스트림의 최종연산
- 최종연산은 스트림의 요소를 소모. 한번 만 수행가능.
- forEach()
- 조건 검사:allMatch(), anyMatch(), noneMatch(), findFirst(), findAny()
- 통계:count(), sum(), average(), max(), min()
- reduce()
  - 스트림의 요소를 줄여가면서 연산을 수행.
  - 모든 요소를 소모하게 되면 그 결과를 반환.
  - 초기값(identity), 연산(Binary Operator)으로 스트림의 요소를 줄인다.

## 6.collect()
