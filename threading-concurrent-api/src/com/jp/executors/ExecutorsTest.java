package com.jp.executors;

import java.util.concurrent.*;

/**
 * Created by anuj on 31/07/17.
 */

class SumInetgerCallable implements Callable<Integer> {

    Integer integer;

    SumInetgerCallable(int i){
        this.integer=i;
    }

    public Integer call() throws Exception {

        Integer sum = 0;
        for(int i=0;i<integer;i++){
            sum+=i;
        }

        return sum;
    }

}

class SquareDoubleCallable implements Callable<Double> {

    Double aDouble;

    SquareDoubleCallable(double i){
        this.aDouble=i;
    }

    public Double call() throws Exception {

        return aDouble*aDouble;
    }

}

public class ExecutorsTest {
    public static void main(String[] args) throws Exception {
        Integer nThreads = Integer.parseInt(args[0]);
        ExecutorService executorService = Executors.newFixedThreadPool(nThreads);
        SumInetgerCallable sumInetgerCallable = new SumInetgerCallable(10);
        SquareDoubleCallable squareDoubleCallable = new SquareDoubleCallable(2.0);
        Future<Double> doubleFuture =  executorService.submit(squareDoubleCallable);
        Future<Integer> integerFuture = executorService.submit(sumInetgerCallable);

        System.out.println("Output from SumInteger: "+integerFuture.get());
        System.out.println("Output from SquareDouble: "+doubleFuture.get());
        executorService.shutdown();
    }
}
