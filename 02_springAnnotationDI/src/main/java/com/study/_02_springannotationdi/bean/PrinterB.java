package com.study._02_springannotationdi.bean;

import org.springframework.stereotype.Component;

@Component("printerB")
public class PrinterB implements Printer{
    @Override
    public void print(String message) {
        System.out.println("printerB: " + message);
    }
}
