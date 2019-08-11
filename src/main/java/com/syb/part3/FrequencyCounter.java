package com.syb.part3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @version : v1.0
 * @Written by :shenyb
 * @Creation Date : 19/8/11 下午6:46
 * @Description :词频统计
 * 编译：javac -d FrequencyCounter.java  运行：java com.syb.part3.FrequencyCounter < a.txt
 */
public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> counter = new HashMap<>();
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            for(String word : line.split(" ")){
                if(counter.containsKey(word)){
                    counter.put(word,counter.get(word)+1);
                }else{
                    counter.put(word,1);
                }

            }
        }
        for(Map.Entry<String,Integer> entry:counter.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
