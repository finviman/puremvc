package com.home.web;

import com.sun.javafx.sg.prism.NGShape;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liyang on 10/7/2017.
 * liyang27@le.com;
 * only in letv.
 */
@Slf4j
@RestController
@RequestMapping("h")
public class ViewController {

    @RequestMapping("slash")
    public String coushu() {
        return "no slash in url";
    }
}
