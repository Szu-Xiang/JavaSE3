package com.itheima02_jdk8新特性;

/*
Base64概述
    1.概述
        Base64是用于传输8Bit字节码最常见的编码方式之一，是一种基于64个可打印字符来表示二进制数据的方法。
        Java8中，增加了java.util.Base64类，该类内置了Encode(编码)和Decoder(解码)两个类,并提供了3中编解码方式。
    2.编解码方式分类
            Basic:输出被映射到一组字符A-Za-z0-9+/，编码不添加任何行标，输出的解码仅支持A-Za-z0-9+/。
            MIME:输出隐射到MIME友好格式。输出每行不超过76字符，并且使用'\r'并跟随'\n'作为分割。编码输出最后没有行分割。
            URL:输出映射到一组字符A-Za-z0-9+_，输出是URL和文件。
            编码和解码操作需要保持对应，怎么样编码，就怎么样解码。
Base64API
    1.获取编解码对象
        通过Bases64类中的静态方法，可以获取Encode和Decoder对象。
        static Encoder getEncoder()       :获取Basic编码器
        static Decoder getDecoder()       :获取Basic解码器
        static Encoder getMimeEncoder()   :获取MIME编码器
        static Decoder getMimeDecoder()   :获取MIME解码器
        static Encoder getUrlEncoder()    :获取Url编码器
        static Decoder getUrlDecoder()    :获取Url解码器
    2.Encoder编码方法
        String encodeToString(byte[] src)
    3.Decoder解码方法
        byte[] decode(String src)
需求:分别使用"itheima?中国"、"itheima?java"、"123...100"演示三种编解码。
 */
 public  class Test_02Base64编解码 {
    public static void main(String[] args) {

    }
}
