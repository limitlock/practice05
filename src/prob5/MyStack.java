package prob5;

public class MyStack {

	private String[] buffer;

	private int top;
	private int maxSize;
	private String[] temp;

	public MyStack(int maxSize) {
		this.maxSize = maxSize;
		buffer = new String[maxSize];
		top = -1;
	}

	public void push(String str) {

		if (top == buffer.length - 1) { // 2<
			resize(maxSize * 2);
		}
		buffer[++top] = str;

	}

	public void resize(int capacity) {
		String[] temp = new String[capacity];
		for (int i = 0; i < top; i++) {
			temp[i] = buffer[i];
		}
		buffer = temp;
	}

	public String pop() throws MyStackException {
		if (top < 0)
			throw new MyStackException();

		return buffer[top--];
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (top < 0) {
			return true;
		} else {
			return false;
		}
	}

}