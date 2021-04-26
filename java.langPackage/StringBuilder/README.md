# StringBuilder
- StringBuffer는 동기화 되어 있다. 멀티 쓰레드에 안전(thread-safe)->동기화는 데이터 보호
- 멀티 쓰레드 프로그램이 아닌 경우, 동기화는 불필요한 성능저하(StringBuffer대신 StringBuilder를 사용하면 성능 향상)
- 싱글 쓰레드 프로그램인경우 StringBuilder를 쓰는게 좋다.(StringBuffer와는 동기화 여부에 있어서 갈린다.)
### 멀티쓰레드, 싱글쓰레드
- 멀티쓰레드
  - 한번에 n개 작업(파일다운로드+채팅 등)
- 싱글쓰레드
  - 한번에 1개 작업
