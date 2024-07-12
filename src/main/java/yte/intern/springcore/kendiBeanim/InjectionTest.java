package yte.intern.springcore.kendiBeanim;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import yte.intern.springcore.TestBean;

@Component
public class InjectionTest {

    private BeanTest beanTest;
    private ComponentTest componentTest;

    @Autowired
    public InjectionTest(BeanTest beanTest, ComponentTest componentTest){
        this.beanTest = beanTest;
        this.componentTest = componentTest;
    }

    public void print(){
        beanTest.print();
        componentTest.print();
    }
}

