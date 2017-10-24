package cn.nokia.helloword.factory;

import cn.nokia.helloword.Car;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fan on 2017/10/22.
 */
public class InstanceFactory {

    public Map<String, Car> map;

    public InstanceFactory() {
        map = new HashMap<String, Car>();
        map.put("BMW", new Car("CHANGAN", "fORD", 120, 300000));
        map.put("BC", new Car("BEIQI", "Z200", 120, 300000));
    }

    public Car getCar(String car) {
        return map.get(car);
    }
}
