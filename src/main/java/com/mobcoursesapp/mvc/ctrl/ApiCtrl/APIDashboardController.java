package com.mobcoursesapp.mvc.ctrl.ApiCtrl;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
//@RequestMapping(value = "/dashboard")
public class APIDashboardController {

    @RequestMapping(value = "/dash")
    public String home(Locale locale, Model model) {

        return "dashboard/dashboard";
    }

    @RequestMapping(value = "/blank")
    public String blank(Locale locale, Model model) {

        return "blank/blank";
    }
}
