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