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
  
