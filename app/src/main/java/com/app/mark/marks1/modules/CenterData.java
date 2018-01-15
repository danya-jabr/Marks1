package com.app.mark.marks1.modules;

import java.util.ArrayList;

/**
 * Created by najjar on 10/22/17.
 */

public class CenterData {

    String teacherName;
    String helperName;
    String managerName;
    String centerName;
    String locationName;
    int generationNumber;
    char section;

    public ArrayList<CenterData> list = new ArrayList<>();

    public void setTeacherName(String teacherName){
        this.teacherName=teacherName;
    }
    public String getTeacherName(){
        return teacherName;
    }
    public void setHelperName(String helperName){
        this.helperName=helperName;
    }
    public String getHelperName(){
        return helperName;
    }
    public void setManagerName(String managerName){
        this.managerName=managerName;
    }
    public String getManagerName(){
        return managerName;
    }
    public void setCenterName(String centerName){
        this.centerName=centerName;
    }
    public String getCenterName(){
        return centerName;
    }
    public void setLocationName(String locationName){
        this.locationName=locationName;
    }
    public String getLocationName(){
        return locationName;
    }
    public void setGenerationNumber(int generationNumber){
        this.generationNumber=generationNumber;
    }
    public int getGenerationNumber(){
        return generationNumber;
    }
    public void setSection(char section){
        this.section=section;
    }
    public char getSection(){
        return section;
    }
}
