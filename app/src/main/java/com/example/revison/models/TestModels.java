package com.example.revison.models;

public class TestModels {
    int id;
    String title;

    public TestModels(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int calcule(int a,int b){
        return a+b;
    }



    public int calcule(int a,int b,int c){
        return a+b+c;
    }

    public String calcule(String s){
        return s;
    }

}
