package com.bridgelabz.helloworld;

public class Student {

    private String fname;
    private int rollno;
    private boolean active;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }


    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getFname(){
        return fname;

    }


    public void setFname(String fname) {
        this.fname = fname;
    }
}
