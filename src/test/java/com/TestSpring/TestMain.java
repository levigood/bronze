package com.TestSpring;


import cn.Test.HelloWorld;
import org.testng.annotations.Test;


public class TestMain {

    @Test
    public void testYun(){
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.helloWorld();
    }
}
