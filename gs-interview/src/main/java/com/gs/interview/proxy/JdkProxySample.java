package com.gs.interview.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxySample {

	public static void main(String[] args) {
		  //实例化被代理对象
		HelloInterfece helloInterfece = new HelloInterfeceImpl();
        //实例化代理对象
        HelloProxy helloProxy = new HelloProxy(helloInterfece);
        //建立代理关系
        HelloInterfece helloInterfeceImpl = (HelloInterfece) Proxy.newProxyInstance(helloInterfece.getClass().getClassLoader(), helloInterfece.getClass().getInterfaces(), helloProxy);
        //调用方法
        helloInterfeceImpl.sayHello();
      
	}
}
