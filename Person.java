import java.util.Random;


public class Person 
{
	private String name;
	private int walletBalance;
	private static Random r = new Random();
	private Node front;
	private Node back;
	private int size = 0;
	
	public Person(String name)
	{
		this.name = name;
		this.walletBalance = Person.r.nextInt(10);
	}
	
	public void display()
	{
		System.out.println("Hi, my name is: " + this.name + " and I have: $" + this.walletBalance + " on me!");
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
		while(this.front != null)
		{
		this.front = n.getNextNode();
		if(this.front == null)
		{
			this.back = null;
		}
		}
		this.size--;
		return n.getPayload();
	}
}
