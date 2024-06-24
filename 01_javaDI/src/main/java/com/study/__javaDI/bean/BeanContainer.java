package com.study.__javaDI.bean;

public class BeanContainer {
    public Object getBean(String id) {
        if(id.equals("lg")){
            return new LgTv();
        }else if(id.equals("samsung")){
            return new SamsungTv();
        } else if (id.equals("sony")) {
            return new SonyTv();
        }
        return null;
    }
}
