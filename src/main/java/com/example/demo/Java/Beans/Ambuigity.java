package com.example.demo.Java.Beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

interface DTY{
    void pay();
}

@Component("aa")
class Abc implements DTY {
    @Override
    public void pay() {

    }
}

@Component("bb")
//@Primary
class XYZ implements DTY{
    @Override
    public void pay() {

    }
}

@Component
class Ambuigity {
    private final DTY dty;
    public Ambuigity(@Qualifier("bb")  DTY dty) {
        this.dty = dty;
    }
}