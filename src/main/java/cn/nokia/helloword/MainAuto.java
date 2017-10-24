package cn.nokia.helloword;

import cn.nokia.helloword.User;
import cn.nokia.helloword.ref.Action;
import cn.nokia.helloword.ref.Dao;
import cn.nokia.helloword.ref.DataSourceTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fan on 2017/10/21.
 */
public class MainAuto {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-auto.xml");

        Action action = (Action) ctx.getBean("action");

        Action action1 = (Action) ctx.getBean(Action.class);

        action.execute();
        System.out.println(action == action1);

        /**
         *
         */

        Dao dao = (Dao) ctx.getBean("dao1");
        Dao dao1 = (Dao) ctx.getBean("dao1");
        dao.save();
        System.out.println(dao == dao1);


        DataSourceTest dataSourceTest = (DataSourceTest) ctx.getBean("datasource");
        System.out.println(dataSourceTest.getDriverClass());
        User user = (User) ctx.getBean("user");
        System.out.println(user);

        ctx.close();


    }
}
