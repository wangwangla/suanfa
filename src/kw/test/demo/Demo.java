package kw.test.demo;

import java.util.HashMap;
import java.util.Objects;

public class Demo {
    public static void main(String[] args) {
        String name = "AAA";
//        name.intern();
//        String name1 = name.intern();
//        String d = "AAA";
//        System.out.println(name == d);
//        Object b = new Object();
//        b.hashCode();
//
        //这个没有什么问题，但是如果使用hashmap，加入散列之后到类同一个槽里面了，就会比较equals，如果相同就不会保存
        Demo demo = new Demo();
//        //默认使用的时地址来计算处hash值
//        System.out.println(demo.hashCode());
        Demo demo1 = new Demo();
        System.out.println(demo1.hashCode());
        System.out.println(demo.hashCode());
//        HashMap
//        Objects.hash();
//        String str = new String("AAA");
//        String str1 = new String("AAA");
//        System.out.println(str + "   "+ str1);
//        System.out.println(str.hashCode());
//        System.out.println(str1.hashCode());
//
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
