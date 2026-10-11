package com.example.demo.Java.DesignPatterns;

public class FactoryDesignPattern {

    Test test = new Test();
//    test.createObject("SBI");
//    test.createObject("AXIS");
}


interface Payment{
    void pay();
}

class SBI implements Payment{

    @Override
    public void pay() {

    }
}

class Axis implements Payment{

    @Override
    public void pay() {

    }
}

class Test{
    public Payment createObject(String type){
        if(type.equalsIgnoreCase("SBI")){
            return new SBI();
        }
        if(type.equalsIgnoreCase("AXIS")){
            return new Axis();
        }
        return null;
    }
}