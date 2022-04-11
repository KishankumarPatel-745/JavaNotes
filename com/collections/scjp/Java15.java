package com.collections.scjp;

import java.util.PriorityQueue;

public class Java15 {
    public static void main(String[] args) {
        PriorityQueue q=new PriorityQueue();
        System.out.println(q.peek());
        System.out.println(q.element());//RTE NoSuchElementException
        for (int i = 0; i < 11; i++) {
            q.offer(i);
        }
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        /*
        Queue ----

        1.5 Version enhancement Queue interface.

        It is the child interface of collection(I)

        collection(I)<-- Queue(I)<--

        PriorityQueue 
        BlockingQueue<--PriorityBlockingQueue
        <--LinkedBlockingQueue.

        If we want to represent a group of individual object, prior to processing, then we should go for Queue.
        for example, before sending SMS message, all mobile numbers in some dataStructure, in which order we added mobile number in same order only message should be delivered for this first in first out requirement Queue is the best choice.

        Usually Queue follows first in first out order but based on our requirement we can implement our own priority order also.
        eg.
        PriorityQueue

        From 1.5 version, LinkedList class also implements Queue interface.
        LinkedList based implementation of Queue always follow First In First out order.

        Queue interface Specific methods.

        boolean offer(Object o);
        to add an Object into the Queue.

        Object peek();
        to return head element of the queue.If the queue is empty then this method returns null.

        Object element()
        to return head element of the queue. If the queue is empty then this methods raises :- RTE NoSuchElementException.

        Object poll()
        to remove and return head element of the Queue.If the queue is empty then this method returns null.

        Object remove()
        to remove and return head element of the Queue. If queue is empty then this method raises RTE:
        NoSuchElementException.

        PriorityQueue.

        IF we want to represent a group of individual object, prior to processing according to some priority then we should go for priorityQueue.

        The priority can be either Default Natural sorting order or customized sorting order defined by Comparator.

        Insertation order is not preserved and it is based on some priority.

        Duplicates objects are not allowed.

        If we are depanding on default natural sorting order then compulsory the object should be homogeneous and comparable otherwise we will get RTE saying ClassCastException.

        If we are defining our own sorting by Comparator then Objects need not be Homogeneous and Comparable.

        null is not allowed even as a first element also.

        Constructor..

        PriorityQueue q=new PriorityQueue();

        Creates an empty PriorityQueue with the default initial capacity 11 and all objects will be inserted according to default natural sorting order.

        PriorityQueue q=new PriorityQueue(int initialCapacity);


        PriorityQueue q=new PriorityQueue(int initialCapacity,Comparator c);

        PriorityQueue q=new PriorityQueue(SortedSet s);

        PriorityQueue q=new PriorityQueue(Collection c);


        NOTE>
        Some platform won't provide proper support Thread Priority and PriorityQueue.

        
        */
    }
}
