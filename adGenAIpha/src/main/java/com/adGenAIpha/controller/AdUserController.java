package com.adGenAIpha.controller;

import com.adGenAIpha.base.AdUser;
import com.adGenAIpha.service.AdUserService;
import com.adGenAIpha.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adUser")
public class AdUserController {
    @Autowired(required=true)
    private AdUserService adUserService;

    @PostMapping
    public R<Boolean> save(@RequestBody AdUser adUser){
        return R.success("Operation completed",adUserService.save(adUser));
    }
}
