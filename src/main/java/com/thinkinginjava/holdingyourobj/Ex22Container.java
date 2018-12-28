package com.thinkinginjava.holdingyourobj;

/**
 * Ex22Container
 */
public class Ex22Container {

    private String key;
    private int count;

    Ex22Container (String key){
        this.key = key;
        this.count = 1;
    }
    
    public void addCount(){
        this.count++;
    }

    public boolean equals(Ex22Container oContainer){
        return (this.key.equals(oContainer.key));
    }

    public int getCount(){
        return this.count;
    }

}