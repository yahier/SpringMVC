package com.cenyol.example.controller;


import com.cenyol.example.vo.BaseRes;

public class BaseController {
    public BaseRes outSuccess() {
        return new BaseRes();
    }

    public BaseRes outFailed(String msg) {
        return new BaseRes(msg);

    }


}
