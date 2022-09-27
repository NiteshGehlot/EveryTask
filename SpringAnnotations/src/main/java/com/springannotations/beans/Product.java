package com.springannotations.beans;

import org.springframework.stereotype.Component;


public class Product {
    private int pname;

    public Product(int pname) {
        this.pname = pname;
    }

    public int getPname() {
        return pname;
    }

    public void setPname(int pname) {
        this.pname = pname;
    }
}
