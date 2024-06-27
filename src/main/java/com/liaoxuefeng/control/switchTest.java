package com.liaoxuefeng.control;

public class switchTest {
    public static void main(String[] args) {
        String fruit = "orange";
        int opt;
        switch (fruit) {
            case "apple":
                opt = 1;
                break;
            case "pear":
            case "mango":
                opt = 2;
                break;
            default:
                opt = 0;
                break;
        }
        System.out.println(opt);
    }
}
