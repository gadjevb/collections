package com.clouway.coll.task2;

public class SentenceDemo {
    public static void main(String[] args){
        Sentence sentence = new Sentence();
        System.out.println(sentence.wordFrequency("Mary had a little lamb"));
        Character temp = sentence.mostCommonCharacter("Mary had a little lamb");
        System.out.print(String.format("The most common character is: %c", temp));
    }
}
