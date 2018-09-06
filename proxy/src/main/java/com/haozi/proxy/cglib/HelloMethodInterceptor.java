package com.haozi.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class HelloMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Before:" + method.getName());
        Object object = methodProxy.invokeSuper(o, objects);
        System.out.println("After:" + method.getName());
        return object;
    }

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        //继承被代理类
        enhancer.setSuperclass(HelloServiceImpl.class);
        //设置回调
        enhancer.setCallback(new HelloMethodInterceptor());
        //生成代理类对象
        HelloServiceImpl helloService = (HelloServiceImpl) enhancer.create();
        //调用代理类方法时，会被我们的方法拦截器拦截
        helloService.sayHello();
    }
}
