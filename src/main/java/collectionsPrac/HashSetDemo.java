package collectionsPrac;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        //public class HashSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, Serializable
        //Does not maintain insertion order
        //Elements inserted based on hashcode
        //Good for searching
        //Non Synchronized


        Set<String> hs = new HashSet<String>();
        //add returns boolean true if inserted element not preset. Else false
        System.out.println(hs.add("A"));//true
        hs.add("B");
        hs.add("C");
        System.out.println(hs.add("A"));//false
        System.out.println(hs);

        //Iterating with foreach
        hs.forEach(s -> System.out.println(s));

        //Iterating with Iterator
        Iterator<String> si = hs.iterator();
        while (si.hasNext()) {
            System.out.println("for each loop " + si.next());
        }
        //
        //WIP
        si.forEachRemaining(s -> System.out.println(s));


        //public boolean removeIf(java.util.function.Predicate<? super E> filter)
        hs.removeIf(s -> s.contains("C"));
        System.out.println(hs);//[A, B]

        //Java HashSet from another Collection
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");

        HashSet<String> set = new HashSet(list);
        set.add("Gaurav");
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
//        Vijay
//                Ravi
//        Gaurav
//                Ajay


    }
}
