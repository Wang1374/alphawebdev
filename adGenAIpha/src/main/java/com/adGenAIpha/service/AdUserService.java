package com.adGenAIpha.service;

import com.adGenAIpha.base.AdUser;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

@Service
public interface AdUserService extends IService<AdUser> {
    boolean save(AdUser adUser);
}
