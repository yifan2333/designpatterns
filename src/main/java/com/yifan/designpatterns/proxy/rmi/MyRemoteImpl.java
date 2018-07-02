package com.yifan.designpatterns.proxy.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 扩展UnicastRemoteObject，
 * 为了要成为远程服务对象，
 * 此对象需要某些远程的功能。
 * 最简单的方式扩展java.rmi.server.UnicastRemoteObject，让超类帮忙做这些工作。
 * @author wuyifan
 * @since 2018年01月26日
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    /**
     * 设计一个不带变量的构造器，声明RemoteException。
     * UnicastRemoteObject的构造器会抛出RemoteException.所以它的子类的构造器也需要抛出RemoteException
     * @author wuyifan
     * @since 2018年1月26日
     */
    public MyRemoteImpl() throws RemoteException{}
    @Override
    public String sayHello() throws RemoteException {
        return "Service says, 'Hey'";
    }
}
