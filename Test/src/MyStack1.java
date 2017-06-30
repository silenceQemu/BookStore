
public class MyStack1<AnyType> {

	
	private int theSize;
	private Node<AnyType> topNode;
	
	private static class Node<AnyType> {
		
		public Node(AnyType p, Node<AnyType> next) {
			data = p;
			this.next = next;
		}
		
		public AnyType data;
		public Node<AnyType> next;
	}
	
	public MyStack1() {
		clear();
	}
	
	public void clear() {
		topNode = new Node(-1, null);
		theSize = 0;
	}

	public int size() {
		return theSize;
	}
	
	public boolean isEmpty() {
		return theSize == 0;
	}
	
	public boolean push(AnyType x) {
		Node<AnyType> newNode = new Node(x, topNode);
		theSize++;
		topNode = newNode;
		return true;
	}
	
	public AnyType peek() {
		return topNode.data;
	}
	
	public AnyType pop() {
		if( isEmpty() )
			throw new RuntimeException("ø’’ª“Ï≥£");
		AnyType oldVal = topNode.data;
		theSize--;
		topNode = topNode.next;
		return oldVal;
	}
}
