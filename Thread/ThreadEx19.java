
public class ThreadEx19 {
	static long startTime = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx19_1 th1 = new ThreadEx19_1();
		ThreadEx19_2 th2 = new ThreadEx19_2();
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();
		try {
			th1.join();//main�����尡 th1�� �۾��� ������ ���� ��ٸ���.
			th2.join();//main�����尡 th2�� �۾��� ������ ���� ��ٸ���.
		}catch(InterruptedException e) {}
		
		System.out.println("�ҿ�ð�: " + (System.currentTimeMillis()
				- ThreadEx19.startTime));
	}

}

class ThreadEx19_1 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print(new String("-"));
		}
	}
}

class ThreadEx19_2 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print(new String("|"));
		}
	}
}
