package cn.zizle.se.day181113.demoReflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflectTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }

    public Object reflect() {
        ReflectServiceImpl object = null;
        try {
            object = (ReflectServiceImpl)
                    Class.forName("cn.zizle.day181113.demoReflect.ReflectServiceImpl").newInstance();
            Method method = object.getClass().getMethod("sayHello", String.class);
            method.invoke(object, "张三");
        } catch (NoSuchMethodException | SecurityException | ClassNotFoundException | IllegalAccessException
                | IllegalArgumentException | InvocationTargetException | InstantiationException ex) {
            ex.printStackTrace();
        }
        return object;
    }
}