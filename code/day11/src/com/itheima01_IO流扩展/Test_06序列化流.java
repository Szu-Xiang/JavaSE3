package com.itheima01_IO流扩展;

import java.io.IOException;

/*
序列化概述
    1.介绍
    	Java提供了一种对象序列化(输出)和反序列化(输入)的机制。
    	序列化：将对象的类型，成员变量，方法等转为字节序列，写出到文件，吃就保存对象信息。
    	反序列化：将存储的对象的序列化字节数据，从文件中读取到内存中，重构对象。。
    2.序列化条件
    	需要被序列化的对象，定义类时需实现java.io.Serializable标记接口，否则在运行时会产生NotSerializableException异常。
    	定义的类，所有成员变量默认可序列化。
    	如果某成员变量不想序列化，须注明瞬态transient关键字修饰，被修饰的成员变量不会被转为字节序列。
序列化流
    1.概述
	    java.io.ObjectOutputStream类(序列化流)，将Java对象的原始数据类型写出到文件,实现对象的持久存储。
    2.构造方法
    	public ObjectOutputStream(OutputStream out) ： 创建一个指定序列化流对象，需要传入一个字节输出流对象。
    3.常用方法
    	public final void writeObject (Object obj) : 将指定的对象以字节方式写出到指定文件中。
反序列化流
    1.概述
    	ObjectInputStream类(反序列化流)，将使用ObjectOutputStream序列化的原始数据恢复为对象。
    2.构造方法
    	public ObjectInputStream(InputStream in) ： 创建一个指定反序列化流对象，需要传入一个字节输入流对象。
    3.常用方法
    	public final Object readObject () : 从指定的路径，读取一个对象的字节数据，并返回该对象。。
    4.注意事项
    ​	反序列化时，如果找不到class文件(class文件丢失或位置改变),抛出ClassNotFoundException异常。
    		解决办法:避免移动，或移动后重新序列化。
    	反序列化时，如果class有父类，父类未序列化且没提供无参构造(序列化可以不提供),抛出InvalidClassException异常。
    		解决办法:要序列化的父类也实现序列化接口。
    	反序列化时，如果序列化后class文件版本号改变(默认类的内容,改变版本号随之改变),抛出InvalidClassException异常。
    		解决办法:固定要序列化的类的版本号 public static final serialVersionUID=值;
需求:通过如下类演示对象的序列化与反序列化操作
    员工
	    属性：姓名，地址，年龄(不想被存储到文件中)
	    行为：查验地址
 */
 public  class Test_06序列化流{
    public static void main(String[] args) throws IOException, ClassNotFoundException {

    }
}
