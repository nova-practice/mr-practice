package com.quantuncs.callable;

import java.util.concurrent.Callable;

public class TaskWithResult implements Callable<String> {

    private int id ;

    public TaskWithResult(int id){
        this.id = id ;
    }

    public String call() throws Exception {

        Thread.sleep(id * 1000);
        return "result of TaskWithResult " + id;
    }
}
