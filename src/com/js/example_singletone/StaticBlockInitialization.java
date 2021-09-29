package com.js.example_singletone;

public class StaticBlockInitialization {

    private static StaticBlockInitialization instance;

    private StaticBlockInitialization() {

    }

    static {
        try {
            instance = new StaticBlockInitialization();
        } catch (Exception exception) {
            throw new RuntimeException("Exception creating StaticBlockInitialization instance");
        }
    }

    public static StaticBlockInitialization getInstance() {
        return instance;
    }
}
