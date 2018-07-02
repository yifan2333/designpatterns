package com.yifan.designpatterns.compositepattern.iterator;

/**
 * @author wuyifan
 * @since 2018年01月25日
 */
public interface Iterator<T> {

    boolean hasNext();

    T next();
}
