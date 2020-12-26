package com.learnannotations.comlearnannotationsbasic;

import org.springframework.stereotype.Component;

@Component  // This will create object of Snapdragon object automatically and it will be = snapdragon with s small ;)
public class Snapdragon implements Mobileprocessor {

    public void process(){
        System.out.println("Implementation of process method on Snapdragon class basis");
    }

}
