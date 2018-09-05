package com.fisher.pojo;

import java.util.List;

/**
 * 商品信息类
 * @author fuwenjun01
 *
 */
public class Merchandise {
    private Integer merchandiseId;
    //商品的图片信息,后面再service中设置image信息
    private Image image;
    private Integer imageId;

    private Integer describeId;
    //商品的描述信息,通过service中设置注入
    private Describe describe;
    
    private Integer commentId;
    //用户评价信息
    private List<Comment> comments;
    private String merchandiseName;

    private Double merchandisePrice;

    private String merchandiseAttribute;

    private String merchandisePricescope;

    private Integer merchandiseInventory;

    
    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Describe getDescribe() {
        return describe;
    }

    public void setDescribe(Describe describe) {
        this.describe = describe;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Integer getMerchandiseId() {
        return merchandiseId;
    }

    public void setMerchandiseId(Integer merchandiseId) {
        this.merchandiseId = merchandiseId;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public Integer getDescribeId() {
        return describeId;
    }

    public void setDescribeId(Integer describeId) {
        this.describeId = describeId;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getMerchandiseName() {
        return merchandiseName;
    }

    public void setMerchandiseName(String merchandiseName) {
        this.merchandiseName = merchandiseName == null ? null : merchandiseName.trim();
    }

    public Double getMerchandisePrice() {
        return merchandisePrice;
    }

    public void setMerchandisePrice(Double merchandisePrice) {
        this.merchandisePrice = merchandisePrice;
    }

    public String getMerchandiseAttribute() {
        return merchandiseAttribute;
    }

    public void setMerchandiseAttribute(String merchandiseAttribute) {
        this.merchandiseAttribute = merchandiseAttribute == null ? null : merchandiseAttribute.trim();
    }

    public String getMerchandisePricescope() {
        return merchandisePricescope;
    }

    public void setMerchandisePricescope(String merchandisePricescope) {
        this.merchandisePricescope = merchandisePricescope == null ? null : merchandisePricescope.trim();
    }

    public Integer getMerchandiseInventory() {
        return merchandiseInventory;
    }

    public void setMerchandiseInventory(Integer merchandiseInventory) {
        this.merchandiseInventory = merchandiseInventory;
    }
}