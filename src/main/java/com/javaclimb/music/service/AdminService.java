package com.javaclimb.music.service;

// 管理员service接口
public interface AdminService {
    // 判断密码是否正确
    public boolean verifyPassword(String username, String password);
}
