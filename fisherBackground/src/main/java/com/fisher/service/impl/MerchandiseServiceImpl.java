package com.fisher.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisher.mapper.CommentMapper;
import com.fisher.mapper.DescribeMapper;
import com.fisher.mapper.MerchandiseMapper;
import com.fisher.pojo.Comment;
import com.fisher.pojo.Describe;
import com.fisher.pojo.Image;
import com.fisher.pojo.Merchandise;
import com.fisher.service.ImageService;
import com.fisher.service.MerchandiseService;
@Service
public class MerchandiseServiceImpl implements MerchandiseService{

    @Autowired
    private MerchandiseMapper merchandiseMapper;
    @Autowired
    private CommentMapper commentMapper;
    //因为image在service中涉及到path信息的注入,所以在这注入service更合适
    @Autowired
    private ImageService imageService;
    @Autowired
    private DescribeMapper describeMapper;
    @Override
    public Merchandise getMerchandise(int merchandiseId) {
        // TODO Auto-generated method stub
        Merchandise merchandise=merchandiseMapper.selectByPrimaryKey(merchandiseId);
        //注入商品的其他属性
        List<Comment>comments=commentMapper.SelectCommentByMerchandiseKey(merchandiseId);
        merchandise.setComment(comments);
        Image image=imageService.getImage(merchandiseId);
        merchandise.setImage(image);
        Describe describe=describeMapper.selectByMerchandiseKey(merchandiseId);
        merchandise.setDescribe(describe);
        return merchandise;
    }

    @Override
    public List<Merchandise> getMerchandises(Merchandise merchandise) {
        // TODO Auto-generated method stub
        List <Merchandise> merchandises=merchandiseMapper.selectBykeyWords(merchandise);
        return null;
    }

}
