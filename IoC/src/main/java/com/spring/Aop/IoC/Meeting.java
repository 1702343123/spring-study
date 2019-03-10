package com.spring.Aop.IoC;

import java.util.List;

/**
 * Created by Administrator on 2019/3/4.
 */
public class Meeting {
    private String theme;
    private List<Boss> bosses;

    public Meeting(String theme, List<Boss> bosses) {
        this.theme = theme;
        this.bosses = bosses;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public List<Boss> getBosses() {
        return bosses;
    }

    public void setBosses(List<Boss> bosses) {
        this.bosses = bosses;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "theme='" + theme + '\'' +
                ", bosses=" + bosses +
                '}';
    }
}
