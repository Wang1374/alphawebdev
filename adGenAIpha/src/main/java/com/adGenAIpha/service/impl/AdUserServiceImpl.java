package com.adGenAIpha.service.impl;

import com.adGenAIpha.base.AdUser;
import com.adGenAIpha.mapper.AdUserMapper;
import com.adGenAIpha.service.AdUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AdUserServiceImpl extends ServiceImpl<AdUserMapper, AdUser> implements AdUserService {
    @Override
    public boolean save(AdUser adUser) {
        adUser.setId(UUID.randomUUID().toString().replace("-",""));
        return super.save(adUser);
    }
}
