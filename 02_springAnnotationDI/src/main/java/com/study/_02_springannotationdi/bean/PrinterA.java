package com.study._02_springannotationdi.bean;

import org.springframework.stereotype.Component;

@Component("printerA")
public class PrinterA implements Printer{
    @Override
    public void print(String message) {
        System.out.println("printerA: " + message);
    }
}
