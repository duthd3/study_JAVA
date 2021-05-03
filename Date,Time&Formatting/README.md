# 날짜와 시간(Date,Time)
## 1.Calendar와 Date
  - ### Calendar와 GregorianCalendar
    - Calendar는 추상클래스이기 때문에 직접 객체를 생성할 수 없다. 때문에 메서드를 통해서 완전히 구현된 클래스의 인스턴스를 얻어야 한다.
    ```java
    Calendar cal = Calendar.getInstance();
    ```
   - ### Date와 Calendar간의 변환 
- Date는 잘짜와 시간을 다룰 목적으로 JDK1.0부터 제공되언 클래스이다.
- Calendar가 새로 추가되면서 Date는 대부분의 메서드가 'deprecated'되었으므로 잘 사용되지 않는다.
  ```java
  1. Calendar를 Date로 변환
    Calendar cal = Calendar.getInstance();
    Date d = new Date(cal.getTimeInMillis());
    
  2. Date를 Calendar로 변환
    Date d = new Date();
    Calendar cal = Calendar.getInstance();
    cal.setTime(d);
```
- add(int field, int amount)를 이용하면 지정한 필드의 값을 원하는 만큼 증가 또는 감소 시킬 수 있다.(다른 필드에 영향을 미친다.)
- roll(int field, int amount)를 이용하면 지정한 필드의 값을 원하는 만큼 증가 또는 감소 시킬 수 있다.(다른 필드에 영향을 미치지 않는다.)
