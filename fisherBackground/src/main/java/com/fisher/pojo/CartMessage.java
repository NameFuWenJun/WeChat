package com.fisher.pojo;
/**
 * 购物车中详细信息
 * @author fuwenjun01
 *
 */
public class CartMessage {
    //购物车对应的商品id
    private Integer merchandiseId;
    //对应购物车id
    private Integer cartId;
    //当前商品的数量
    private Integer merchandiseNums;
    //加入购物车时间
    private String puttime;

    public Integer getMerchandiseId() {
        return merchandiseId;
    }

    public void setMerchandiseId(Integer merchandiseId) {
        this.merchandiseId = merchandiseId;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getMerchandiseNums() {
        return merchandiseNums;
    }

    public void setMerchandiseNums(Integer merchandiseNums) {
        this.merchandiseNums = merchandiseNums;
    }

    public String getPuttime() {
        return puttime;
    }

    public void setPuttime(String puttime) {
        this.puttime = puttime == null ? null : puttime.trim();
    }
}