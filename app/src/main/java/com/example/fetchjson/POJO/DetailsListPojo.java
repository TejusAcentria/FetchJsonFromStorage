package com.example.fetchjson.POJO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class DetailsListPojo {
    @SerializedName("Details")
    @Expose
    private List<Detail> details = null;

    public List<Detail> getDetails() {
        return details;
    }

    public void setDetails(List<Detail> details) {
        this.details = details;
    }

}
