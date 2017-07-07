package StackDemo;

import java.util.Stack;

public class StackPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here by Creating stack
		Stack<String> st = new Stack<String>();
        
		// Push operation 
		// Stack follows Last-In-First out approach
		st.push("Pankaj");  // Inserting element in the stack at the bottom 
		st.push("Rahul"); // Inserting element in the stack at second position
		st.push("Aswhini"); // Inserting element in the stack at third position
		st.push("Amit");  // Inserting element at the top 
		System.out.println("Stack after PUSH operation: " + st);
		
		// Here by trying to check the top element and printing it
        System.out.println("\nElement at the top is: " + st.peek()); /**Peek operation which returns  
                                                                         the value of the top  
		                                                              **/
        //Pop operations
        
		st.pop(); //Deleting element from the top 
		st.pop(); //Deleting element from second position
		st.pop(); //Deleting element from third position
		st.pop(); //Deleting element from the bottom 
		System.out.println("\nStack is empty" + st); 
		/**Printing empty stack after deleting all elements */
		                                             
		

	}

	}

