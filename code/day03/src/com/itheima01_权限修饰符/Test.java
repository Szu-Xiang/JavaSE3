package com.itheima01_权限修饰符;

/*
1.分类
	public	：公共的。任意范围可以访问
	protected ：受保护的。同一个包 或 不同包下的子类。
	(default) ：默认的。同一个包可以访问。
	private   ：私有的。同一个类可以访问。
2.常用规则
	类:public   默认 ，一般用public。
	类中成员:public   protected   默认  private 四种都可以使用。
		成员内部类 ：一般用 private，隐藏细节。
		修饰成员变量 ：一般用 private，隐藏细节。
		修饰成员方法：一般用public，方便调用方法
		修饰构造方法：一般用public ，方便创建对象

示例：根据如下分类演示不同权限修饰符修饰变量的使用
    包A
        Fu类     父类
        ZiA类    同包子类
        OthoerA类    同包与父类无关的类
    包B
        ZiB类    不同包子类
        OthoerB类    不同包与父类无关的类

 */
public class Test {
    public static void main(String[] args) {

    }
}
