package com.fisher.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.assertj.core.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fisher.mapper.UserMapper;
import com.fisher.pojo.Image;
import com.fisher.pojo.User;
import com.fisher.service.ImageService;
import com.mysql.fabric.xmlrpc.base.Array;

@RestController
public class ImageController {
    
    @Autowired
    private ImageService imageService;
    //为了测试引入的
    @Autowired
    private UserMapper userMapper;
    /**
     * 从服务器获取图片的Api控制器
     * @param response
     * @param imagePath:在后台的存储路径:格式为:path/文件名.jpg:默认在resources文件夹下的images子文件夹中
     * @return
     */
    @RequestMapping("/getImage")
    public byte[] getImages(HttpServletResponse response,String path){
        System.out.println(path);
        return imageService.getImage(response, path);
    }
    
    @RequestMapping("test")
    public void test(){
        Image image=imageService.getImage(1);
    }
}
