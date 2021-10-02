import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import QueueLinkedList.LinkedListQueue;
import QueuewithArray.Queue;


public class LinkedListQueueTest {


    private LinkedListQueue Object;
	@Before
	public void setUp() throws Exception 
	{
		Object=new LinkedListQueue();
	}

	@Test
	public void EnqueueTest1() {
		Object.enqueue(1);
		Object.enqueue(2);
		Object.enqueue(3);
		Object.enqueue(4);
		Object.enqueue(5);
		Object.enqueue(6);
		
		assertEquals(1,Object.dequeue());
		assertEquals(2,Object.dequeue());
		assertEquals(3,Object.dequeue());
		assertEquals(4,Object.dequeue());
		assertEquals(5,Object.dequeue());
		assertEquals(6,Object.dequeue());
	}
	@Test
	public void EnqueueTest2() {
		Object.enqueue(1);
		Object.enqueue(2);
		Object.enqueue(3);
		Object.enqueue(4);
		Object.enqueue(5);
		Object.enqueue(6);
		Object.enqueue(7);
		Object.enqueue(8);
		Object.enqueue(9);
		Object.enqueue(10);
		
		Object.enqueue(11);
		
		assertEquals(1,Object.dequeue());
		assertEquals(2,Object.dequeue());
		assertEquals(3,Object.dequeue());
		assertEquals(4,Object.dequeue());
		assertEquals(5,Object.dequeue());
		assertEquals(6,Object.dequeue());
		assertEquals(7,Object.dequeue());
		assertEquals(8,Object.dequeue());
		assertEquals(9,Object.dequeue());
		assertEquals(10,Object.dequeue());
		assertEquals(11,Object.dequeue());
	}
	@Test
	public void DequeueTest() {
		Object.enqueue(1);
		Object.enqueue(2);
		Object.enqueue(3);
		Object.enqueue(4);
		Object.enqueue(5);
		Object.enqueue(6);
		Object.enqueue(7);
		Object.enqueue(8);
		Object.enqueue(9);
		Object.enqueue(10);
		
	
		
		assertEquals(1,Object.dequeue());
		assertEquals(2,Object.dequeue());
		assertEquals(3,Object.dequeue());
		assertEquals(4,Object.dequeue());
		assertEquals(5,Object.dequeue());
		assertEquals(6,Object.dequeue());
		assertEquals(7,Object.dequeue());
		assertEquals(8,Object.dequeue());
		assertEquals(9,Object.dequeue());
		assertEquals(10,Object.dequeue());
		assertEquals(-1,Object.dequeue());
	}
	
	
	@Test
	public void NullTest_1() {
		Object.enqueue(1);
		Object.enqueue(2);
	
		if(Object.head==null)
	 assertFalse(Object.head==null);	
	
	}
	@Test
	public void NullTest_2() {
	 Object.enqueue(1);
	 Object.enqueue(2);	
	 Object.dequeue();
	 Object.dequeue();
	 
	 assertFalse(!(Object.head==null));
	}


}

