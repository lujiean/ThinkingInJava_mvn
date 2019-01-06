package com.thinkinginjava.holdingyourobj;

/**
Exercise 27: (2) Write a class called Command that contains a String and has a method operation( ) that displays the String. 
Write a second class with a method that fills a Queue with Command objects and returns it. 
Pass the filled Queue to a method in a third class that consumes the objects in the Queue and calls their operation( ) methods.
 */
import java.util.*;

/**
 * Ex27_1
 */
class Ex27_1 {

    public void func2(Queue<Command> que){
        while(que.peek() != null)
            System.out.print(que.remove() + " ");
        System.out.println();
    }   
}
class Ex27{
    public Queue<Command> func1(Queue<Command> que, Command cmd){
        que.offer(cmd);
        return que;
    }
}

public class Command {

    private String str;

    Command(String str){
        this.str = str;
    }

    public void operation(){
        System.out.println(str);
    }
}