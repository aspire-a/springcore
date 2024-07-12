package yte.intern.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import yte.intern.springcore.dependencyInjection.Test3Bean;
import yte.intern.springcore.kendiBeanim.InjectionTest;
import yte.intern.springcore.postPre.PostPreBean;

@SpringBootApplication
public class SpringcoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringcoreApplication.class, args);
//        TestBean testBean = context.getBean(TestBean.class);
//        testBean.print();
//
//        System.out.println("\n");
//
//        Test3Bean test3Bean = context.getBean(Test3Bean.class);
//        test3Bean.print();

//////////////////////////////////////////////////////////////////////////////////////////////

//        PostPreBean postPreBean = context.getBean(PostPreBean.class);
//        postPreBean.print();

//////////////////////////////////////////////////////////////////////////////////////////////

        InjectionTest injectionTest = context.getBean(InjectionTest.class);
        injectionTest.print();

//////////////////////////////////////////////////////////////////////////////////////////////






    }

}