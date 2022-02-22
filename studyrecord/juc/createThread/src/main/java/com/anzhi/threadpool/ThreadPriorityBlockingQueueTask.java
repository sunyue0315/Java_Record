package com.anzhi.threadpool;

public class ThreadPriorityBlockingQueueTask implements Runnable, Comparable<ThreadPriorityBlockingQueueTask>{

    int priority;

    public int getPriority() {
        return priority;
    }

    public ThreadPriorityBlockingQueueTask() {
    }

    public ThreadPriorityBlockingQueueTask(int priority) {
        this.priority = priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public int compareTo(ThreadPriorityBlockingQueueTask o) {
        return  this.priority>o.priority?-1:1;
    }

    @Override
    public void run() {
        try {
            //让线程阻塞，使后续任务进入缓存队列
            Thread.sleep(1000);
            System.out.println("priority:"+this.priority+",ThreadName:"+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println("线程异常中断" + e);
        }
    }
}
