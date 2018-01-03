package com.kole.service.impl;

import com.kole.dataobject.SellerInfo;
import com.kole.repository.SellerInfoRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Ldlood on 2017/8/13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SellerServiceImplTest {

    @Autowired
    private SellerInfoRepository sellerInfoRepository;


    @Test
    public void findSellerInfoByOpenid() throws Exception {
        SellerInfo sellerInfo = sellerInfoRepository.findByOpenid("aaaaa");
        log.info(sellerInfo.getUsername());
    }

}