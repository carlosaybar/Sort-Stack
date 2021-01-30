/*
 * The following algorithm takes in an unsorted stack and return it 
 * sorted so that the smallest items are at the top
 * @author Carlos Aybar De Los Santos
 * lasts modified: 29 January 2021
 * Class: Intro to Computational Theory
 */
import java.util.Stack;

public class sort_stack {
    static Stack<Integer> stack = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();
    
    /**
     * the main method calls the getStack and sort methods
     * it then prints the sorted stack
     * @param args
     */
    public static void main(String[] args) {


    	getStack();
        sort();
        System.out.print("the sorted stack is: " );
        while(!stack2.isEmpty())
        {
        	System.out.print(stack2.pop()+ " ");
        }


        


    }
    
    /**
     * In this method we pass the values into the stack
     * using the function push().
     */
    public static void getStack() 
    {

    	//pasing the values into the stack
        stack.push(8);
        stack.push(2);
        stack.push(7);
        stack.push(5);
        stack.push(4);
        	
    }
    /**
     * The sort() method access the values in the stack as well
     * as the values in the temporary stack if it contains any. I first declared an integer
     * called current to store the values in the first stack individually by doing stack.pop()
     * everytime we enter the while loop. 
     */
    public static void sort()
    {




        while (!stack.isEmpty())
        {
        	int current = stack.pop(); //the current number will be set to the top of the stack everytime this loop is executed
        	
        	//while the temporary stack is not empty and the first value is greater than the top value from the first stack
        	//we store the value in the first stack, otherwise we store it in the temporary stack
        	//at the end, the smallest number should be at the top of the stack. and every other value should be sorted
            while(!stack2.isEmpty() && stack2.peek() > current)  
            {
            	stack.push(stack2.pop()); 
            }
            stack2.push(current); 

        }
 
 

    }
}