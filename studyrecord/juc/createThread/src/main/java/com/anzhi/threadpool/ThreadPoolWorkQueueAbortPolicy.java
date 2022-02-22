package com.anzhi.threadpool;

import java.util.concurrent.*;

public class ThreadPoolWorkQueueAbortPolicy {
    private static ExecutorService pool;

    public static void main(String[] args) {
        //直接提交队列， maximumPoolSize设置为2 ，拒绝策略为AbortPolic策略，直接抛出异常,
//        pool = new ThreadPoolExecutor(1, 2, 1000, TimeUnit.MILLISECONDS,
//                new SynchronousQueue<Runnable>(), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        //有界的任务队列， maximumPoolSize设置为2 ，拒绝策略为AbortPolic策略，直接抛出异常,
//        pool = new ThreadPoolExecutor(1, 2, 1000, TimeUnit.MILLISECONDS,
//                new ArrayBlockingQueue<Runnable>(10),Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        //无界的任务队列， maximumPoolSize设置为2 ，拒绝策略为AbortPolic策略，直接抛出异常,
        pool = new ThreadPoolExecutor(1, 2, 1000, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(),Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        // 优先任务队列：优先任务队列通过PriorityBlockingQueue实现
//        pool = new ThreadPoolExecutor(1, 2, 1000, TimeUnit.MILLISECONDS,
//                new PriorityBlockingQueue<Runnable>(),Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        // ThreadFactory自定义线程创建
//        pool = new ThreadPoolExecutor(2, 4, 1000, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(5),
//                new ThreadFactory() {
//                    public Thread newThread(Runnable r) {
//                        System.out.println("线程"+r.hashCode()+"创建");
//                        //线程命名
//                        Thread th = new Thread(r,"threadPool"+r.hashCode());
//                        return th;
//                    }
//                }, new ThreadPoolExecutor.CallerRunsPolicy());

//        for(int i=0; i<20; i++){
//            pool.execute(new ThreadTask());
//        }
        while (true){
            pool.execute(new ThreadTask());
        }
    }

}
