package com.example.mathpresso.togethermju.model;

import java.util.ArrayList;

/**
 * Created by donghyuk on 2016. 11. 17..
 */
public class User {
    String rid;
    String email;
    String password;
    String gender;
    String birth;
    String major;
    String name;
    ArrayList<String> interest;



    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }



    public void setRid(String rid) {
        this.rid = rid;
    }
    public String getRid() {
        return this.rid;
    }



    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }



    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return this.password;
    }



    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return this.gender;
    }



    public void setBirth(String birth) {
        this.birth = birth;
    }
    public String getBirth() {
        return this.birth;
    }



    public void setMajor(String major) {
        this.major = major;
    }
    public String getMajor() {
        return this.major;
    }



    public void setFavorite(ArrayList<String> interest) {
        this.interest = interest;
    }
    public ArrayList<String> getFavorite() {
        return this.interest;
    }
}
