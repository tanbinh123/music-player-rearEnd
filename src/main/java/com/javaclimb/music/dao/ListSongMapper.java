package com.javaclimb.music.dao;

import com.javaclimb.music.domain.ListSong;
import org.springframework.stereotype.Repository;

import java.util.List;

// 歌曲歌单Dao
@Repository
public interface ListSongMapper {
    public int insert(ListSong listSong); // 增加

    public int update(ListSong listSong); // 修改

    public int delete(Integer id); // 删除

    public int deleteBySongIdAndSongListId(Integer songId, Integer songListId); // 根据歌曲id和歌单id删除

    public ListSong selectByPrimaryKey(Integer id); // 根据主键查询整个对象

    public List<ListSong> allListSong(); // 查询所有歌曲


    public List<ListSong> listSongOfSongListId(Integer songListId); // 根据歌手id查询
}
