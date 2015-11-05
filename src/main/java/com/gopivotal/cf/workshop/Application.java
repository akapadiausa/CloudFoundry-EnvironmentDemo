package com.gopivotal.cf.workshop;

import org.springframework.boot.SpringApplication;

/**
 * Used to initialize the app when packaged as a JAR
 * @author kkrueger modified by amar kapadia at mirantis
 */
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Config.class, args);
    }
    
}
