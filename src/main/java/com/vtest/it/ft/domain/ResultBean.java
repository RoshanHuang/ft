package com.vtest.it.ft.domain;

import java.io.Serializable;

public class ResultBean implements Serializable {
    private String name;
    private String result;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
