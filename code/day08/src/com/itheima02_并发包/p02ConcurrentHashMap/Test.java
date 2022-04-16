package com.itheima02_并发包.p02ConcurrentHashMap;

/*
1.概述:
	HashMap在多线程环境下，存储数据,会导致数据错乱，属于并发线程不安全安全问题
	Hashtable是一个线程安全的类，可以保障线程并发中的安全问题但是效率低下
	ConcurrentHashMap是一个并发类，可以保障线程并发中的安全问题，效率相对较高。
2.ConcurrentHashMap与Hashtable区别
	HashTable效率低下原因：全局synchronized锁定 见《Hashtable锁示意图》
	ConcurrentHashMap高效的原因：CAS + 局部synchronized锁定见《ConcurrentHashMap锁示意图》

需求:使用两个线程，向上述三种集合，各添加数据500000次，预期结果1000000个键值对数据。

*/
public class Test {
    public static void main(String[] args) {

    }
}
