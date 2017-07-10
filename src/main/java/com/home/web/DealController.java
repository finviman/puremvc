package com.home.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping("a/{v}")
    public String map(@PathVariable int v) {
        log.info("-------------------"+v);
        return "h/a";
    }
}
