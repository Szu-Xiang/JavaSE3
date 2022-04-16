package com.itheima03_Stream;

/*

1.概述
    终结方法：返回值类型不再是Stream接口的方法，支持链式调用。
    非终结方法(函数拼接方法)：返回值类型仍然是Stream接口的方法，不支持链式调用。

2.方法介绍：
    方法名	作用	        分类	    链式	    详解
    count	统计个数	    终结	    否	    longcount()返回流中的元素个数。
    forEac	逐一处理	    终结	    否	    voidforEach(Consumer<?superT>action)对此流的每个元素进行操作
    filter	过滤	        非终结	是	    Stream<T>filter(Predicate<?superT>predicate)返回经过筛选，满足的条件的元素组成的流
    limit	取前n个	    非终结	是	    Stream<T>limit(longmaxSize)返回由此流(包含)第maxSize个之前的元素组成的流
    skip	跳过前n个	非终结	是	    Stream<T>skip(longn)返回由此流(不含)第n个之后元素组成的流
    map	    映射	        非终结	是	    <R>Stream<R>map(Function<?superT,?extendsR>mapper)
          	          	       	  	    返回流中旧元素经指定规则转换后的心元素组成的流
    concat	组合	        非终结	是	    static<T>Stream<T>concat(Stream<?extendsT>a,Stream<?extendsT>b)
    				                    返回将两个流中的元素合并到一其组成的流

需求:演示 Stream流常用功能
*/
public class Test_03Stream常用功能 {
    public static void main(String[] args) {

    }
}
