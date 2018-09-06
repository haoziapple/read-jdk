package com.haozi.proxy.basejdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author wanghao
 */
public class JdkProxy implements InvocationHandler {
    private Object target;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println("Before say hello");
        Object result = method.invoke(target, args);
        System.out.println("After say hello");
        return result;
    }

    public Object getProxy(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    public static void main(String[] args) {
        Person p = new Student();
        JdkProxy proxy = new JdkProxy();
        Person p2 = (Person) proxy.getProxy(p);
        p2.sayHello();
    }
}
