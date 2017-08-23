package com.imloves.repository;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by wujianchuan
 * 2017/8/23 16:35
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SysUserRepositoryTest {

    @Autowired
    SysUserRepository sysUserRepository;

    @Test
    public void findByOpenId() throws Exception {

        log.info(sysUserRepository.findByOpenId("123456789").getUsername());
    }

    @Test
    public void findByPhone() throws Exception {

        log.info(sysUserRepository.findByPhone("18231926271").getUsername());
    }
}