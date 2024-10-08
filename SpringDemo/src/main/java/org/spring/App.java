package org.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj1 = (Alien) context.getBean("alien1");
        obj1.code();
//        obj1.setAge(25);
//        System.out.println(obj1.getAge());

//        Alien obj1 = (Alien) context.getBean("alien1");
//        obj1.age=25;
//        System.out.println(obj1.age);
//        Alien obj2 = (Alien) context.getBean("alien1");
//        System.out.println(obj2.age);
//        obj.code();

//        Laptop lap = (Laptop) context.getBean(Laptop.class);
//        lap.compile();
    }
}
