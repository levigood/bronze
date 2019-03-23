package cn.Test;

public class HelloWorld {

    public void helloWorld(){

        System.out.println("hello word");

        try {
            Thread.sleep(1*30*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
