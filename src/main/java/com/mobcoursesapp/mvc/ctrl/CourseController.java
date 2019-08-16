package com.mobcoursesapp.mvc.ctrl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
@RequestMapping(value = "/dashboard")
public class CourseController {

    private static final Logger logger = LoggerFactory.getLogger(CourseController.class);

//    @RequestMapping(value = "/")
//    public String home () {
//        return "home/home";
//    }

    @RequestMapping(value = "/courses")
    public String home(Locale locale, Model model) {

        return "courses/courses";
    }
}
