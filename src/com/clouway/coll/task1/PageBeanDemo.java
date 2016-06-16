package com.clouway.coll.task1;

import java.util.*;

public class PageBeanDemo {
    public static void main (String [] args){
        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        PageBean listPage = new PageBean(list, 4);
        try {
            System.out.printf("%s %d page \n" ,listPage.next(), listPage.getCurrentPageNumber());
            System.out.printf("%s %d page \n" ,listPage.next(), listPage.getCurrentPageNumber());
            System.out.printf("%s %d page \n" ,listPage.next(), listPage.getCurrentPageNumber());
            System.out.printf("%s %d page \n" ,listPage.previous(), listPage.getCurrentPageNumber());
            System.out.printf("%s %d page \n" ,listPage.next(), listPage.getCurrentPageNumber());
            System.out.printf("%s %d page \n" ,listPage.firstPage(), listPage.getCurrentPageNumber());
            System.out.printf("%s %d page \n" ,listPage.next(), listPage.getCurrentPageNumber());
            System.out.printf("%s %d page \n" ,listPage.previous(), listPage.getCurrentPageNumber());
            System.out.printf("%s %d page \n" ,listPage.lastPage(), listPage.getCurrentPageNumber());
            System.out.printf("%s %d page \n" ,listPage.previous(), listPage.getCurrentPageNumber());
        } catch (PageDoesNotExist pageDoesNotExist) {
            pageDoesNotExist.printStackTrace();
        }
        /*
        I thought about a endless while cycle with scanner that reads strings from the console, but at the time it didn't look like a valid solution to me.
        If you like I could make an implementation. I was thinking about several code words that will be compared, each one corresponding to its function like commands
        plus the word "End" or "Exit" that will serve as a command for getting out of the cycle.
         */
    }
}
