package com.clouway.coll.task1;

import java.util.*;

public class PageBean {
    private List<Object> list = null;
    private int pageSize = 0, leftBorder = 0, rightBorder = 0, pageNumber = 0;
////////////////Constructor////////////////////
    public PageBean(List<Object> list, int pageSize){
        this.list = new LinkedList<>(list);
        this.pageSize = pageSize;
    }
/////////////////Next page/////////////////////
    public List<Object> next() throws PageDoesNotExist{
        pageNumber++;
        if((leftBorder + pageSize) < list.size()){
            rightBorder = leftBorder + pageSize;
        }else{
            rightBorder = list.size();
        }
        if(leftBorder == (list.size())){
            throw new PageDoesNotExist();
        }
        List<Object> tempList = list.subList(leftBorder,rightBorder);
        leftBorder = leftBorder + pageSize;
        return tempList;
    }
///////////////Previous page///////////////////
    public List<Object> previous() throws PageDoesNotExist{
        pageNumber--;
        if((leftBorder - pageSize - pageSize) < 0){
            throw new PageDoesNotExist();
        }else{
            leftBorder = leftBorder - pageSize - pageSize;
        }
        rightBorder = leftBorder + pageSize;
        List<Object> tempList = list.subList(leftBorder,rightBorder);
        leftBorder = leftBorder + pageSize;
        return tempList;
    }
}
