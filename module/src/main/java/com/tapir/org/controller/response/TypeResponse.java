package com.tapir.org.controller.response;

import com.tapir.org.model.BasicType;

public class TypeResponse {

    private Long code;
    private String msg;

    public TypeResponse() {
    }

    public TypeResponse(BasicType bt) {
        this.code = bt.getId();
        this.msg = bt.getMensaje();
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
