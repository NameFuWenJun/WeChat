package com.fisher.mapper;

import java.util.List;

import com.fisher.pojo.Merchandise;

public interface MerchandiseMapper {
    int deleteByPrimaryKey(Integer merchandiseId);

    int insert(Merchandise record);

    int insertSelective(Merchandise record);

    Merchandise selectByPrimaryKey(Integer merchandiseId);

    int updateByPrimaryKeySelective(Merchandise record);

    int updateByPrimaryKey(Merchandise record);

    List<Merchandise> selectBykeyWords(Merchandise merchandise);
}