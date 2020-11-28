package com.itlize.EnumsPractice;

class DuongXinyuEvaluator {

    private String name;
    public DuongXinyuEvaluator(String name){
        this.name = name;
    }

    public boolean isDuong(){
        return this.name.equals("Duong");
    }

    public boolean isXinyu(){
        return this.name.equals("Xinyu");
    }
}