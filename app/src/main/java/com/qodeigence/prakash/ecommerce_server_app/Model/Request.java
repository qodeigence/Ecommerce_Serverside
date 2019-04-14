package com.qodeigence.prakash.ecommerce_server_app.Model;

import java.util.List;

public class Request {
    private String phone;
    private String name;
    private String address;
    private String status;
    private String total;
    private String comment;
    private List<Order> foods; //List of food order

    public Request() {
    }

    public Request(String phone, String name, String address, String status, String total, String comment, List<Order> foods) {
        this.phone = phone;
        this.name = name;
        this.address = address;
        this.status = status;
        this.total = total;
        this.comment = comment;
        this.foods = foods;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<Order> getFoods() {
        return foods;
    }

    public void setFoods(List<Order> foods) {
        this.foods = foods;
    }
}
