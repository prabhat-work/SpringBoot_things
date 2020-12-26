package com.learnannotations.comlearnannotationsbasic;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // This will create object of Samsung automatically
public class Samsung {

    @Getter
    @Setter
    @Autowired
    Mobileprocessor cpu;  // As we have written autowired over cpu so it will automatically generate object whose return type is Mobileprocessor from Appconfig file and store it into cpu

    public void welcomenote(){
        System.out.println("Samsung phone");
        cpu.process();
    }
}
