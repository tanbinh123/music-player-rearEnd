package com.javaclimb.music.service;

import com.javaclimb.music.domain.SongList;

import java.util.List;

// 歌单service接口
public interface SongListService {
    public boolean insert(SongList songList); // 增加

    public boolean update(SongList songList); // 修改

    public boolean delete(Integer id); // 删除

    public SongList selectByPrimaryKey(Integer id); // 根据主键查询整个对象

    public List<SongList> allSongList(); // 查询所有歌手

    public List<SongList> songListOfTitle(String title); // 根据歌手名字模糊查询列表

    public List<SongList> likeTitle(String title); // 根据标题模糊查询歌单列表

    public List<SongList> likeStyle(String style); // 根据性别查询
}
