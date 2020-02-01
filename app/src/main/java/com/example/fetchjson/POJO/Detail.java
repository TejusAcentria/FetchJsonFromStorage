package com.example.fetchjson.POJO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Detail {
    @SerializedName("id_card_no")
    @Expose
    private String idCardNo;
    @SerializedName("booth_number")
    @Expose
    private Integer boothNumber;
    @SerializedName("sno")
    @Expose
    private String sno;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("rname")
    @Expose
    private String rname;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("mobile")
    @Expose
    private Object mobile;
    @SerializedName("age")
    @Expose
    private Integer age;
    @SerializedName("house_no")
    @Expose
    private String houseNo;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("rtype")
    @Expose
    private String rtype;
    @SerializedName("pooling_station_name")
    @Expose
    private String poolingStationName;
    @SerializedName("id")
    @Expose
    private Integer id;

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public Integer getBoothNumber() {
        return boothNumber;
    }

    public void setBoothNumber(Integer boothNumber) {
        this.boothNumber = boothNumber;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Object getMobile() {
        return mobile;
    }

    public void setMobile(Object mobile) {
        this.mobile = mobile;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRtype() {
        return rtype;
    }

    public void setRtype(String rtype) {
        this.rtype = rtype;
    }

    public String getPoolingStationName() {
        return poolingStationName;
    }

    public void setPoolingStationName(String poolingStationName) {
        this.poolingStationName = poolingStationName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
