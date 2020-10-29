package com.javaclimb.music.domain;

import java.io.Serializable;


// 歌曲歌单
public class ListSong implements Serializable {

    private Integer id;

    private Integer singId; // 歌曲id

    private Integer songListId; // 歌单id

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSingId() {
        return singId;
    }

    public void setSingId(Integer singId) {
        this.singId = singId;
    }

    public Integer getSongListId() {
        return songListId;
    }

    public void setSongListId(Integer songListId) {
        this.songListId = songListId;
    }
}
