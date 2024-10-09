package org.spring.config;

import org.spring.Alien;
import org.spring.Computer;
import org.spring.Desktop;
import org.spring.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.spring")
public class AppConfig {
//    @Bean (name={"comp1", "dt", "desk"})
//    @Bean
//    @Scope("prototype")
//    public Desktop desktop1(){
//        return new Desktop();
//    }
//    @Bean
//    @Primary
//    public Laptop laptop1(){
//        return new Laptop();
//    }
//
//    @Bean
////    public Alien alien1(@Qualifier("laptop1") Computer comp){
//    public Alien alien1(Computer comp){
//        Alien al1 = new Alien();
//        al1.setAge(25);
//        al1.setComp(comp);
//        return al1;
//    }
}
