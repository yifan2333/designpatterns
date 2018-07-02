package com.yifan.designpatterns.proxy.protectionproxy;

/**
 * @author wuyifan
 * @since 2018年01月29日
 */
public interface PersonBean {

    String getName();

    String getGender();

    String getInterests();

    int getHotOrNotRating();

    void setName(String name);

    void setGender(String gender);

    void setInterests(String interests);

    void setHotOrNotRating(int rating);
}
