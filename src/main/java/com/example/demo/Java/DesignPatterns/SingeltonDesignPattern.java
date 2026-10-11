package com.example.demo.Java.DesignPatterns;

class SingletonDesignPattern implements Cloneable{

    private static volatile SingletonDesignPattern instance;

    private SingletonDesignPattern(){
        super();
    }

    public static SingletonDesignPattern getInstance(){
        if(instance == null){
            synchronized (SingletonDesignPattern.class){
                if(instance == null){
                    instance = new SingletonDesignPattern();
                }
            }
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException(
                "Single object cannot be cloned"
        );
    }
}
