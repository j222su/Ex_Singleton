package com.js.example_singletone;

public class BillPugh {

    private BillPugh() {

    }

    private static class BillPughHelper {
        private static final BillPugh instance = new BillPugh();
    }

    public static BillPugh getInstance() {
        return BillPughHelper.instance;
    }
}
