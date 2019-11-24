package com.zhangxiaofan.git;

/**
 * @author ZhangXiaoFan
 * @create 2019-11-24 21:54
 */
public class Birthday {
    private String year;
    private String mouth;
    private String day;

    public Birthday() {
    }

    public Birthday(String year, String mouth, String day) {
        this.year = year;
        this.mouth = mouth;
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMouth() {
        return mouth;
    }

    public void setMouth(String mouth) {
        this.mouth = mouth;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
