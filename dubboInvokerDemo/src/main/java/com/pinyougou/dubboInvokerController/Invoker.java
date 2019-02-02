package com.pinyougou.dubboInvokerController;

import com.alibaba.dubbo.config.annotation.Reference;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.pinyougou.dubboProviderService.Provider;

@Controller
@RequestMapping("/name")
public class Invoker {
    @Reference
    private Provider provider;
    @RequestMapping("/showName")
    @ResponseBody
    private String getName(){
        return provider.showName();
    }
}
