package yte.intern.springcore.postPre;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

//@Component
public class PostPreBean {

    public PostPreBean() {
        System.out.println("Consturctor içi");
    }


    public void print(){
        System.out.println("Print Fonksiyonu");
    }

    @PreDestroy
    public void printPreDestroy(){
        System.out.println("PreDestroy Fonksiyonu");
    }

    @PostConstruct
    public void printPostConstruct(){
        System.out.println("PostConstruct Fonksiyonu");
    }



}
