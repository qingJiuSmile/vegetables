package com.fragment.use.vegetables.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Fragment {
    private Integer id;

    private String name;

    private String haveFragment;

    private String exchange;

    private Integer pageSize;

    private  Integer pageNum;

    private  String email;

    private LocalDateTime dateTime;

    private String cardNo;

    private String studentName;

    private String userNo;


    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @ApiModelProperty(value = "错误描述")
    private String errDepiction;

    @ApiModelProperty(value = "设备IP")
    private String devIp;

    public String getErrDepiction() {
        return errDepiction;
    }

    public void setErrDepiction(String errDepiction) {
        this.errDepiction = errDepiction;
    }

    public String getDevIp() {
        return devIp;
    }

    public void setDevIp(String devIp) {
        this.devIp = devIp;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Timestamp date;

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Integer getPageSize() {
        pageSize=10;
            return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
       pageNum= pageNum== null?1:pageNum;
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getHaveFragment() {
        return haveFragment;
    }

    public void setHaveFragment(String haveFragment) {
        this.haveFragment = haveFragment == null ? null : haveFragment.trim();
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange == null ? null : exchange.trim();
    }

    @Override
    public String toString() {
        return "Fragment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", haveFragment='" + haveFragment + '\'' +
                ", exchange='" + exchange + '\'' +
                ", pageSize=" + pageSize +
                ", pageNum=" + pageNum +
                ", email='" + email + '\'' +
                ", date=" + date +
                '}';
    }
}