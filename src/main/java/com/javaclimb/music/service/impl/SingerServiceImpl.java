package com.javaclimb.music.service.impl;

import com.javaclimb.music.dao.SingerMapper;
import com.javaclimb.music.domain.Singer;
import com.javaclimb.music.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// 歌手service实现类

@Service

public class SingerServiceImpl implements SingerService {

    @Autowired
    private SingerMapper singerMapper;

    @Override
    public boolean insert(Singer singer) {
        return singerMapper.insert(singer)>0;
    }

    @Override
    public boolean update(Singer singer) {
        return singerMapper.update(singer)>0;
    }

    @Override
    public boolean delete(Integer id) {
        return singerMapper.delete(id)>0;
    }

    @Override
    public Singer selectByPrimaryKey(Integer id) {
        return singerMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Singer> allSinger() {
        return singerMapper.allSinger();
    }

    @Override
    public List<Singer> singerOfName(String name) {
        return singerMapper.singerOfName(name);
    }

    @Override
    public List<Singer> singerOfSex(Integer sex) {
        return singerMapper.singerOfSex(sex);
    }
}
