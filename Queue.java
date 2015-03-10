
public class Queue 
{
	
	private Node front;
	private Node back;
	private int size = 0;
	
	public Queue()
	{
		this.front = null;
		this.back = null;
		this.size = 0;
	}
	
	public boolean isEmpty()
	{
		return this.front == null;
	}
	
	public void enqueue(Person Payload)
	{
		Node n = new Node(Payload);
		if(this.back == null)
		{
			this.front = n;
			this.back = n;
		}
		else
		{
			back.setNextNode(n);
			this.back = back.getNextNode();
		}
		this.size++;
	}
	
	public Person dequeue()
	{
		Person p = new Person("Person");
		p.display();
		Node n = this.front;
		this.front = n.getNextNode();
		if(this.front == null)
		{
			this.back = null;
		}
		this.size--;
		return n.getPayload();
	}
	
	public void display()
	{
		
		Node n = this.front;
		if(this.front == null)
		{
			System.out.print("Empty Queue");
		}
		while(n != null)
		{
			System.out.println(n.getPayload() + " ");
			n = n.getNextNode();
		}
		System.out.println();
	}
	
}
