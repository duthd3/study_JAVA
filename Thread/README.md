# Thread
## 1.프로세스와 쓰레드
- 프로세스란 간단히 말해서 '실행 중인 프로그램' 이다. 프로그램을 실행하면 OS로부터 실행에 필요한 자원(메모리)을 할당받아 프로세스가 된다.
- 프로세스:데이터+메모리+쓰레드
- 프로세스의 자원을 이용해서 실제로 작업을 수행하는 것이 쓰레드이다.
- 모든 프로세스에는 최소한 하나 이상의 쓰레드가 존재하며, 둘 이상의 쓰레드를 가진 프로세스를 '멀티쓰레드 프로세스'라고 한다.
```java
멀티쓰레딩의 장점
- CPU의 사용률을 향상시킨다.
- 자원을 보다 효율적으로 사용할 수 있다.
- 사용자에 대한 응답성이 향상된다.
- 작업이 분리되어 코드가 간결해진다.
```

```java
멀티쓰레딩의 단점
- 동기화
- 교착상태
```

## 2.쓰레드의 구현과 실행
- Thread클래스를 상속받는 방법
- Runnable인터페이스를 구현하는 방법(일반적)
```java
1. Thread클래스를 상속
class MyThread extends Thread{
    public void run(){...};
}

2. Runnable인터페이스를 구현
class MyThread implements Runnable{
    public void run(){...};
}
```
- 쓰레드의 실행 start()
```java
t1.start();//쓰레드 t1을 실행시킨다.
t2.start();//쓰레드 t2를 실행시킨다.
```
- 한 번 실행이 종료된 쓰레드는 다시 실행할 수 없다.
- 하나의 쓰레드에 대해 start()가 한 번만 호출될 수 있다.

## 3.start()와 run()
- main메서드에서 run()을 호출하는 것은 생성된 쓰레드를 실행시키는 것이 아니라 단순히 메서드를 호출하는 것이다.
- start()는 새로운 쓰레드가 작업을 실행하는데 필요한 호출스택을 생성한 다음에 run()을 호출해서, 생성된 호출스택에 run()이 첫번째로 올라가게 한다.
- 스케쥴러는 실행대기중인 쓰레드들의 우선순위를 고려하여 실행순서와 실행시간을 결정한다.
- ### main쓰레드
  - main메서드의 작업을 수행하는것도 쓰레드이며, main쓰레드 라고 한다.
  - 실행 중인 사용자 쓰레드가 하나도 없을 때 프로그램은 종료된다.
  - 쓰레드는 사용자 쓰레드, 데몬 쓰레드 두 종류가 있다.

## 4.싱글쓰레드와 멀티쓰레드
- 하나의 쓰레드로 두 작업을 처리하는 경우는 한 작업을 마친 후에 다른 작업을 시작하지만, 
- 두 개의 쓰레드로 작업 하는 경유에는 짧은 시간동안 2개의 쓰레드가 번갈아 가면서 작업을 수행해서 동시에 두 작업이 처리되는 것과 같이 느끼게 한다.

## 5.쓰레드의 우선순위
- 쓰레드는 우선순위라는 속성(멤버변수)를 갖고있다. 이 우선순위의 값에 따라 쓰레드가 얻는 실행시간이 달라진다.
- 쓰레드의 우선순위 지정하기(기본우선 순위=5)
```java
void setPriority(int newPriority)
int getPriority()
```
- 쓰레드의 우선순위는 쓰레드를 생성한 쓰레드로부터 상속받는다.
- OS의 스케쥴러에 종속적이라서 어느 정도 예츠만 가능한 정도이다.

## 6.쓰레드 그룹
- 쓰레드 그룹은 서로 관련된 쓰레드를 그룹으로 다루기 위한 것이다.
- 쓰레드를 쓰레드 그룹에 포함시키려면 Thread의 생성자를 이용해야 한다.
```java
Thread(ThreadGroup group, String name)
Thread(ThreadGroup group, Runnable target)
Thread(ThreadGroup group, Runnable target, String name)
Thread(ThreadGroup group, Runnable target, String name, long stackSize)
```
- 모든 쓰레드는 반드시 쓰레드 그룹에 포함되어 있어야 한다.
- 쓰레드 그룹을 지정하지 않은 쓰레드는 기본적으로 자신을 생성한 쓰레드와 같은 쓰레드 그룹에 속하게 된다.
```java
ThreadGroup getThreadGroup() // 쓰레드 자신이 속한 쓰레드 그룹을 반환한다.
void uncaughtException(Thread t, Throwable e) //쓰레드 그룹의 쓰레드가 처리되지 않은 예외에 의해 실행이 종료되었을때, JVM에 의해서 이메서드가 자동적으로 호출된다.
```

## 7.데몬 쓰레드
- 일반쓰레드의 작업을 돋는 보조적인 역할을 수행하는 쓰레드 이다.
- 일반쓰레드가 모두 종료되고 나면 데몬 쓰레드도 종료된다.
- 무한루프와 조건문을 이용해서 실행 후 대기하고 있다가 특정 조건이 만족 되면 작업을 수행하고 다시 대기하도록 한다.
- 쓰레드를 생성한 다음 실행하기 전에 setDaemon(true)를 호출한다.

## 8.쓰레드의 실행제어
|상태|설명|
|--|--|
|NEW|쓰레드가 생성되고 아직 start()가 호출되지 않은 상태|
|RUNNABLE|실행중 또는 실행 가능한 상태|
|BLOCKED|동기화블럭에 의해서 일시정지된 상태|
|WAITING, TIMED_WAITNG|쓰레드의 작업이 종료되지는 않았지만 실행가능하지 않은 일시정지 상태|
|TERMINATED|쓰레드의 작업이 종료된 상태|

- sleep(long millis) : 일정시간동안 쓰레드를 멈추게 한다.
```java
static void sleep(long millis)
static void sleep(long millis, int nanos)
```
  - sleep()에 의해 일시정지 상태가 된 쓰레드는 지정된 시간이 다 되거나 interrupt()가 호출되면 잠에서 깨어나 실행대기 상태가 된다.
  - InterruptedException예외가 발생하기 때문에 항상 try-catch문으로 예외를 처리해줘야 한다.

- interrupt(), interrupted() : 쓰레드의 작업을 취소한다.
```java
void interrupt() - 쓰레드의 interrupted상태를 false에서 true로 변경
boolean isInterrupted() - 쓰레드의  interrupted상태를 반환
static boolean interrupted() - 현재 쓰레드의 interrupted상태를 반환 후, false로 변경
```

- suspend(), resume(), stop()
  - suspend()는 sleep()처럼 쓰레드를 멈추게 한다.(resume()을 호출해야 다시 실행대기 상태가 된다.)
  - stop()은 호출되는 즉시 쓰레드가 종료된다.
  - suspend()와 stop()은 교착상태를 일으키기 쉽게 작성되어있어 사용이 권장되지 않는다.(deprecated)
  
- yield():다른 쓰레드에게 양보한다.
  - yield()는 쓰레드 자신에게 주어진 실행시간을 다음 차례의 쓰레드에게 양보한다.
  
- join():다른 쓰레드의 작업을 기다린다. 
```java
void join()
void join(long millis)
void join(long millis, int nanos)
```

- 9.쓰레드의 동기화
- 한 쓰레드가 진행중인 작업을 다른 쓰레드가 간섭하지 못하도록 막는 것을 '쓰레드의 동기화' 라고 한다.
- 1. synchronized를 이용한 동기화(임계영역을 설정)
  ```java
  1.메서드 전체를 임계영역으로 지정
      public synchronized void calcSum(){
      }
  2. 특정한 영역을 임계영역으로 지정
      synchronized(객체의 참조변수) {
      }
  ```    
- 2. wait()와 notify()
  - wait():실행중이던 쓰레드가 lock을 반납(대기실 입장)
  - notify():대기실에 있던 모든 쓰레드 중에서 임의의 쓰레드만 lock을 다시 얻어 작업진행(lock은 오직 하나의 쓰레드만 얻을 수 있다.)
  ```java
  wait(), notify(), notifyAll()
  - Object에 정의되어 있다.
  - 동기화 블록내에서만 사용할 수 있다.
  - 보다 효율적인 동기화를 가능하게 한다.
  ```
