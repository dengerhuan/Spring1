package cn.nokia.helloword.factory;

import cn.nokia.helloword.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fan on 2017/10/22.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-factory.xml");
        Car car1 = (Car) ctx.getBean("car1");
        Car car2 = (Car) ctx.getBean("car2");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1 == car2);
    }
}
