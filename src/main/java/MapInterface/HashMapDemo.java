package MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> hm=new HashMap<>();
        System.out.println(hm.isEmpty());//true
        System.out.println(hm.put("Sumit",1) );//returns null as sumit never had mapping
        System.out.println(hm.put("Sumit",11) );// ***returns old mapping 1 i this case
        System.out.println(hm.put("Amit",2) );// null as first time

        System.out.println(hm.get("Sumit")); //11
        System.out.println(hm.isEmpty());//false
        System.out.println("Size is "+hm.size());//1
        Set<String> setKeys=hm.keySet();

        for(String s:setKeys){
           System.out.println("Printing values with keySet() "+hm.get(s));
//            Printing values with keySet() 2
//            Printing values with keySet() 11
       }

        Set<Map.Entry<String,Integer>> se=hm.entrySet();
        for(Map.Entry<String,Integer> see:se){
            System.out.println("Used entrySet() :: Key is "+see.getKey() +" Value is :"+see.getValue());
//            Used entrySet() :: Key is Amit Value is :2
//            Used entrySet() :: Key is Sumit Value is :11
        }

        hm.forEach((k,v)-> System.out.println("k and value "+ k+" ==>"+v));
//        k and value Amit ==>2
//        k and value Sumit ==>11

        System.out.println(hm.replace("Sumit",111));//old value 11 returned
        System.out.println(hm);//{Amit=2, Sumit=111}
        System.out.println(hm.containsKey("Sumit"));//true
        System.out.println(hm.containsValue(11));//false

   hm.compute("Sumit",(k,v)->(v==null)?1:v+1);
        System.out.println(hm);//{Amit=2, Sumit=112}
    }
}
