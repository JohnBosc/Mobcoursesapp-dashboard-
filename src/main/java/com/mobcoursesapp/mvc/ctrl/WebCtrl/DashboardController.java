package com.mobcoursesapp.mvc.ctrl.WebCtrl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
@RequestMapping(value = "/dashboard")
public class DashboardController {

    @RequestMapping(value = "/")
    public String home(Locale locale, Model model) {

        return "dashboard/dashboard";
    }

    @RequestMapping(value = "/blank")
    public String blank(Locale locale, Model model) {

        return "blank/blank";
    }
}
