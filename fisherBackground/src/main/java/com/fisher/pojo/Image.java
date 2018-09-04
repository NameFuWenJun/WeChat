package com.fisher.pojo;

import java.util.List;

/**
 * 图片信息类
 * @author fuwenjun01
 *
 */
public class Image {
    private Integer imageId;
    //商品主图显示路径,多图使用-隔开
    private String imagePath;
    //图片名称
    private String imageName;
    //对应详细图片的路径,后面service中注入    
    private List<Path> paths; 
    public List<Path> getPaths() {
        return paths;
    }

    public void setPaths(List<Path> paths) {
        this.paths = paths;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath == null ? null : imagePath.trim();
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName == null ? null : imageName.trim();
    }
}