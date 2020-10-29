package com.javaclimb.music.service;

import com.javaclimb.music.domain.ListSong;

import java.util.List;

// 歌单歌曲service接口
public interface ListSongService {
    public boolean insert(ListSong listSong); // 增加

    public boolean update(ListSong listSong); // 修改

    public boolean delete(Integer id); // 删除

    public boolean deleteBySongIdAndSongListId(Integer songId, Integer songListId); // 根据歌曲id和歌单id删除


    public ListSong selectByPrimaryKey(Integer id); // 根据主键查询整个对象

    public List<ListSong> allListSong(); // 查询所有歌单里面的歌曲

    public List<ListSong> listSongOfSongListId(Integer songListId); // 根据歌单id查询所有的歌曲
}
