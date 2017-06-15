package com.example.alterna.koordina;

/**
 * Created by ismaelgarzon on 6/6/17.
 */

public class Persona {

    private String mname ;
    private String mjob;
    private String mphone;
    private String memail;
    private int mimage;
    //constructor
    public Persona(String name, String job, String phone, String email, int image) {
        this.mname = name;
        this.mjob = job;
        this.mphone = phone;
        this.memail = email;
        this.mimage = image;
    }
    // getters and setters

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMjob() {
        return mjob;
    }

    public void setMjob(String mjob) {
        this.mjob = mjob;
    }

    public String getMphone() {
        return mphone;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone;
    }

    public String getMemail() {
        return memail;
    }

    public void setMemail(String memail) {
        this.memail = memail;
    }

    public int getMimage() {
        return mimage;
    }

    public void setMimage(int mimage) {
        this.mimage = mimage;
    }
}

