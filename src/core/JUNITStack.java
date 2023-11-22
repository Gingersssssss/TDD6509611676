package core;

import junit.framework.TestCase;

import java.util.Scanner;

public class JUNITStack extends TestCase {
	
	public void testCreateNewEmptyStack() {
		Stack s1 = new Stack();
		int size = s1.getSize();
		
		//check the condition by ASSERT... method
		assertEquals(1, size);
		assertTrue(s1.isEmpty());
	}
	
	public void testPushElmToTop() {
		Stack s1 = new Stack();
		
		s1.push(1);
		
		assertEquals(1, s1.top());
	}

	public void testPushDifferentElmTypeToStack() {
		Stack s1 = new Stack();
		
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		try {
			
		}
		catch(Exception e) {
			System.out.println("All elements in the stack must be of the same type.");
		}
	}
}
