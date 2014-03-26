package com.ganeshchand.learning.java.mavenframework.basic.sample;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: gchand
 * Date: 3/24/14
 * Time: 1:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldTest {
    @Test
    public void testMain() throws Exception {
        String message = "Hello, World";
        Assert.assertEquals(12,message.length());


    }
}
