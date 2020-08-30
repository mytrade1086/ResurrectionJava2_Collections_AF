package collectionsPrac;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        //Java LinkedList class uses a doubly linked list to store the elements
        //In the case of a doubly linked list, we can add or remove elements from both sides.
//        Java LinkedList class can contain duplicate elements.
//        Java LinkedList class maintains insertion order.
//        Java LinkedList class is non synchronized.
//        In Java LinkedList class, manipulation is fast because no shifting needs to occur.
//        Java LinkedList class can be used as a list, stack or queue.

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");

        System.out.println(ll);//[A, B, C, D]
        ll.addFirst("AA");
        ll.addLast("ZZ");
        System.out.println("Printing After using addFirst and addLast method" + ll);//Printing After using addFirst and addLast method[AA, A, B, C, D, ZZ]

        System.out.println(ll.getFirst());//AA gets first element. NoSuchElementException when list is empty
        System.out.println(ll.getLast());//ZZ gets  last element . NoSuchElementException when list is empty

        System.out.println(ll.element());//Retrieves, but does not remove, the head (first element) of this list.

        //Offer method returns true on success
        ll.offer("offer");//Adds element at the last
        ll.offerFirst("offerFirst");//adds element at first
        ll.offerLast("offerLast");//adds aelement at last


        System.out.println("Linkedlist post offerMethod"+ll);
        //Retrieves element but does not remove it

        System.out.println("ll.peek() returns FIRST element. It does not delete anything "+ll.peek());
        System.out.println("ll.peekFirst() returns FIRST element. It does not delete anything "+ll.peekFirst());
        System.out.println("ll.peekLast() returns LAST element. It does not delete anything "+ll.peekLast());


//ll.pop()
//        //Retrieves and removes element
//        ll.poll()// removes first element
//        ll.pollFirst()//removes first element
//        ll.pollLast()//removes last element
//
//
//                ll.removeFirst()//
//                        ll.removeFirstOccurrence()//
//                                ll.removeLastOccurrence()//
//                                        ll.removeLast()//

              // ll.push();//like addFirst
//ll.getFirst()
        //ll.getLast()
        //ll.get
    }
}
