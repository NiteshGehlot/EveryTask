package com.springannotations.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("books1")
@Scope("prototype")
public class Books {
    private int bid;
    private String bname;
    private String btype;
    private double bprice;

    @Autowired

    private Product pname;

    public Product getPname(){
        return pname;
    }

    public void setPname(Product pname){
        this.pname = pname;
    }

    public Books(){

    }

    public Books(int bid, String bname, String btype, double bprice) {
        this.bid = bid;
        this.bname = bname;
        this.btype = btype;
        this.bprice = bprice;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBtype() {
        return btype;
    }

    public void setBtype(String btype) {
        this.btype = btype;
    }

    public double getBprice() {
        return bprice;
    }

    public void setBprice(double bprice) {
        this.bprice = bprice;
    }
}
