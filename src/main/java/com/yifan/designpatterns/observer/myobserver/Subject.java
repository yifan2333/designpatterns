package com.yifan.designpatterns.observer.myobserver;

/**
 * 主题
 * @author wuyifan
 * @since 2018年01月10日
 */
public interface Subject {
    /**
     * 注册观察者
     * @param o o
     * @return void
     * @author wuyifan
     * @since 2018年1月10日
     */
    void registerObserver(Observer o);
    /**
     * 移除观察者
     * @param o o
     * @return void
     * @author wuyifan
     * @since 2018年1月10日
     */
    void removeObserver(Observer o);
    /**
     * 当主题状态发生改变时，该方法，以通知所有的观察者
     * @return void
     * @author wuyifan
     * @since 2018年1月10日
     */
    void notifyObserver();
}
