package com.javaclimb.music.service;

import com.javaclimb.music.domain.Singer;

import java.util.List;

// 歌手service接口
public interface SingerService {
    public boolean insert(Singer singer); // 增加

    public boolean update(Singer singer); // 修改

    public boolean delete(Integer id); // 删除

    public Singer selectByPrimaryKey(Integer id); // 根据主键查询整个对象

    public List<Singer> allSinger(); // 查询所有歌手

    public List<Singer> singerOfName(String name); // 根据歌手名字模糊查询列表

    public List<Singer> singerOfSex(Integer sex); // 根据性别查询
}
