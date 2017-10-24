package cn.nokia.helloword;

import cn.nokia.helloword.ref.Action;
import cn.nokia.helloword.ref.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.smartcardio.CardTerminal;

/**
 * Created by fan on 2017/10/21.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");


        HUser huser = (HUser) ctx.getBean("huser");
        HUser huserco = (HUser) ctx.getBean("huser");
        System.out.println(huserco == huser);


        HUser huser1 = (HUser) ctx.getBean("huser1");
        huser1.hello();


        Car car = (Car) ctx.getBean("car");
        System.out.println(car);
        Car car1 = (Car) ctx.getBean("car1");
        System.out.println(car1);

        Service service = (Service) ctx.getBean("service");
        service.save();

        Action action = (Action) ctx.getBean("action");
        action.execute();


        User user = (User) ctx.getBean("user");
        User user1 = (User) ctx.getBean("user1");
        User user2 = (User) ctx.getBean("user2");

        System.out.println(user);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user == user1);
    }
}
