import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import java.util.*;

public class Array_Deletion_Test {

   private ArrayDeletion Object;
   private int array[]= {3,5,7,8,25};
   private int size;
   private int comparison[]= {3,5,7,8,25};
   
	@Before
	public void setUp() throws Exception {
	size=5;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void DeletionTest_1() 
	{
		Object.delete(array,3);
		assertEquals(array[3],25);			
	}
	@Test
	public void DeletionTest_2() 
	{
		Object.delete(array,0);
		assertEquals(array[0],5);			
	}
	@Test
	public void DeletionTest_3() 
	{
		Object.delete(array,3);
		assertEquals(array[3],25);			
	}
	@Test
	public void Array_out_of_bound_test_1() 
	{
		Object.delete(array,size);
		for(int i=0 ; i<size ; i++)
		assertEquals(array[i],comparison[i]);				
	}
	@Test
	public void Array_out_of_bound_test_2() 
	{
		Object.delete(array,-5);
		for(int i=0 ; i<size ; i++)
		assertEquals(array[i],comparison[i]);				
	}

	@Test
	public void NullArrayTest() 
	{
		int array2[]= {};
		System.out.println(array2.length);
		array2=Object.delete(array2,4);
		System.out.println("AssertFalse executed and test has passed");
		assertFalse(array2==null);
	    
	}

}
