package com.atguigu.java;

import com.java.Customer;

public class HelloWorld {
    private int a;
    private String id;
    private String name;
    private Integer age;
    public static final Customer cus=new Customer();

    public static void main(String[] args) {
        String[] c=new String[]{"liu","gg","ss"};
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);

        }
        for (String s : c) {
            System.out.println(s);

        }


    }



    public void setA(int a) {

        this.a = a;
        this.a = 5;
        StringBuilder sb = new StringBuilder();


    }
}
