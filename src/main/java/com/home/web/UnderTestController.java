package com.home.web;

import com.home.service.DependencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liyang on 12/31/19.
 * liyang70@meituan.com;
 */
@Controller
@RequestMapping("/under/")
public class UnderTestController {

    @Autowired
    private DependencyService dependencyService;

    @RequestMapping("pre")
    public String pre() {
        dependencyService.show();
        return "jsp1";
    }
}
