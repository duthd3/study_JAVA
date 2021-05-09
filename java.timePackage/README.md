# java.timePackage

## 1.java.time패키지의 핵심 클래스
- 날짜와 시간을 별도의 클래스로 분리.
- 시간을 표현할 때는 LocalTime클래스.
- 날짜를 표현할 때는 LocalDate클래스.
- 날짜와 시간 모두 표현할 때는 LocalDateTime클래스.
- ### Period와 Duration
  - Period = 날짜 - 날짜
  - Duration = 시간 - 시간  
- ### 객체 생성하기-now(),of()
  - now():현재 날짜와 시간을 저장하는 객체를 생성한다.
  - of():해당 필드의 값을 순서대로 지정해 주기만 하면 된다.
  ```java
  LocalDate date = LocalDate.now()  //2021-05-08
  LocalDate time = LocalTime.now() //21:54:01.875
  LocalDateTime dateTime = LocalDateTime.now() //2021-05-08T21:54:01.875
  
  LocalDate date = LocalDate.of()  //2021년05월08일
  LocalDate time = LocalTime.of() //21시54분01초
  ```
- ### Temporal과TemporalAmount
  - LocalDate, LocalTime, LocalDateTime, ZonedDateTime -> Temporal, TemporalAccessor, TemporalAdjuster 인터페이스 구현.
  - Duration, Period -> TemporalAmount 인터페이스 구현  
   
## 2.LocalDate와 LocalTime
- ### 특정 필드의 값 가져오기 - get(), getXXX()
- ### 필드의 값 변경하기 - with(), plus(), minus()
- ### 날짜와 시간의 비교 - isAfter(), isBefore(), isEqual()

## 3.Instant
  - ### Instant와 Date간의 변환
  ```java
  static Date from(Instant instant) //Instant -> Date
  Instant toInstant() // Date -> Instant
  ```
  
## 4.LocalDateTime & ZonedDateTime
```
LocalDate + LocalTime -> LocalDateTime
LoclaDateTime + 시간대 -> ZonedDateTime
```
  - ### LocalDate와 LocalTime으로 LocalDateTime만들기
  ```
  LocalDate date = LocalDate.of(2015, 12, 31);
  LocalTime time = LocalTime.of(12, 34, 56);
  
  LocalDateTime dt = LocalDateTime.of(date, time);
  LocalDateTime dt2 = date.atTime(time);
  LocalDateTime dateTime = LocalDateTime.of(2015, 12, 31, 12, 34, 56);
  LocalDateTime today = LocalDateTime.now();
  ```
  
  - ### LocalDateTime의 변환
  ```java
  LocalDateTime dt = LocalDateTime.of(2015, 12, 31, 12, 34, 56);
  LocalDate date = dt.toLocalDate(); // LocalDateTime ->LocalDate
  LocalTime time = dt.toLocalTime(); // LocalDateTime ->LocalTime
  ```
  - ### LocalDateTime으로 ZonedDateTime만들기
    - LocalDateTime에 시간대(time-zone)를 추가하면, ZonedDateTime이 된다.
    ```java
    ZoneId zid = ZoneId.of("Asia/Seoul");
    ZonedDateTime zdt = dateTime.atZone(zid);
    System.out.println(zdt);
    ```
    ```java
    ZonedDateTime zdt = LocalDate.now().atStatrtOfDay(zid);
    System.out.println(zdt);
    ```
    
  - ### ZoneOffset
    - UTC로부터 얼마만큼 떨어져 있는지를 ZoneOffSet으로 표현한다.
    - 서울은'+9'이다.->UTC보다 9시간 빠르다.

  - ### OffsetDateTime
    - 서로 다른 시간대에 존재하는 컴퓨터간의 통신에는 OffsetDateTime이 필요하다.
    ```java
    ZonedDateTime zdt = ZondedDateTime.of(date, time, zid);
    OffsetDateTime odt = OffsetDateTime.of(date, time, krOffset);
    
  - ### ZonedDateTime의 변환
    - LocalDate  ->  toLocalDate()
    - LocalTime  ->  toLocalTime()
    
## 5.TemporalAdjusters     
- 자주 쓰일만한 날짜 계산들을 대신 해주는 메서드를 정의해놓은 클래스.

## 6.Period와 Duration 
```java
날짜 - 날짜 = period
시간 - 시간 = Duration
```
  - ### between()
    - 두 날짜 간의 차이
    ```java
    LocalDate date1 = LocalDate.of(2014, 1, 1);
    LocalDate date2 = LocalDate.of(2015, 12, 31);
    
    Period pe = Period.between(date1, date2);
    ``` //Duration 마찬가지.
    
  - ###between() & until()
    - between()은 static메서드, until()은 인스턴스 메서드.
    
## 7.파싱과 포맷

