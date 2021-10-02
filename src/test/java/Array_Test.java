import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Array_Test {
	private Array Object;
	
	@Before
	public void setUp() throws Exception 
	{
		
		Object=new Array();
	}
	@Test
	public void test_0() 
	{
		Object.insert(5, 6);
		Object.insert(6, 6);
		Object.insert(7, 7);
		Object.insert(8, 9);
		assertEquals(5,Object.array[6]);
		assertEquals(6,Object.array[6]);
		assertEquals(7,Object.array[7]);
		assertEquals(8,Object.array[9]);
	
	}
	
	@Test
	public void test_1() 
	{
		Object.insert(5, -6);
	
		assertEquals(5,Object.array[-6]);

	}
	@Test
	public void test_2() 
	{
		Object.insert(6, -8);
		assertEquals(6,Object.array[-8]);
	
	}
	@Test
	public void test_3() 
	{
		Object.insert(7, 100);
		assertEquals(7,Object.array[100]);
	
	}
	@Test
	public void deletion_test() 
	{
		Object.insert(5, 6);
		Object.delete(6);
		assertFalse(5!=Object.array[6]);
	
	}
	
	@Test
	public void BubbleSortTest() 
	{
		Object.insert(9, 0);
		Object.insert(6, 1);
		Object.insert(7, 2);
		Object.insert(8, 3);
		Object.insert(10,4);
		Object.insert(12, 5);
		Object.insert(23, 6);
		Object.insert(466, 7);
		Object.insert(657, 8);
		Object.insert(-4, 9);
		Object.insert(-5, 10);
        Object.bubbleSort();
        
        for(int i=0 ; i<10 ; i++)
        {
        	for(int j=i+1 ; j<10 ; j++)
        	{
        		if(!(Object.array[i]<Object.array[j]))
        		{
        		 fail("The sort has failed");	
        		}
        		
        	}
        }
	}
	
	
	@Test
	public void LinearSearchTest() 
	{
		Object.insert(9, 0);
		Object.insert(6, 1);
		Object.insert(7, 2);
		Object.insert(8, 3);
		Object.insert(10,4);
		Object.insert(12, 5);
		Object.insert(23, 6);
		Object.insert(466, 7);
		Object.insert(657, 8);
		Object.insert(-4, 9);
		Object.insert(-5, 10);
        Object.bubbleSort();
       
        assertFalse(Object.linearSearch(90));
        assertFalse(Object.linearSearch(-45));
        assertFalse(Object.linearSearch(-88));
        assertFalse(!(Object.linearSearch(6)));
        assertFalse(!(Object.linearSearch(7)));
        assertFalse(!(Object.linearSearch(-4)));
	}
	
	
	@Test
	public void BinarySearchTest() 
	{
		Object.insert(9, 0);
		Object.insert(6, 1);
		Object.insert(7, 2);
		Object.insert(8, 3);
		Object.insert(10,4);
		Object.insert(12, 5);
		Object.insert(23, 6);
		Object.insert(466, 7);
		Object.insert(657, 8);
		Object.insert(-4, 9);
		Object.insert(-5, 10);
        Object.bubbleSort();
       
        assertFalse(Object.binarySearch(90,0,Object.size));
        assertFalse(Object.binarySearch(80,0,Object.size));
        assertFalse(Object.binarySearch(-46,0,Object.size));
        assertFalse(!(Object.binarySearch(-5,0,Object.size)));
        assertFalse(!(Object.binarySearch(-4,0,Object.size)));
	}
	

	
}
