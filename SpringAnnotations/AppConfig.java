package com.learnannotations.comlearnannotationsbasic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration   // once we give this configuration annotation this class will be responsible for generating objects
@ComponentScan(basePackages = "com.learnannotations.comlearnannotationsbasic")
public class AppConfig {

//    @Bean
//    public Samsung createphoneobj() {
//        return new Samsung();
//    }
//
////    @Bean
////    public Laptop createobj2(){
////        return new Laptop();
////    }
//
//    @Bean
//    public Mobileprocessor createprocessorobj(){
//        return new Snapdragon();
//        }

//     Incase if you dont' want to create objects by using above lines of code you need to do two things -
//     1. Write @Component on top of each class for which you want objects
//     2. You need to write @ComponentScan on top of this AppConfig class
}
