package com.home.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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

    @RequestMapping("json")
    public String coushu(String jsonStr) {
        log.info(jsonStr);
        return jsonStr;
    }

    @RequestMapping("api/{function}")
    public String fromOutToKelin(@PathVariable("function") String function, @RequestParam Map<String,String> params){
        return function + "  "+params.get("id");
    }

}
