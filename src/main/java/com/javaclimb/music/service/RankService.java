package com.javaclimb.music.service;

import com.javaclimb.music.domain.Rank;

/**
 * 评价service接口
 */
public interface RankService {
    /**
     * 增加
     */
    public boolean insert(Rank rank);

    /**
     * 查询总分
     */
    public int selectScoreSum(Integer songListId);

    /**
     * 查询总评分人数
     */
    public int selectRankNum(Integer songListId);

    /**
     * 计算平均分
     */
    public int rankOfSongListId(Integer songListId);
}
