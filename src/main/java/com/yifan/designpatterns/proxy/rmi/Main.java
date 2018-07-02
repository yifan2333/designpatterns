package com.yifan.designpatterns.proxy.rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * @author wuyifan
 * @since 2018年01月26日
 */
public class Main {
    public static void main(String[] args) {
        // 用RMI Registry注册服务
        try {
            MyRemote service = new MyRemoteImpl();

            Naming.rebind("RemoteHello", service);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
