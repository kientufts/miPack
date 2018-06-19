package net.j2ee.mipack.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.text.SimpleDateFormat;
import java.util.Date;

@ManagedBean
@SessionScoped
public class TimeController {
    private String hour;
    private String day;

    public void showHour(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormatHour = new SimpleDateFormat("hh:mm:ss a");
        hour = simpleDateFormatHour.format(date);
    }

    public void showDay(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormatDay = new SimpleDateFormat("EEEE - MMMMM dd");
        day = simpleDateFormatDay.format(date);
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
