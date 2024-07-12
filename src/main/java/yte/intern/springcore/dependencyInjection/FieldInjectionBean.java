package yte.intern.springcore.dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class FieldInjectionBean {

    public void print(){
        System.out.println("FieldInjectionBean \n");
    }

    public void printAutoWire(){
        System.out.println("FieldInjectionBean AutoWire \n");
    }
}
