package com.yifan.designpatterns.proxy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 1、扩展java.rmi.Remote
 * @author wuyifan
 * @since 2018年01月26日
 */
public interface MyRemote extends Remote {
    /**
     * 生命所有的方法都会抛出java.rmi.RemoteException
     * 客户使用远程接口调用服务。换句话说，客户会调用实现远程接口的Stub上的方法，而Stub底层用到了网络和I/O,所以各种坏事情都可能会发生。
     * 确定变量和返回值是属于原语（primitive）类型或者可序列化（Serializable）类型
     * @return java.lang.String
     * @author wuyifan
     * @since 2018年1月26日
     */
    String sayHello() throws RemoteException;
}
