package com.fisher.pojo;
/**
 * 商品描述
 * @author fuwenjun01
 *
 */
public class Describe {
    private Integer describeId;
    //商品描述具体信息
    private String describeText;

    public Integer getDescribeId() {
        return describeId;
    }

    public void setDescribeId(Integer describeId) {
        this.describeId = describeId;
    }

    public String getDescribeText() {
        return describeText;
    }

    public void setDescribeText(String describeText) {
        this.describeText = describeText == null ? null : describeText.trim();
    }
}