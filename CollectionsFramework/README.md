# 컬렉션 프레임웍(Collections Framework)
- 컬렉션 프레임웍이란, 데이터군을 저장하는 클래스들을 표준화한 설계를 뜻한다.
- javaAPI문서에서는 컬렉션 프레임웍을 데이터군을 다루고 표현하기위한 단일화된 구조라고 정의한다.

## 1.컬렉션 프레임웍의 핵심 인터페이스
![ĸó](https://user-images.githubusercontent.com/79510152/117850636-74531900-b2c0-11eb-8ed2-bdf950edef9b.png)


|인터페이스|특징|
|--|--|
|List| 순서가 있는 데이터의 집합, 데이터의 중복을 허용한다.|
|Set| 순서를 유지하지 않는 데이터의 집합, 데이터의 중복을 허용하지 않는다.|
|Map| 키(key)와 값(value)의 쌍(pair)으로 이루어진 데이터의 집합, 순서는 유지되지 않으며, 키는 중복허용, 값은 중복을 허용하지 않는다.|

- 컬렉션 프레임웍의 모든 컬렉션 클래스들은 List,Set,Map중의 하나를 구현하고 있다.

## 2.ArrayList
- ArrayList는 컬렉션 프레임웍에서 가장 많이 사용되는 컬렉션 클래스 이다.
- List인터페이스를 구현하기 때문에 데이터의 저장순서가 유지되고 중복을 허용한다.

## 3.LinkedList
- 배열의 단점
```
1.크기를 변경할 수 없다.
2.비순차적인 데이터의 추가 또는 삭제에 시간이 많이 걸린다.
```

- LinkedList는 불연속적으로 존재하는 데이터를 서로 연결(link)한 형태로 구성되어 있다.
![KakaoTalk_20210512_023026970_01](https://user-images.githubusercontent.com/79510152/117859543-19beba80-b2ca-11eb-9ac4-3540ab164b02.jpg)

- 링크드 리스트의 각 요소(node)들은 자신과 연결된 다음 요소에 대한 참조(주소값)와 데이터로 구성되어 있다.
```java
class Node{
      Node next;
      Object obj;
}
```

- 순차적으로 추가/삭제하는 경우에는 ArrayList가 LinkedList보다 빠르다.
- 중간 데이터를 추가/삭제하는 경우에는 LinkedList가 ArrayList보다 빠르다.

## 4.Stack&Queue
- 스택은 마지막에 저장한 데이터를 가장 먼저 꺼내는 LIFO구조.
  - 순차적으로 데이터를 추가하고 삭제하기 때문에 ArrayList와 같은 배열기반의 컬렉션 클래스가 적합.
- 큐는 처음에 저장한 데이터를 가장 먼저 꺼내게 되는 FIFO 구조.
  - 데이터의 추가/삭제가 쉬운 LinkedList로 구현하는 것이 적합.
- 스택은 Stack클래스로 구현, 큐는 Queue인터페이스로 정의 해놓음.

## 5.Iterator,ListIterator,Enumeration
- Iterator,ListIterator,Enumeration은 모두 컬렉션에 저장된 요소를 접근하는데 사용되는 인터페이스이다.
  - ### Iterator
    - 컬렉션에 저장된 각 요소에 접근하는 기능을 가진 Iterator인터페이스 정의.
    - Collection인터페이스에는 Iterator를 반환하는 iterator()를 정의하고 있다.
    - iterator()는 Collection인터페이스에 정의된 메서드 이므로 Collection인터페이스의 자손인 List와 Set에도 포함되어 있다.
    
    |메서드|설명|
    |--------|-------|
    |boolean hasNext()|읽어 올 요소가 남아있는지 확인한다.있으면true 없으면 false를 반환.|
    |Object next()|다음 요소를 읽어 온다. next()를 호출하기 전에 hasNext()를 호출해서 읽어올 요소가 있는지 확인하는 것이 안전.|
    
  - ### ListIterator, Enumeration
    - Enumeration:Iterator 의 구버전
    - ListIterator:Iterator에 양방향 조회기능추가(List를 구현한 경우만 사용가능)

## 6.Arrays
  - ### 배열의 복사:copyOf(), copyOfRange()
    - copyOf()는 배열전체를, copyOfRange()는 배열의 일부를 복사해서 새로운 배열을 만들어 반환한다.
    ```java
    int[] arr = {0,1,2,3,4};
    int[] arr2 = Arrays.copyOf(arr, arr.length); // arr2=[0,1,2,3,4]
    int[] arr3 = Arrays.copyOf(arr, 3); //arr3=[0,1,2]
    int[] arr4 = Arrays.copyOfRange(arr, 2, 4) // arr4=[2,3]
    int[] arr5 = Arrays.copyOfRange(arr, 0 ,7) // arr5=[0,1,2,3,4,0,0]
    ```
  
  - ### 배열 채우기:fill(), setAll()  
    - fill()은 배열의 모든 요소를 지정된 값으로 채운다. 
    - setAll()은 배열을 채우는데 사용할 함수형 인터페이스를 매개변수로 받는다.(함수형 인터페이스를 매개변수로 받던가, 람다식 지정)
    ```
    int[] arr = new int[5];
    Arrays.fill(arr, 9); //arr=[9,9,9,9,9]
    Arrays.setAll(arr, () -> (int)(Math.random()*5)+1); //arr=[1,5,2,1,1]<-random
    ```
  - ### 배열의 정렬과 검색:sort(), bianrySearch()
    - sort()는 배열을 정렬할 때.
    - binarySearch()는 저장된 요소를 검색할 때.(반드시 배열이 정렬된 상태이어야 올바른 결과를 얻는다.)

  - ### 배열의 비교와 출력:equals(), toString()
    - toString()은 배열의 모든 요소를 문자열로 출력.(일차원 배열에만 사용)
    - 2차원 배열은 deepToString() 사용.
    - equals()는 일차원 배열에 사용.
    - 2차우너 배열은 deepEquals() 사용.

  - ### 배열을 List로 변환:asList(Object...a)
    ```java
    List list = Arrays.asList(new Integer[]{1,2,3,4,5});
    List list = Arrays.asList(1,2,3,4,5);
    list.add(6); //UnsupportedOperationException 예외 발생
    - asList()가 반환한 List의 크기를 변경할 수없다.
    - 추가 또는 삭제가 불가능 하다. 저장된 내용은 변경가능하다.
  
## 7.Comparator와 Comparable
```
Comparable 기본 정렬기준을 구현하는데 사용.
Comparator 기본 정렬기준 외에 다른기준으로 정렬하고자할 때 사용.
```

## 8.HashSet (순서X,중복X)
- HashSet은 중복된 요소를 저장하지 않는다.
- HasgSet은 저장순서를 유지하지 않으므로 저장순서를 유지하고자 한다면 LinkedHashSet을 사용해야한다.


## 9.TreeSet (정렬,범위검색에 유리)
- 중복된 데이터의 저장을 허용하지 않으며 정렬된 위치에 저장하므로 저장순서를 유지하지도 않는다.
- 이진 검색 트리(binary search tree)는 부모노드에 왼쪽에는 부모노드의 값보다 작은 값의 자식노드를 오른쪽에는 큰 값의 자식노드를 저장하는 이진 트리이다.
```
이진 검색 트리(binary search tree)는
- 모든 노드는 최대 두개의 자식노드를 가질 수 있다.
- 왼쪽 자식노드의 값은 부모노드의 값보다 작고 오른쪽자식노드의 값은 부모노드의 값보다 커야한다.
- 노드의 추가 삭제에 시간이 걸린다.(순차적으로 저장하지 않으므로)
- 검색(범위검색)과 정렬에 유리하다.
- 중복된 값을 저장하지 못한다.
```
