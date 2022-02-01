package com.anzhi.worktest.json;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName: RightActivateResult
 * @Author: jiaoxian
 * @Date: 2021/12/19 17:56
 * @Description: 权益激活返回 DTO
 */
@Data
public class RightActivateResult implements Serializable {

    private static final long serialVersionUID = -2979037572673117735L;

    /**
     * 渠道产品code
     */
    private String channelCode;

    /**
     * 权益优惠券激活信息
     */
    private RightCouponDTO rightCouponActivateInfo;

    /**
     * 权益卡激活信息
     */
    private RightCardDTO receivedRightDTO;

    /**
     * 兑换码/激活码
     */
    private String redeemCode;


    /**
     * 兑换码的关联id
     */
    private Integer receiveId;

}
