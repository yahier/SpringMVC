package com.cenyol.example.vo;

public class BaseRes {

    public int code = 200;
    public String msg = "操作成功";

    public BaseRes() {

    }

    public BaseRes(String msg) {
        this.code = 201;
        this.msg = msg;
    }
}
