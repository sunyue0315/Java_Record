package com.anzhi.worktest.json;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName: RightCouponDTO
 * @Author: jiaoxian
 * @Date: 2021/12/19 17:05
 * @Description: 权益卡 DTO
 */
@Data
public class RightCardDTO implements Serializable {

    private static final long serialVersionUID = 7524910830760226003L;

    /**
     * 渠道产品Code
     */
    private String channelCode;

    /**
     * 渠道产品领取ID
     */
    private Long receiveId;

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
    private String redeemCode;

    /**
     * 渠道名称
     */
    private String channelName;

    /**
     * 权益列表
     */
    private List<Right> rightList;

    @Data
    public static class Right implements Serializable{

        private static final long serialVersionUID = 982053666298869046L;

        /**
         * 权益名称
         */
        private String name;

        /**
         * 权益 id
         */
        private Long rightId;

        /**
         * 权益卡详情列表
         */
        private List<RightDetail> rightDetailList;

    }

    @Data
    public static class RightDetail implements Serializable {

        private static final long serialVersionUID = 6907704987116799956L;

        /**
         * 权益类型
         */
        private Integer rightType;

        /**
         * 权益类型
         */
        private String rightTypeStr;

        /**
         * 权益折扣
         */
        private String discount;

        /**
         * 当月剩余数量
         */
        private String monthLeftNum;

        /**
         * 至有效期剩余数量
         */
        private String totalLeftNum;

        /**
         * 有效期
         */
        private Long expireTime;

        /**
         * 剩余金额
         */
        private long leftAmount;

        /**
         * 当前可使用的金额
         */
        private long usableMoney;
    }

}
