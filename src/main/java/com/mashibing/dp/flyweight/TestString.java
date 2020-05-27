package com.mashibing.dp.flyweight;

public class TestString {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");

        System.out.println(s1 == s2); //true
        System.out.println(s1 == s3); //false
        System.out.println(s3 == s4); //false

        /**
         *
         * 关于字符串String中的intern方法，是当前的字符对象（通过new出来的对象）可以使用intern方法从常量池中获取，
         *
         * 如果常量池中不存在该字符串，那么就新建一个这样的字符串放到常量池中。
         *
         * 　　使用常量池的方法一个是通过双引号定义字符串例如：String S = “1”；还有就是上面的intern方法。
         */
        System.out.println(s3.intern() == s1);
        System.out.println(s3.intern() == s4.intern());
    }
}
