package Programs;

import java.util.HashMap;
import java.util.Map;
public class FindDuplicates {
    public static void main(String[] args) {

        String str="programming";
        char []arr=str.toCharArray();

        Map<Character,Integer> map=new HashMap<>();

        for (int i=0;i<str.length();i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else {
                map.put(arr[i],1);
            }
        }

        /*for(Character Key:map.keySet()){
            if (map.get(Key)>1){
                System.out.println(Key+"=="+  map.get(Key));
            }
        }*/

        for (Map.Entry<Character,Integer>key:map.entrySet()){
            if (key.getValue()>1){
                System.out.println(key.getKey()+"=="+ key.getValue());
            }
        }
    }
}
