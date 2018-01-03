package com.kole.repository;

import com.kole.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;



/**
 * Created by Ldlood on 2017/8/10.
 */
public interface SellerInfoRepository extends JpaRepository<SellerInfo, String> {
    SellerInfo findByOpenid(String openid);
}

