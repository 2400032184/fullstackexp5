package com.college;

import com.college.config.AppConfig;
import com.college.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Student student = context.getBean(Student.class);
        
        System.out.println("Student Details:");
        System.out.println(student);
    }
}
