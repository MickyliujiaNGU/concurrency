package com.concurrent.chapter1;

public abstract class TemplateMethod {
    public final void print(String message) {
        System.out.println("####################");
        wrapPrint(message);
        System.out.println("#################");
    }

    protected abstract void wrapPrint(String message);

    public static void main(String[] args) {
        new TemplateMethod(){
            @Override
            protected void wrapPrint(String message) {
                System.out.println(message);
            }
        }.print("helloWorld");
        new TemplateMethod(){
            @Override
            protected void wrapPrint(String message) {
                System.out.println(message);
            }
        }.print("helloWrap");
    }
}
