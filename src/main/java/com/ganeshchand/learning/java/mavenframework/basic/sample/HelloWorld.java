package com.ganeshchand.learning.java.mavenframework.basic.sample;

/**
 * Created with IntelliJ IDEA.
 * User: gchand
 * Date: 3/24/14
 * Time: 12:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorld {
    private String user;
    private String message;
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(){
         this.message = "Hello, ".concat(this.getUser());
    }


    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        if(args.length == 0){
            helloWorld.setUser("World");
            helloWorld.setMessage();
        }
        else{
            helloWorld.setUser(args[0]);
            helloWorld.setMessage();
        }

        System.out.println(helloWorld.getMessage());

    }
}
