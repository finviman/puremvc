package com.home.service;

import org.springframework.stereotype.Service;

/**
 * Created by liyang on 12/31/19.
 * liyang70@meituan.com;
 */
@Service
public class DependencyService {

    public int show() {
        System.out.println("show");
        return 0;
    }
}
