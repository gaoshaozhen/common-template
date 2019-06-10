package com.gs.interview.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HelloProxy implements InvocationHandler {
    private Object target;
    public HelloProxy(Object target) {
        this.target = target;
    }
    
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		 System.out.println("----代理前----");
	        Object result=method.invoke(target,args);
	        System.out.println("-----代理后----");
	        return result;
	}
}