package com.company;

public class TableData {
    private String name;
    private String pos;
    private String school;
    private String meanSchool;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMeanSchool() {
        return meanSchool;
    }

    public void setMeanSchool(String meanSchool) {
        this.meanSchool = meanSchool;
    }

    public double calcAvrSchool(){
        return 0;
    }
}