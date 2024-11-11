package com.example.hethongthuenha.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class MapVn{
    @SerializedName("Id")
    public String id;
    @SerializedName("Name")
    public String name;
    @SerializedName("Districts")
    public ArrayList<District> districts;
}