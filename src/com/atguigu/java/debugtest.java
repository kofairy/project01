package com.atguigu.java;

import java.util.HashMap;

/**
 * @AUTHOR null
 * @TIME 2022-03-23 15:24:30
 */
public class debugtest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "tom");
        map.put("school", "tsinghua");
        map.put("age", "12");
        map.put("major", "computer");

        String age = map.get("age");
        System.out.println("age is " + age);
        map.remove("major");
        System.out.println(map);

    }
}
