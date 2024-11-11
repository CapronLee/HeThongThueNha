package com.example.hethongthuenha.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class District {
    @SerializedName("Id")
    public String id;
    @SerializedName("Name")
    public String name;
    @SerializedName("Wards")
    public ArrayList<Ward> wards;


    @Override
    public String toString() {
        return "District{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", wards=" + wards +
                '}';
    }
}