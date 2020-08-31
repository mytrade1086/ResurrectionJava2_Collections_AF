package collectionsPrac;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<String>  ts= new TreeSet<String>();
        //ts.add(null);// Null not allowed
        ts.add("B");
        ts.add("C");
        ts.add("AA");

        System.out.println(ts); //[AA, B, C]  Sorts in natural order
        System.out.println(ts.descendingSet());//[C, B, AA]





    }



}
