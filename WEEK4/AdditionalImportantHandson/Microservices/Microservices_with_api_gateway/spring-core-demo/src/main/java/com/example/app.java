package com.example;

import com.example.model.Employee;
import com.example.model.Employee1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {


    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Employee1 e = (Employee1) context.getBean("emp2");
        System.out.println(e);

    }
}
