package com.javaclimb.music.dao;

import com.javaclimb.music.domain.Singer;
import org.springframework.stereotype.Repository;

import java.util.List;

// 歌手Dao
@Repository
public interface SingerMapper {
    public int insert(Singer singer); // 增加

    public int update(Singer singer); // 修改

    public int delete(Integer id); // 删除

    public Singer selectByPrimaryKey(Integer id); // 根据主键查询整个对象

    public List<Singer> allSinger(); // 查询所有歌手

    public List<Singer> singerOfName(String name); // 根据歌手名字模糊查询列表
}
