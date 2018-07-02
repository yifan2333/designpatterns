package com.yifan.designpatterns.adapter;

/**
 * 需要实现想要转换的类型接口，也就是你的客户所期望看到的接口
 *
 * @author wuyifan
 * @since 2018年01月24日
 */
public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    /**
     * 需要取得要适配的对象引用，这里我们利用构造器取得这个引用
     * @param turkey turkey
     * @author wuyifan
     * @since 2018年1月24日
     */
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    /**
     * 实现接口的所有方法。quack()方法在类之间转换就很简单，只要调用gobble()方法就可以了。
     * @author wuyifan
     * @since 2018年1月24日
     */
    @Override
    public void quack() {
        turkey.gobble();
    }

    /**
     * 虽然两个接口都具备了fly()方法，
     * 火鸡的飞行距离很短，不像鸭子可以长途飞行。
     * 要让鸭子的飞行和火鸡飞行对应，必须连续调用五次火鸡的fly()来完成。
     * @author wuyifan
     * @since 2018年1月24日
     */
    @Override
    public void fly() {
        for (int i = 0; i < 5; i ++) {
            turkey.fly();
        }
    }
}
