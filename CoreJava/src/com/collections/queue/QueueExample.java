package com.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
public static void main(String[] args) {
       Queue q=new LinkedList();
       q.add("hlo");
       q.add(67);
       q.add("java");
       q.offer(67);
       q.offer("core java"); 
       
       System.out.println(q);
       System.out.println();
       
       //GET HEAD ELEMENT
       System.out.println("peek method="+q.peek());
       System.out.println();
      
       Queue q2=new LinkedList();
       
//RETURNSS HEAD ELEMENT RETURNS EMPTY WHEN NO ELEMENTS ADDED
       System.out.println("peek method="+q2.peek());
       System.out.println();

       System.out.println("poll method="+q2.poll());
       System.out.println();
       
       //RETURNS HEAD ELEMENT
       System.out.println("element = "+q.element());
       System.out.println();
       System.out.println("remove method ="+q.remove());
       
       //NO SUCH ELEMENTS RETURNS NO SUCH ELEMNT EXCEPTION
      // System.out.println("elemnts in q2 ="+q2.element());
        System.out.println(q2.remove());
      }}
