package com.study._01javadi01.bean;

public class PrinterB implements Printer{
    @Override
    public void print(String message) {
        System.out.println("printerB: " + message);
    }
}
