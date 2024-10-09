package org.spring;

import org.spring.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext jContext = new AnnotationConfigApplicationContext(AppConfig.class);
//        Desktop dt1 = jContext.getBean(Desktop.class);
//        dt1.compile();
//        Desktop dt2 = jContext.getBean(Desktop.class);
//        dt2.compile();
        Alien obj1 = jContext.getBean(Alien.class);
        System.out.println(obj1.getAge());
        obj1.code();




;
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj1 = (Alien) context.getBean("alien1");
//        System.out.println(obj1.getAge());
//        obj1.code();
//        obj1.setAge(25);


//        Alien obj1 = (Alien) context.getBean("alien1");
//        obj1.age=25;
//        System.out.println(obj1.age);
//        Alien obj2 = (Alien) context.getBean("alien1");
//        System.out.println(obj2.age);
//        obj.code();

//        Laptop lap = (Laptop) context.getBean(Laptop.class);
//        lap.compile();

//        Desktop desk3 = (Desktop) context.getBean("comp1");
//        Computer Comp = context.getBean(Computer.class);
//        Desktop desk3 = context.getBean(Desktop.class);
    }
}
