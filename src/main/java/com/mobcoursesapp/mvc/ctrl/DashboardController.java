package com.mobcoursesapp.mvc.ctrl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
@RequestMapping(value = "/dashboard")
public class DashboardController {

    private static final Logger logger = LoggerFactory.getLogger(DashboardController.class);

//    @RequestMapping(value = "/")
//    public String home () {
//        return "home/home";
//    }

    @RequestMapping(value = "/")
    public String home(Locale locale, Model model) {

        return "dashboard/dashboard";
    }
}
