package com.javaclimb.music.dao;

import com.javaclimb.music.domain.SongList;
import org.springframework.stereotype.Repository;

import java.util.List;

// 歌单Dao

@Repository

public interface SongListMapper {
    public int insert(SongList songList); // 增加

    public int update(SongList songList); // 修改

    public int delete(Integer id); // 删除

    public SongList selectByPrimaryKey(Integer id); // 根据主键查询整个对象

    public List<SongList> allSongList(); // 查询所有歌单

    public List<SongList> songListOfTitle(String title); // 根据标题精确查询歌单列表

    public List<SongList> likeTitle(String title); // 根据标题模糊查询歌单列表

    public List<SongList> likeStyle(String style); // 根据风格模糊查询歌单列表

}
