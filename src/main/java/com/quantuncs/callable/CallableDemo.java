package com.quantuncs.callable;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool() ;

        Future<String> future1 = null;
        Future<String> future2 = null;

        future1 = service.submit(new TaskWithResult(5)) ;
        future2 = service.submit(new TaskWithResult(3)) ;



        while (future1.isDone()){
            System.out.println(123);
        }

        System.out.println(new Date(System.currentTimeMillis()) + ": " + future1.get());


        System.out.println(new Date(System.currentTimeMillis()) + ": " + future2.get());


        service.shutdown();
    }
}
