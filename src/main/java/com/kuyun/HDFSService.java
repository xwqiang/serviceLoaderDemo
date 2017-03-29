package com.kuyun;

import com.google.auto.service.AutoService;
import javax.annotation.processing.Processor;

/**
 * Created by xuwuqiang on 2017/3/29.
 */
@AutoService(IService.class)
public class HDFSService implements IService {
    @Override
    public String sayHello() {
        return "Hello HDFSService";
    }
    @Override
    public String getScheme() {
        return "hdfs";
    }
}
