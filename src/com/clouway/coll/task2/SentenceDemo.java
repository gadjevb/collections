package com.clouway.coll.task2;

public class SentenceDemo {
    public static void main(String[] args){
        Sentence sentence = new Sentence();
        sentence.wordFrequency("Mary had a little lamb");
        Character temp = sentence.mostCommonCharacter("Mary had a little lamb");
        System.out.println(String.format("The most common character is: %c", temp));
    }
}
