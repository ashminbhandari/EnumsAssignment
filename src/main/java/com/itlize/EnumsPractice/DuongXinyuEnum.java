package com.itlize.EnumsPractice;

enum DuongXinyuEnum {
    Duong,
    Xinyu;

    String getCatchPhrase(){
        return "Hey, my name is "+ this.toString()+"!";
    }

    boolean isDuong(){
        return this.toString().equals("Duong");
    }

    boolean isXinyu(){
        return this.toString().equals("Xinyu");
    }
}