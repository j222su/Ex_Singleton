package com.js.example_singletone;

public class ThreadSafeDoubleCheckedLocking {
    private static ThreadSafeDoubleCheckedLocking instance;

    private ThreadSafeDoubleCheckedLocking() {

    }

    public static ThreadSafeDoubleCheckedLocking getInstance() {
        if(instance==null) {
            synchronized (ThreadSafeDoubleCheckedLocking.class) {
                if(instance == null) {
                    instance = new ThreadSafeDoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}
