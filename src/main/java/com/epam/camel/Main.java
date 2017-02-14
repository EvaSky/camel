package com.epam.camel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Volha_Shakhrai on 2/14/2017.
 */
public class Main {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("classpath:invoices-context.xml");
    }
}
