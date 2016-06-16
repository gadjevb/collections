package com.clouway.coll.task2;

import java.util.*;

public class Sentence {

    /**
    Word frequency in the sentence
     */
    public String wordFrequency(String sentence){
        String[] temp = sentence.split(" ");
        Map<String, Integer> tempMap = new LinkedHashMap<>();
        for(String each : temp){
            Integer frequency = tempMap.get(each);
            tempMap.put(each, (frequency == null) ? 1 : frequency + 1);
        }
        return String.format("%s",tempMap);
    }

    /**
     Most common character in the sentence
     */
    public Character mostCommonCharacter(String sentence){
        String[] tempString = sentence.split(" "); //Creating array from the split words
        Map<Character, Integer> tempMap = new HashMap<>();

        for(String word : tempString) {   // Iterating over the words
            char[] tempChar = word.toCharArray(); // creating a char array for each word
            for (Character each : tempChar) { // iterating over the characters of each word
                tempMap.put(each, (tempMap.get(each) == null) ? 1 : tempMap.get(each) + 1);
            }
        }

        Integer maxValue = Collections.max(tempMap.values());

        for(Character each : tempMap.keySet()){ // Returning the most common character
            if(tempMap.get(each).equals(maxValue)){
                return each;
            }
        }
        return null;
    }
}
