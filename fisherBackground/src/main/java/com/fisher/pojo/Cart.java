package com.fisher.pojo;

import java.util.List;
/**
 * 购物车实体类
 * @author fuwenjun01
 *
 */
public class Cart {
    //购物车id
    private Integer cartId;
    //当前购物车对应的用户id
    private Integer userId;
    //购物车中的详细信息
    private List <CartMessage> cartMessage;

    public List<CartMessage> getCartMessage() {
        return cartMessage;
    }

    public void setCartMessage(List<CartMessage> cartMessage) {
        this.cartMessage = cartMessage;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}