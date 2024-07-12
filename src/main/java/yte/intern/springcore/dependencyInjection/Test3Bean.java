package yte.intern.springcore.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test3Bean {


    @Autowired
    private FieldInjectionBean fieldInjectionBean;


    public void test (){
        fieldInjectionBean.printAutoWire();
    }

    //////////////////////////////////////////////////////////////////////////////


    private SetterInjectionBean setterInjectionBean;

    @Autowired
    private void setTest3Bean(SetterInjectionBean setterInjectionBean){
        this.setterInjectionBean = setterInjectionBean;
    }


    ///////////////////////////////////////////////////////////////////////////////


    private ConstructorInjectionBean constructorInjectionBean;

    @Autowired
    public Test3Bean(ConstructorInjectionBean constructorInjectionBean){
        this.constructorInjectionBean = constructorInjectionBean;
    }





    public void print(){
        fieldInjectionBean.print();
        setterInjectionBean.print();
        constructorInjectionBean.print();
    }




}
