package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMap_demo {
    public static void main(String[] args) {
        HashMap <Integer,String> hm=new HashMap<>();
//      to insert values in the hashmap
        hm.put(1,"Lucknow");
        hm.put(2,"Kanpur");
        hm.put(3,"Unnao");
        hm.put(4,"Jhansi");
        // to get thr valules
        System.out.println(hm.get(4));
        //getting all values from for each loop
        for(int i:hm.keySet()){
            System.out.print(hm.get(i)+" ");
        }
        //getting values by values method
        System.out.println();
        System.out.println(hm.values());
        System.out.println(hm);
        if(hm.containsKey(3)){
            System.out.println("given key is present in the hashmap");
        }else{
            System.out.println("given key is not present in the hashmap");
        }
        if(hm.isEmpty()){
            System.out.println("Hashmap is empty");
        }else{
            System.out.println("Hasmap have a size of : "+hm.size());
        }

    }
}
