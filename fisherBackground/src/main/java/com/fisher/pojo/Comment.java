package com.fisher.pojo;
/**
 * 用户评价实体类
 * @author fuwenjun01
 *
 */
public class Comment {
    
    private Integer commentId;
    //对应商品id
    private Integer merchandiseId;
    //对应用户id
    private Integer userId;
    //评价级别:好评或者差评,考虑是否使用枚举类
    private String commentLevel;
    
    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getMerchandiseId() {
        return merchandiseId;
    }

    public void setMerchandiseId(Integer merchandiseId) {
        this.merchandiseId = merchandiseId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCommentLevel() {
        return commentLevel;
    }

    public void setCommentLevel(String commentLevel) {
        this.commentLevel = commentLevel == null ? null : commentLevel.trim();
    }
}