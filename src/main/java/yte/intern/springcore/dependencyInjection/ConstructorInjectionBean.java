package yte.intern.springcore.dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectionBean {

    public void print(){
        System.out.println("SetterInjectionBean \n");
    }

}
