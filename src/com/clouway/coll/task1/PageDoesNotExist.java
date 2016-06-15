package com.clouway.coll.task1;

public class PageDoesNotExist extends Exception{
    public PageDoesNotExist(){
        super();
    }

    @Override
    public String getMessage(){
        return "The page you are trying to reach doesn't exist!";
    }
}
