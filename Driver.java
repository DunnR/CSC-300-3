
public class Driver 
{
	public static void main(String[] elephant)
	{
		Queue q = new Queue();
		Person[] p = new Person[100];
		
		for(int i = 0; i <= p.length - 1; i++)
		{
			p[i] = new Person("Person");
			q.enqueue(p[i]);
			q.dequeue();
		}
	
	}
}
