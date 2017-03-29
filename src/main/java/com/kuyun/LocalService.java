package com.kuyun;

import com.google.auto.service.AutoService;

/**
 * Created by xuwuqiang on 2017/3/29.
 */
@AutoService(IService.class)
public class LocalService  implements IService {
    @Override
    public String sayHello() {
        return "Hello LocalService";
    }
    @Override
    public String getScheme() {
        return "local";
    }
}
