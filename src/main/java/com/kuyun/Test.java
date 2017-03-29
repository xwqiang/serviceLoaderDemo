package com.kuyun;

import java.util.ServiceLoader;

/**
 * Created by xuwuqiang on 2017/3/29.
 */
public class Test {
    public static void main(String[] args) {
        ServiceLoader<IService> serviceLoader  = ServiceLoader.load(IService.class);
        for (IService service : serviceLoader) {
            System.out.println(service.getScheme()+"="+service.sayHello());
        }
    }
}
