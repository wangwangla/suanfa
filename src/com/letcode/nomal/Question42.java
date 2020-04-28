package com.letcode.nomal;

import java.util.HashMap;
import java.util.List;
public class Question42 {
    /**
     * 邮箱是否相同
     * @param list
     */
    public void method(List<String> list){
        //遇到.忽略
        //遇到+，后面的忽略
        HashMap hashMap = new HashMap();
        for (String s : list) {
            String[] split = s.split("@");
            String name = split[0];
            String domain = split[1];
            name.replace(".","");
            int index = name.indexOf("+");
            name = name.substring(0,index);
            hashMap.put(name+domain,name+domain);
        }
        System.out.println(hashMap.size());
    }
}
