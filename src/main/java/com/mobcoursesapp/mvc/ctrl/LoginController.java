package com.mobcoursesapp.mvc.ctrl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
@RequestMapping(value = "/")
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "/")
    public String home () {
        return "login/login";
    }

//    @RequestMapping(value = "/blank")
//    public String home(Locale locale, Model model) {
//
//        return "blank/blank";
//    }
}
