package com.study._01javadi01.bean;

public class PrinterA implements Printer{
    @Override
    public void print(String message) {
        System.out.println("printerA: " + message);
    }
}
