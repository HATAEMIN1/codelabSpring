package com.study.__javaDI.bean;

public class LgTv implements TV{
    public LgTv(){
        System.out.println("lgTv 생성");
    }

    @Override
    public void powerOn() {
        System.out.println("lg티비 킴");
    }

    @Override
    public void powerOff() {
        System.out.println("lg티비 끔");
    }

    @Override
    public void volumeUp() {
        System.out.println("lg티비 볼륨 올림");
    }

    @Override
    public void volumeDown() {
        System.out.println("lg티비 볼륨 낮춤");
    }
}
