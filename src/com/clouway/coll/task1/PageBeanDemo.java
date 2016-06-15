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
        try {                                              /////////next page
            System.out.printf("%s " ,listPage.next());
        } catch (PageDoesNotExist pageDoesNotExist) {
            pageDoesNotExist.printStackTrace();
        }
        try {                                                /////////next page
            System.out.printf("%s " ,listPage.next());
        } catch (PageDoesNotExist pageDoesNotExist) {
            pageDoesNotExist.printStackTrace();
        }
        try {                                                /////////next page
            System.out.printf("%s " ,listPage.next());
        } catch (PageDoesNotExist pageDoesNotExist) {
            pageDoesNotExist.printStackTrace();
        }
        try {                                               /////////previous page
            System.out.printf("%s " ,listPage.previous());
        } catch (PageDoesNotExist pageDoesNotExist) {
            pageDoesNotExist.printStackTrace();
        }
        try {                                               /////////next page
            System.out.printf("%s " ,listPage.next());
        } catch (PageDoesNotExist pageDoesNotExist) {
            pageDoesNotExist.printStackTrace();
        }
        try {                                              /////////first page
            System.out.printf("%s " ,listPage.firstPage());
        } catch (PageDoesNotExist pageDoesNotExist) {
            pageDoesNotExist.printStackTrace();
        }
        try {                                              /////////next page
            System.out.printf("%s " ,listPage.next());
        } catch (PageDoesNotExist pageDoesNotExist) {
            pageDoesNotExist.printStackTrace();
        }
        try {                                             /////////previous page
            System.out.printf("%s " ,listPage.previous());
        } catch (PageDoesNotExist pageDoesNotExist) {
            pageDoesNotExist.printStackTrace();
        }
        try {                                             /////////last page
            System.out.printf("%s " ,listPage.lastPage());
        } catch (PageDoesNotExist pageDoesNotExist) {
            pageDoesNotExist.printStackTrace();
        }
        try {                                             /////////previous page
            System.out.printf("%s " ,listPage.previous());
        } catch (PageDoesNotExist pageDoesNotExist) {
            pageDoesNotExist.printStackTrace();
        }
    }
}
