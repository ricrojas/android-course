package com.example.rojas.myapplication;

public class DataManager {
    private static DataManager INSTANCE;

    private String name;

    private DataManager() {
    }

    public static DataManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DataManager();
        }
        return INSTANCE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
