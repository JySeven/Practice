package com.example.practice.spring.springStart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycle {
    public static void main(String[] args) {

        System.out.println("现在开始初始化容器");
        //启动时一次性加载所有需要的对象 使用BeanFactory 创建的bean 只有在使用的时候创建
        ApplicationContext factory = new ClassPathXmlApplicationContext("/***/***/beans.xml");
        System.out.println("容器初始化成功");
        //得到Preson，并使用
        Person person = factory.getBean("person",Person.class);
        //User user=factory.getBean("user",User.class);
        System.out.println(person);

        System.out.println("现在开始关闭容器！");
        ((ClassPathXmlApplicationContext)factory).registerShutdownHook();
    }
}
