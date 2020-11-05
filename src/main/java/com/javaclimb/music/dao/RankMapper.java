package com.javaclimb.music.dao;

import com.javaclimb.music.domain.Rank;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 评价Dao
 */
@Repository
public interface RankMapper {
    /**
     * 增加
     */
    public int insert(Rank rank);

    /**
     * 查询总分
     */
    public int selectScoreSum(Integer songListId);

    /**
     * 查询总评分人数
     */
    public int selectRankNum(Integer songListId);
}
















