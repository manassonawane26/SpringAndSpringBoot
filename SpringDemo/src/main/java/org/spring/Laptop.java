package org.spring;

import org.springframework.stereotype.Component;

@Component("lap4")
public class Laptop implements Computer {

    public Laptop(){
        System.out.println("Laptop object Created");
    }
    @Override
    public void compile() {
        System.out.println("Compiling with laptop");
    }
}
