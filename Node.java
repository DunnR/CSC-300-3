
public class Node 
{
	private Person payload;
	private Node nextNode;
	
	public Node(Person payload)
	{
		this.payload = payload;
		this.nextNode = null;
	}
	
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	public Person getPayload() {
		return payload;
	}
	
	
}

