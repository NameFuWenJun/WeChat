package com.fisher.service;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.fisher.utils.ImageUtiles;

@Service
public class ImageService {
    
    public byte [] getImage(HttpServletResponse response,String imagePath){
        byte [] data=ImageUtiles.getImages(imagePath);
        response.setContentType("image/jpeg");  // 设置返回的文件类型  
        try {
            OutputStream toClient = response.getOutputStream();
            toClient.write(data); // 输出数据  
            toClient.close();  
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } // 得到向客户端输出二进制数据的对象  
        return data;
    }
}
