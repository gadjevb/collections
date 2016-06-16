package com.clouway.coll.task1;

import java.util.*;

public class PageBean {
    private List<Object> list = null;
    private int pageSize = 0, leftBorder = 0, rightBorder = 0, pageNumber = 0; // I think that this way is easier, I could've used the pageNumber to multiply the pageSize
                                                                               // and then add it to the leftBorder, but I would still have had one class level variable.
    /**                                                                          So I decided to add two more and get rid of the multiplication because it's a slow operation
    Constructor                                                                  when compared to addition.
     */                                                                       // If there is a better way I would like to learn about it!
    public PageBean(List<Object> list, int pageSize) {
        this.list = new LinkedList<>(list);
        this.pageSize = pageSize;
    }

    /**
    Returns the next page
     */
    public List<Object> next() throws PageDoesNotExist {
        pageNumber++;
        if ((leftBorder + pageSize) < list.size()) {
            rightBorder = leftBorder + pageSize;
        } else {
            rightBorder = list.size();
        }
        if (leftBorder == (list.size())) {
            throw new PageDoesNotExist();
        }
        List<Object> tempList = list.subList(leftBorder, rightBorder);
        leftBorder = leftBorder + pageSize;
        return tempList;
    }

    /**
    Returns the previous page
     */
    public List<Object> previous() throws PageDoesNotExist {
        pageNumber--;
        if ((leftBorder - pageSize - pageSize) < 0) {
            throw new PageDoesNotExist();
        } else {
            leftBorder = leftBorder - pageSize - pageSize;
        }
        rightBorder = leftBorder + pageSize;
        List<Object> tempList = list.subList(leftBorder, rightBorder);
        leftBorder = leftBorder + pageSize;
        return tempList;
    }

    /**
    Checks if there is a next page
     */
    public boolean hasNext() {
        if (leftBorder >= list.size()) {
            return false;
        } else {
            return true;
        }
    }

    /**
    Checks if there is a previous page
     */
    public boolean hasPrevious() {
        if (pageNumber <= 1) {
            return false;
        } else {
            return true;
        }
    }

    /**
    Jump to first page
     */
    public List<Object> firstPage() throws PageDoesNotExist {
        pageNumber = 1;
        leftBorder = 0;
        if ((leftBorder + pageSize) < list.size()) {
            rightBorder = leftBorder + pageSize;
        } else {
            rightBorder = list.size();
        }
        if (leftBorder == (list.size())) {
            throw new PageDoesNotExist();
        }
        List<Object> tempList = list.subList(leftBorder, rightBorder);
        leftBorder = leftBorder + pageSize;
        return tempList;
    }

    /**
    Jump to last page
     */
    public List<Object> lastPage() throws PageDoesNotExist {
        int temp;
        if(list.size() % pageSize == 0){
            temp = list.size() % pageSize;
            pageNumber = temp;
            rightBorder = list.size();
            leftBorder = list.size() - temp;
        }else{
            temp = list.size() % pageSize;
            pageNumber = temp + 1;
            rightBorder = list.size();
            leftBorder = list.size() - temp;
        }
        List<Object> tempList = list.subList(leftBorder, rightBorder);
        leftBorder = leftBorder + pageSize;
        return tempList;
    }

    /**
    Get page number
     */
    public int getCurrentPageNumber(){  // I saw that the method should return List, I think that this way is easier
        return pageNumber;              // I can't figure out how am I going to get the page number by returning a list
    }
}
