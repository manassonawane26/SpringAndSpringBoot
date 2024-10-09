package org.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {

    @Value("21")
    private int age;
    @Autowired
//    @Qualifier("lap4")
//    @Qualifier("desktop") // By default classname with first letter small is the bean name
    private Computer comp;
    public Alien(){
        System.out.println("Alien Object Created");
    }

//    @ConstructorProperties({"age", "lap"})
//    public Alien(int age, Laptop lap) {
//        this.age = age;
//        this.lap = lap;
//        System.out.println("Parameterized Constructor called");
//    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
//        System.out.println("Setter Called");
        this.age = age;
    }

//    public Laptop getLap() {
//        return lap;
//    }
//
//    public void setLap(Laptop lap) {
//        this.lap = lap;
//    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code(){
        System.out.println("Coding...");
        comp.compile();
    }
}
