package MapInterface;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        Map<String,Integer> tm=new TreeMap<String,Integer>();
        tm.put("Maths",35);
        tm.put("Physics",65);
        tm.put("English",75);
        tm.put("Algorith",99);
        System.out.println(tm);//{Algorith=99, English=75, Maths=35, Physics=65}
        //Sorted as per Key



        Map<StringBuffer,Integer> tmsb=new TreeMap<StringBuffer,Integer>();
//        tmsb.put("A",10);  //Wont allow String Buffer in tree map
//        tmsb.put("Z",10);
//        tmsb.put("C",10);








    }
}
