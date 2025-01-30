package com.practiceproblem.stack_queue;
/*Problem: Design a queue using two stacks such that enqueue and dequeue operations are performed efficiently.
        Hint: Use one stack for enqueue and another stack for dequeue. Transfer elements between stacks as needed.*/

import java.util.Stack;

public class Queue_Using_Two_Stack {
       private Stack<Integer>enqueue;
       private Stack<Integer>dequeue;

    public Queue_Using_Two_Stack() {
        this.enqueue =new Stack<>();
        this.dequeue = new Stack<>();
    }

    public void enqueue(int value){
     enqueue.push(value);

    }

    public int dequeue() {
        if (dequeue.isEmpty()) {
            while (!enqueue.isEmpty()) {
                  dequeue.push(enqueue.pop());
            }
        }
        if(dequeue.isEmpty()){
            throw new RuntimeException("Queue is Empty");

        }

        return dequeue.pop();
    }
    public int peek(){
        if (dequeue.isEmpty()) {
            while (!enqueue.isEmpty()) {
                dequeue.push(enqueue.pop());
            }
        }
        if(dequeue.isEmpty()){
            throw new RuntimeException("Queue is Empty");

        }

        return dequeue.peek();
    }

    public static void main(String[] args) {
        Queue_Using_Two_Stack queue = new Queue_Using_Two_Stack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("removed element from queue : "+queue.dequeue());
        System.out.println("removed element from queue : "+queue.dequeue());
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println("removed element from queue : "+queue.dequeue());
        System.out.println("removed element from queue : "+queue.dequeue());
        System.out.println("Top element of the queue : "+queue.peek());
        queue.enqueue(6);
        System.out.println("Top element of the queue : "+queue.peek());
    }
    }






