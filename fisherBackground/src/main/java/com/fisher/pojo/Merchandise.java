package com.fisher.pojo;

import java.util.List;

public class Merchandise {
    private Integer merchandiseId;

    private String merchandiseName;

    private Double merchandisePrice;

    private String merchandiseAttribute;

    private String merchandisePricescope;

    private Integer merchandiseInventory;
    //用户评价,后面有service中注入该值
    private List<Comment> comment;
    //商品描述,后面service注入该值
    private Describe describe;
    //商品对应图片信息,由service注入
    private Image image;
    
    public List<Comment> getComment() {
        return comment;
    }

    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }

    public Describe getDescribe() {
        return describe;
    }

    public void setDescribe(Describe describe) {
        this.describe = describe;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Integer getMerchandiseId() {
        return merchandiseId;
    }

    public void setMerchandiseId(Integer merchandiseId) {
        this.merchandiseId = merchandiseId;
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