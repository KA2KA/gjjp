package com.invo.system.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author QIEGAO
 * @date 2018/1/20
 */
@Controller
public class LoginController {
    @RequestMapping("/")
    public String index() {
        return "/index1";
    }


}
