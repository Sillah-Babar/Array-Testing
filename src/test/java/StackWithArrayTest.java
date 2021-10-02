import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import StackWithArray.Stack;

public class StackWithArrayTest {

	private Stack Object;
	@Before
	public void setUp() throws Exception {
	Object=new Stack();
	}

	@Test
	public void test_1() {
	 Object.push(0);
	 Object.push(1);
	 Object.push(2);
	 Object.push(3);
	 Object.push(4);
	 Object.push(5);
	 
	 assertEquals(5,Object.pop());
	 assertEquals(4,Object.pop());
	 assertEquals(3,Object.pop());
	 assertEquals(2,Object.pop());
	 assertEquals(1,Object.pop());
	 assertEquals(0,Object.pop());
	}
	
	@Test
	public void test_2() {
	 Object.push(-5);
	 Object.push(-5);
	 Object.push(2);
	 Object.push(3);
	 Object.push(4);
	 Object.push(6);
	 
	 assertEquals(6,Object.pop());
	 assertEquals(4,Object.pop());
	 assertEquals(3,Object.pop());
	 assertEquals(2,Object.pop());
	 assertEquals(-5,Object.pop());
	 assertEquals(-5,Object.pop());
	}
	
	@Test
	public void SizeTest() {
	 for(int i=0 ; i<500 ;i++)
	 {
		 Object.push(i);
	 }

	 assertEquals(499,Object.pop());
	}

}
