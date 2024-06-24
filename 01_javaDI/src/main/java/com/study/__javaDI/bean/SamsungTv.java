package com.study.__javaDI.bean;

public class SamsungTv implements TV{
    public SamsungTv() {
        System.out.println("삼성티비 생성");
    }

    @Override
    public void powerOn() {
        System.out.println("삼성티비 킴");
    }

    @Override
    public void powerOff() {
        System.out.println("삼성티비 끔");
    }

    @Override
    public void volumeUp() {
        System.out.println("삼성티비 볼륨 올림");
    }

    @Override
    public void volumeDown() {
        System.out.println("삼성티비 볼륨 낮춤");
    }
}
