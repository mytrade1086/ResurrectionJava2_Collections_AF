package collectionsPrac;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        al.add("Neha");
        al.add("Sachin");
        al.add("Amit");
        al.add("Pooja");
        ListIterator<String> li = (ListIterator<String>) al.listIterator();

        while (li.hasNext()) {
            System.out.println("index is :" + li.nextIndex() + " Value is :" + li.next());
        }
//        index is :0 Value is :Neha
//        index is :1 Value is :Sachin
//        index is :2 Value is :Amit
//        index is :3 Value is :Pooja

        //Iterating fwd direction
        ListIterator<String> li2 = (ListIterator<String>) al.listIterator();
        while (li2.hasNext()) {
            if (li2.next().equals("Pooja")) {
                li2.set("PoojaReplaced");//replace Pooja with PoojaReplaced
            }
        }
        System.out.println(al);//[Neha, Sachin, Amit, PoojaReplaced]

       //Iterating in Backward Direction
        while (li2.hasPrevious()) {
            System.out.println("PreviousIndex is:" + li2.previousIndex() + " value is: " + li2.previous());
        }
//        PreviousIndex is:3 value is: PoojaReplaced
//        PreviousIndex is:2 value is: Amit
//        PreviousIndex is:1 value is: Sachin
//        PreviousIndex is:0 value is: Neha


//        while (li2.hasPrevious()) {
//            li2.add("newElement");
//        }
//
//        System.out.println(" jj"+al);


    }

    //adding element
    //Iterating in Backward Direction



}
