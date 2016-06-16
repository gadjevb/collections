package com.clouway.coll.task2;

import java.util.*;

public class Sentence {

    /**
    Word frequency in the sentence
     */
    public void wordFrequency(String sentence){
        String[] temp = sentence.split(" ");
        Map<String, Integer> tempMap = new LinkedHashMap<>();
        for(String each : temp){
            Integer frequency = tempMap.get(each);
            tempMap.put(each, (frequency == null) ? 1 : frequency + 1);
        }
        System.out.printf("%d words in the sentence: \n%s \n",tempMap.size(),tempMap);
    }

    /**
     Most common character in the sentence
     */
    public Character mostCommonCharacter(String sentence){ //I have a question, do we consider SPACE (Decimal ASCII code: 32) a character?
        char[] temp = sentence.toCharArray();
        Map<Character, Integer> tempMap = new HashMap<>();
        for(Character each : temp){
            tempMap.put(each, (tempMap.get(each) == null) ? 1 : tempMap.get(each) + 1);
        }
        Integer maxValue = Collections.max(tempMap.values());
        for(Character each : tempMap.keySet()){
            if(32 == (int)each){
                continue;
            }
            if(tempMap.get(each).equals(maxValue)){
                return each;
            }
        }
        return null;
    }
}
