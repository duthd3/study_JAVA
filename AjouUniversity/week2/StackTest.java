class Stack{
	private static final int MAX = 10;
	private static int top = 0;
	private static int[] s = new int[MAX];
	
	
	public static int pop() {
		if(top==0) {
			System.out.println("Empty!");
			return -1;
		}
		else
		{
			top--;
			return s[top];
		}
	}
	
	public static void push(int x)
	{
		if(top==MAX) {
			System.out.println("Full!");
			System.exit(-1);
		}
		else {
			s[top]=x;
			top++;
			return;
		}
	}
}

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack.push(1);
		Stack.push(2);
		Stack.push(3);
		System.out.println(Stack.pop());
		System.out.println(Stack.pop());
		System.out.println(Stack.pop());
	}

}
