package com.fisher.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fisher.service.impl.ImageServiceimpl;

@RestController
public class ImageController {
    
    @Autowired
    private ImageServiceimpl imageService;
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
}
