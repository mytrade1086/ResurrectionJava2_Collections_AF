package collectionsPrac;

import javax.xml.transform.sax.SAXSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.jar.JarOutputStream;

//ArrayList is not thread safe

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>(); //Empty array list with 10 intial capacity
        System.out.println("Sie of list is " + al.size());//0
        System.out.println("Is arraylist empty:" + al.isEmpty());//true
        System.out.println("Adding elemtnt" + al.add("sumit"));//add sumit at index 0
        System.out.println("Sie of list is " + al.size());//1
        al.add("sumit");//sumit at 1

        System.out.println(al); //[sumit, sumit]
        System.out.println(al.remove("sumit")); //true //returns boolean true if value is found and false if not found
        //note that only removes first occurence
        System.out.println(al); //[sumit]
        System.out.println(al.remove("hulk")); //false
        al.add(0, "NehaD");
        al.add(0, "Nehap");

        System.out.println("Shifts Original element downward " + al); //hence not good for middle insertions
        //Shifts Original element downward [Nehap, NehaD, sumit]

        System.out.println("Will return item originally present at index 2 " + al.set(2, "sagar"));//sumit
        //returns element which was previously present at this position
        // System.out.println("Will return item originally present at index 2 "+al.set(3,"sagar")); //java.lang.IndexOutOfBoundsException: Index: 3, Size: 3
        //set works with existing indexes only

        System.out.println(al);//[Nehap, NehaD, sagar]
        System.out.println(al.subList(0, 3));//0 1 2     i.e  inclusive,exclusive [Nehap, NehaD, sagar]

        ArrayList<String> demoClone = (ArrayList<String>) al.clone();
        System.out.println(demoClone);//[Nehap, NehaD, sagar]

        demoClone.set(0, "DNEHA");
        System.out.println("From demoClone " + demoClone);//From demoClone [DNEHA, NehaD, sagar]
        System.out.println("From al " + al);//From al [Nehap, NehaD, sagar]
        System.out.println(al.add("sumit"));//true
        System.out.println("From al " + al);//From al [Nehap, NehaD, sagar, sumit]
        System.out.println("From demoClone " + demoClone);//From demoClone [DNEHA, NehaD, sagar]


        System.out.println(al.get(0));
        System.out.println(al.contains("sumit"));//true
        System.out.println(al.contains("df"));//false


       /*Object [] strAr= (String[]) al.toArray();
       //java.lang.ClassCastException: [Ljava.lang.Object; cannot be cast to [Ljava.lang.String;
       for(Object o :strAr){
           System.out.println((String)o);
       }*/


        System.out.println(al.indexOf("sumit")); //first occurence 3
        al.add("sumit");
        System.out.println(al.lastIndexOf("sumit"));//4


        //Iterating
        Iterator<String> ital = al.iterator();
        while (ital.hasNext()) {
            System.out.println(ital.next());
//            Nehap
//                    NehaD
//            sagar
//                    sumit
//            sumit
        }


        //2 Lambda for each
        al.forEach(n -> System.out.println("fromforeach" + n));

        //3 foreachremaining
        Iterator<String> sl = al.iterator();
        sl.forEachRemaining(s -> System.out.println("from foreachremaining" + s));

        //for loop

        for (int i = 0; i < al.size(); i++) {

            System.out.println("From regular for" + al.get(i));
        }

        //for each loop

        for (String s : al) {
            System.out.println("from for each regular one" + s);
        }


        //listIterator

        ListIterator<String> sl2 = al.listIterator(al.size());
        while (sl2.hasPrevious()) {
            String str = sl2.previous();
            System.out.println("from list iterator " + str);
        }


    }
}
