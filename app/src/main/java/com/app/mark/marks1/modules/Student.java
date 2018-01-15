package com.app.mark.marks1.modules;

/**
 * Created by najjar on 10/23/17.
 */

public class Student {
    String name;
    double saveMark;
    double retriveMark;
    String time;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSaveMark(double saveMark){
        this.saveMark=saveMark;
    }
    public double getSaveMark(){
        return saveMark;
    }
    public void setRetriveMark(double retriveMark){
        this.retriveMark = retriveMark;
    }
    public double getRetriveMark(){
        return retriveMark;
    }
    public void setTime(String time){
        this.time= time;
    }
    public String getTime(){
        return  time;
    }
}
