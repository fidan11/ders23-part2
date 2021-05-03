package com.company;

import java.util.concurrent.Callable;

public class MyThread implements Callable<String> {
    //    (ders-23,22-ci deqiqe)

    String threadName;

    public MyThread(String s) {
        this.threadName = s;
    }

//    @Override
//    public void run() {
//        m.method1nonstatic();
//    }

    @Override
    public String call() throws Exception {
        System.out.println("ish gedir");
        Thread.sleep(2000);
        return Math.random() + "" + this.threadName;
    }
//    ____________
//    Main m;
//
//    public MyThread(Main m) {
//        this.m = m;
//    }
//
////    @Override
////    public void run() {
////        m.method1nonstatic();
////    }
//
//    @Override
//    public String call() throws Exception {
//        System.out.println("ish gedir");
//        Thread.sleep(2000);
//        return Math.random()+"";
//    }
}
