import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Array_Insertion_Test {
	
	private ArrayInsertion Object;
	private int array[]= new int[10];
	private int size=10;
	
	@Before
	public void setUp() throws Exception 
	{
     Object=new ArrayInsertion();
     array[0]=5;
     array[1]=6;
     array[2]=7;
     array[3]=8;
     array[4]=9;
	}
	@Test
	public void test() {
		Object.insert(array,56,1);
		assertEquals(56,array[1]);
	}
	
	@Test
	public void array_index_out_of_bound() {

		Object.insert(array,88,-1);
	    assertEquals(array[-1],88);
	}
	
	@Test
	public void Size_test() {

		Object.insert(array,88,size);
		assertEquals(88,array[size]);
	}
	@Test
	public void Full_array_test() {

		Object.insert(array,8,5);
		Object.insert(array,8,6);
		Object.insert(array,8,7);
		Object.insert(array,8,8);
		Object.insert(array,8,9);
		
		Object.insert(array,37,9);
		assertEquals(37,array[9]);
	}

}
