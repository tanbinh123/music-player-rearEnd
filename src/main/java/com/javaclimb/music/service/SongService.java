package com.javaclimb.music.service;

import com.javaclimb.music.domain.Song;

import java.util.List;

// 歌曲service接口
public interface SongService {
    public boolean insert(Song song); // 增加

    public boolean update(Song song); // 修改

    public boolean delete(Integer id); // 删除

    public Song selectByPrimaryKey(Integer id); // 根据主键查询整个对象

    public List<Song> allSong(); // 查询所有歌曲

    public List<Song> songOfName(String name); // 根据歌曲名字模糊查询列表

    public List<Song> songOfSingerId(Integer singerId); // 根据歌手id查询
}
