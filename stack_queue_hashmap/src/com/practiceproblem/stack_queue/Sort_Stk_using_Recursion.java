package com.practiceproblem.stack_queue;

import java.util.Stack;

/*Sort a Stack Using Recursion
Problem: Given a stack, sort its elements in ascending order using recursion.
Hint: Pop elements recursively, sort the remaining stack, and insert the popped element back at the correct position.*/
public class Sort_Stk_using_Recursion {
    //method to empty the stack and call the sortedInsert method which put the element in sorted order
    public static void sortedStack(Stack<Integer>st){
        if(st.empty()){
            return;
        }
        int num = st.peek();
        st.pop();
        sortedStack(st);
        sortedInsert(st,num);
    }
    // this method compare the sort the stack
    public static void sortedInsert(Stack<Integer>st,int num){
        if(st.empty()||st.peek()<=num){
            st.push(num);
            return;
        }
        int n = st.peek();
        st.pop();
        sortedInsert(st,num);
        st.push(n);
    }
    public static void main(String[] args) {
        // intialization of stack
      Stack<Integer>stack = new Stack<>();
        // Adding the values to stack;
         stack.addElement(4);
         stack.addElement(2);
         stack.addElement(5);
         stack.addElement(3);
         stack.addElement(7);
        //printing the stack before sorting
        System.out.println("elements before sorting : "+stack);
        sortedStack(stack);
        // printing the stack after sorting
        System.out.println("elements after sorting : "+stack);



    }


}
