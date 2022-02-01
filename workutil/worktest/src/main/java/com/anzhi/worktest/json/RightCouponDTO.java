package com.anzhi.worktest.json;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName: RightCouponDTO
 * @Author: jiaoxian
 * @Date: 2021/12/19 17:05
 * @Description: 权益优惠券 DTO
 */
@Data
public class RightCouponDTO implements Serializable {

    private static final long serialVersionUID = 1347065657997204253L;

    /**
     * 渠道产品Code
     */
    private String channelCode;
    /**
     * 渠道产品领取ID
     */
    private Long receivedId;
    /**
     * 剩余可用券数量(总数量)
     */
    private Integer surplus;

    /**
     * 最晚过期时间（截止时间）
     */
    private Long longestExpireTime;

    /**
     * 激活码/兑换码
     */
    // private String redeemCode;

}
