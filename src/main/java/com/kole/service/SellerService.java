package com.kole.service;

import com.kole.dataobject.SellerInfo;

/**
 * Created by Ldlood on 2017/8/10.
 */
public interface SellerService {

    /**
     * 通过openid查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
