package com.itheima03_Map;

/*
Map概述
    1.介绍
    	java.util.Map双列集合的顶层接口，用来存储具备映射关系对象的集合接口定义。
    	Map集合中存储的内容根据映射关系分为两部分，称为键值对。
    2.特点
    	每个键只能对应一个值。
    	键(Key)不能重复，值(Value)可以重复；
    3.Map与Collection区别
    	Collection集合中的元素，是以单个的形式存储。称为单列集合
    	Map集合中的元素，是以键值对的形式存储。称为双列集合
Map基本使用
    1.常见子类
    	java.util.HashMap：哈希表结构集合
     		java.util.LinkedHashMap：链表结构集合
    	java.util.TreeMap：树结构集合。
    2.常用方法
    	public V put(K key, V value):  把指定的键与值添加到Map集合中
    		若键(key)在集合中不存在，添加键值对到集合中，返回null
    		若键(key)在集合中存在，键不变，原值被替换，并返回原值。
    	public V remove(Object key): 把指定的键对应的键值对元素在Map集合删除，返回被删除元素的值
    	public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
    	public Set<K> keySet(): 获取Map集合中所有的键，存储到Set集合中。
    	public Set<Map.Entry<K,V>> entrySet(): 获取到Map集合中所有的键值对对象的集合(Set集合)。
    	public boolean containKey(Object key):判断该集合中是否有此键。
需求:通过HashMap演示Map集合常用方法

 */
public class Test_01_Map基本使用 {
    public static void main(String[] args) {

    }
}
