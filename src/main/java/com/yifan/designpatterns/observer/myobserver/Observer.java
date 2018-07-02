package com.yifan.designpatterns.observer.myobserver;

/**
 * 观察者接口
 * @author wuyifan
 * @since 2018年01月10日
 */
public interface Observer {
    /**
     * 更新观察者信息
     * @param temp temp
     * @param humidity humidity
     * @param pressure pressure
     * @return void
     * @author wuyifan
     * @since 2018年1月10日
     */
    void update(float temp, float humidity, float pressure);
}
