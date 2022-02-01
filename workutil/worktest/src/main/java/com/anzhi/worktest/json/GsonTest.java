package com.anzhi.worktest.json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class GsonTest {
    public static void main(String[] args) {
        String param = "{\"code\":0,\"data\":{\"receivedRightDTO\":{\"channelCode\":\"062\",\"channelId\":313,\"channelName\":\"禾沐-医诊无忧月卡\",\"longestExpireTime\":1648828799000,\"patientLimited\":0,\"receiveId\":754,\"rightList\":[{\"buttonStatus\":1,\"buttonStatusStr\":\"去问诊\",\"coverPicture\":\"https://upload.ybm100.com/ybm/ykg_tuangou/product/cbc42f0b-6a1a-41df-9878-06ba8127f5da.PNG\",\"endTime\":1648828799000,\"isShowDiagnoseWin\":0,\"name\":\"禾沐-医诊无忧月卡\",\"page\":1,\"rightDetailList\":[{\"discount\":\"(折扣50%)\",\"leftAmount\":0,\"monthLeftNum\":\"不限\",\"rightType\":2,\"rightTypeStr\":\"问诊权益\",\"totalLeftNum\":\"不限\",\"usableMoney\":0}],\"rightExplain\":\"荷叶会员专享权益，点击【去使用】可直接享受权益，最终优惠以提交订单时为主。\",\"rightId\":683,\"userRightId\":3252}],\"topPicture\":\"https://upload.ybm100.com/G4/M00/9B/A0/CiIC2mFBlEqAINEjAAGLL_vT4mE404.png\"}},\"failed\":false,\"msg\":\"请求已经成功处理\",\"succeeded\":true}";

        Gson gson = new Gson();
        // Gson 使用 TypeToken 解决范型擦除问题
        ResponseResult<RightActivateResult> resultResponseResult = gson.fromJson(param, new TypeToken<ResponseResult<RightActivateResult>>(){}.getType());
        System.out.println(resultResponseResult);
        RightActivateResult data = resultResponseResult.getData();
        System.out.println(data);
    }

}
