package com.study.__javaDI.bean;

public class SonyTv implements TV{
    public SonyTv() {
        System.out.println("소니티비 생성");
    }

    @Override
    public void powerOn() {
        System.out.println("소니티비 킴");
    }

    @Override
    public void powerOff() {
        System.out.println("소니티비 끔");
    }

    @Override
    public void volumeUp() {
        System.out.println("소니티비 볼륨 올림");
    }

    @Override
    public void volumeDown() {
        System.out.println("소니티비 볼륨 낮춤");
    }
}
