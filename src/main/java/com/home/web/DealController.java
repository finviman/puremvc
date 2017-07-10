package com.home.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liyang on 10/7/2017.
 * liyang27@le.com;
 * only in letv.
 */
@Slf4j
@RestController
@RequestMapping("/h/")
public class DealController {

    @RequestMapping("a")
    public String map() {
        log.info("-------------------");
        return "h/a";
    }
}
