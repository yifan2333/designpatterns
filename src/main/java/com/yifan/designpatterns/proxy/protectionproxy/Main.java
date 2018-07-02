package com.yifan.designpatterns.proxy.protectionproxy;

import java.lang.reflect.Proxy;

/**
 * @author wuyifan
 * @since 2018年01月29日
 */
public class Main {


    PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    public void drive() {
    }
}
