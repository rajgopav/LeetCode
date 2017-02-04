
public class StacksUsingArray<T> {
	
	private int top = -1;
	private T[] arr = null;
	private int capacity;
	private int size = 0;
	
	@SuppressWarnings("unchecked")
	public StacksUsingArray(int capacity) {
		this.capacity = capacity;
		this.arr = (T[])new Object[capacity];
	}
	
	public void push(T data) {
		if(!isFull())
			return;
		this.size++;
		this.arr[++top] = data;
	}
	
	public boolean isFull() {
		if(this.size == this.capacity) {
			return false;
		}
		return true;
	}
	
	public T pop() {
		if(this.size == 0)
			return null;
		
		this.size--;
		T result = arr[top];
		this.arr[top] = null;
		this.top--;
		return result;
	}
	
	public String toString() {
		if(this.size==0){
			return null;
		}
 
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<this.size; i++){
			sb.append(this.arr[i] + ", ");
		}
 
		sb.setLength(sb.length()-2);
		return sb.toString();	
	}
	
	public static void main(String[] args) {
		StacksUsingArray<String> stack = new StacksUsingArray<String>(11);
		stack.push("hello");
		stack.push("world");
 
		System.out.println(stack);
 
		stack.pop();
		System.out.println(stack);
 
		stack.pop();
		System.out.println(stack);

	}
}
