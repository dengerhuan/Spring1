package cn.nokia.helloword;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by fan on 2017/10/22.
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {


        if (s.equals("huser")) {
            System.out.println("MyBeanPostProcessor postProcessBeforeInitialization " + s);
            HUser hUser = (HUser) o;
            hUser.setUser("dengerhuan");
        }

        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return o;
    }
}
