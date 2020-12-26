package com.learnannotations.comlearnannotationsbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ComlearnannotationsbasicApplication {

    public static void main(String[] args) {

     //   Samsung obj = new  Samsung();  //we don't want to create objects this way , Let's use Annotations

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung obj = factory.getBean(Samsung.class);  // We are asking factory to create object for Samsung
        obj.welcomenote();
    }

}
