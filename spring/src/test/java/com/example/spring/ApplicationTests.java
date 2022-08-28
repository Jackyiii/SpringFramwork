package com.example.spring;

import com.example.spring.springCourse1.spring01.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class ApplicationTests {

    //Spring01
    @Test
    public void TestSpring01(){
        Person p=new Person(1,"2");
        System.out.println(p);
    }

    //Spring02
    @Test
    public void TestSpring02(){
        //1.初始化容器
        ApplicationContext context=new ClassPathXmlApplicationContext("file:springxml/test01.xml");
        //2.获取对象
        Person p=(Person) context.getBean("test01");
        System.out.println(p);
    }

    @Test
    public void TestSpring03(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("file:springxml/test01.xml");
        Person p=(Person) ac.getBean("test02");
        System.out.println(p);
    }

    @Test
    public void TestSpring04(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("file:springxml/test01.xml");
        Person p = ac.getBean(Person.class);
    }

}
