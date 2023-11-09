import java.io.*;
import java.util.*;
public class Queue
{
    private LinkedList q; //Declare the object of the q using linkedlist

    //constructor without parameter
    public Queue(){
        q = new LinkedList();
    }// end of the constructor

    //method to insert an object to a queue
    public void enqueue(Object item)
    {
        q.addLast(item);
    }//end of enqueue

    //method to remove an object from a queue
    public Object dequeue()
    {
        if (!empty())
        {
            return q.removeFirst(); //remov ethe first element/front
        }
        else
            System.out.println("Queue is empty!");
        return 0;
    }//end of dequeue

    //method to test whether the queue is empty or not
    public boolean empty() 
    {
        return (q.size() == 0);
    }//end of empty

    public int size()
    {
        return q.size();
    }

    //return the element at the front without removing it
    public Object front()
    {
        if(!empty())
            return q.getFirst();
        else
            System.out.println("Queue is empty");
        return 0;
    }
}//end of MyQueue
