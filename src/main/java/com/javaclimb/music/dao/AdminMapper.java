package com.javaclimb.music.dao;

import org.springframework.stereotype.Repository;

// 管理员Dao
@Repository
public interface AdminMapper {
    // 判断密码是否正确
    public int verifyPassword(String username, String password);
}
