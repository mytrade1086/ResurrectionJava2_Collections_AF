package collectionsPrac;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>(); //Empty array list with 10 intial capacity
        System.out.println("Sie of list is "+al.size());//0
        System.out.println("Is arraylist empty:"+al.isEmpty());//true
        System.out.println("Adding elemtnt"+al.add("sumit"));//add sumit at index 0
        System.out.println("Sie of list is "+al.size());//1
        al.add("sumit");//sumit at 1

        System.out.println(al); //[sumit, sumit]
        System.out.println(al.remove("sumit")); //true //returns boolean true if value is found and false if not found
                                                  //note that only removes first occurence
        System.out.println(al); //[sumit]
        System.out.println(al.remove("hulk")); //false



        al.add(0,"NehaD");
        al.add(0,"Nehap");

        System.out.println("Shifts Original element downward "+al); //hence not good for middle insertions
        //Shifts Original element downward [Nehap, NehaD, sumit]
        //
        System.out.println("Will return item originally present at index 2 "+al.set(2,"sagar"));//sumit
        //returns element which was previously present at this position

       // System.out.println("Will return item originally present at index 2 "+al.set(3,"sagar")); //java.lang.IndexOutOfBoundsException: Index: 3, Size: 3
        //set works with existing indexes only

        System.out.println(al);//[Nehap, NehaD, sagar]

        System.out.println(al.subList(0,3));//0 1 2     i.e  inclusive,exclusive [Nehap, NehaD, sagar]

        al.clone()







    }
}
