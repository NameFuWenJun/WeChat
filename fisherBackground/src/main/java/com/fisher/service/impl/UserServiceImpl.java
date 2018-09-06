package com.fisher.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisher.mapper.UserMapper;
import com.fisher.pojo.User;
import com.fisher.service.UserService;

@Service
public class UserServiceImpl implements UserService{
    
    @Autowired
    private UserMapper userMapper;
    
    @Override
    public int deleteByPrimaryKey(Integer userId) {
        // TODO Auto-generated method stub
        return userMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int insert(User record) {
        // TODO Auto-generated method stub
        userMapper.setCharsetToUtf8mb4();
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        // TODO Auto-generated method stub
        userMapper.setCharsetToUtf8mb4();
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(Integer userId) {
        // TODO Auto-generated method stub
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        // TODO Auto-generated method stub
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        // TODO Auto-generated method stub
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public User selectByOpenid(String openId) {
        // TODO Auto-generated method stub
        return userMapper.selectByOpenid(openId);
    }
    
}
