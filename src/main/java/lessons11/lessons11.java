package lessons11;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class lessons11 {
    public static void main(String[] args) {
        Map <Integer,String>map=new HashMap<>();
        map.put(445,"milk");
        map.put(334,"tea");
        map.put(112,"cappuccino");
        printSortMap(map);

    }
    public static void printSortMap (Map<Integer,String>map){
        Map<Integer,String> newMap= new TreeMap<>(map);
        for(Map.Entry<Integer,String> a:newMap.entrySet()){

            System.out.println(a.getKey()+ " = "+ a.getValue());}
    }
}
