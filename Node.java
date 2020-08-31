package LinkedList;

public class Node {
	
	int data;
	Node next;
	
	
	Node(int d, Node n){
		
		data = d;
		next = n;
	}
	
	public void setLink(Node n) {
		next = n;
	}
	
	public void setData(int d) {
		data = d;
	}

	public Node getLink() {
		return next;
	}
	
	public int getData() {
		return data;
	}
	
	
}
