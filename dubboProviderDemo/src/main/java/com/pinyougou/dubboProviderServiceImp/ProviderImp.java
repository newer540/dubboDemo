package com.pinyougou.dubboProviderServiceImp;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.dubboProviderService.Provider;

@Service
public class ProviderImp implements Provider {
    @Override
    public String showName() {
        return "itheima";
    }
}
