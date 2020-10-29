package com.javaclimb.music.domain;

import java.io.Serializable;
import java.util.Date;

// 歌单
public class SongList implements Serializable {
    private Integer id; // 主键
    private String title; // 标题
    private String pic; // 图片
    private String introduction; // 简介
    private String style; // 风格

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
