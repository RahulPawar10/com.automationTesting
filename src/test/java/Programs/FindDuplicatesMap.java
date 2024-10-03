package Programs;

import java.util.HashMap;
import java.util.Map;



public class FindDuplicatesMap {
    public static void main(String[] args) {

        Map<Integer,Character> map=new HashMap<>();
        map.put(1,'A');
        map.put(2,'B');
        map.put(3,'C');
        map.put(4,'D');
        map.put(5,'A');
        map.put(6,'B');

        Map<Character,Integer> map1=new HashMap<>();
        for (Character str:map.values()){
            if (map1.containsKey(str)){
                map1.put(str,map1.get(str)+1);
            }
            else {
                map1.put(str,1);
            }
        }
       /* for (Map.Entry<String,Integer>key:map1.entrySet()){
            if (key.getValue()>1){
                System.out.println(key.getKey()+"=="+ key.getValue());
            }
        }*/
        for (Character key:map1.keySet()){
            if (map1.get(key)>1){
                System.out.println(key+"=="+  map1.get(key));

            }
        }
    }
}
