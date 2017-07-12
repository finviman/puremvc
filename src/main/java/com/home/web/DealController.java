package com.home.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * Created by liyang on 10/7/2017.
 * liyang27@le.com;
 * only in letv.
 */
@Slf4j
@RestController
@RequestMapping("/h/")
public class DealController {

    @RequestMapping(name="a-path-v", value = "a/{v}",method = RequestMethod.GET)
    public String map(@PathVariable int v,String parm) {
        log.info("-------------------"+v);
        return "h/a";
    }

    @RequestMapping(name="b-v",value = "b",method = RequestMethod.GET)
    public String noPathV(int v) {
        log.info("-------------------"+v);
        return "h/b-noPath";
    }

    @RequestMapping(name="b-wildcard", value = "b/*",method = RequestMethod.GET)
    public String extendb() {
        return "h/b-extend";
    }

    @RequestMapping(name="b-path-v",value = "b/{v}",method = RequestMethod.GET)
    public String coushu(@PathVariable int v) {
        log.info("-------------------"+v);

        return "h/b"+v;
    }

}
