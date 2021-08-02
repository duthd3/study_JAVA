# 1.자바에서의 입출력

## 1.1입출력이란?
- I/O란 입출력이다.

## 1.2스트림
- 자바에서 입출력을 수행하려면, 즉 어느 한쪽에서 다른 쪽으로 데이터를 전달하려면, 두 대상을 연결하고 데이터를 전송할 수 있는 무언가가 필요한데 이것이 스트림이다.
- 스트림이란 데이터를 운반하는데 사용되는 연결통로이다.
- 스트림은 단방향통신만 가능하기 때문에 하나의 스트림으로 입력과 출력을 동시에 처리할 수 없다.

## 1.3바이트기반 스트림-InputStream, OutputStream
|InputStream|OutputStream|
|--|--|
|abstract int read()|abstract void write(int b)|
|int read(byte[] b)|void write(byte[] b)|
|int read(byte[] b, int off, int len)|void write(byte[] b, int off, int len)|
- read()는 반드시 구현되어야하는 핵심적인 메서드 이다.

## 1.4보조 스트림
- 실제 데이터를 주고받는 스트림이 아니기 때문에 데이터를 입출력할 수 있는 기능은 없다.
- 스트림을 먼저 생성한 다음에 이를 이용해서 보조스트림을 생성해야한다.
- 버퍼를 사용한 입출력과 사용하지 않은 입출력간의 성능차이는 상당하기 때문에 대부분의 경우에 버퍼를 이용한 보조 스트림을 사용한다.

## 1.5문자기반 스트림-Reader, Writer
- 문자데이터를 입출력할 때는 바이트기반 스트림 대신 문자기반 스트림을 사용한다.
```java
InputStream -> Reader
OutputStream -> Writer
```

# 2.바이트기반 스트림

## 2.1InputStream과 OutputStream
- InputStream과 OutputStream은 모든 바이트기반의 스트림의 조상이며, 많은 메서드가 선언되어 있다.
## 2.2ByteArrayInputStream과 ByteArrayOutputStream
- 바이트배열에 데이터를 입출력 하는데 사용되는 스트림 이다.
