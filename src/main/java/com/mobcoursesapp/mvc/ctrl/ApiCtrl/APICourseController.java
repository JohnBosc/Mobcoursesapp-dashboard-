package com.mobcoursesapp.mvc.ctrl.ApiCtrl;


import com.google.gson.JsonParser;
import com.mobcoursesapp.mvc.entities.Course;
import com.mobcoursesapp.mvc.services.ICourseService;
import com.mobcoursesapp.mvc.services.ICourse_AuthorService;
import com.mobcoursesapp.mvc.services.ISubjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.springframework.data.repository.init.ResourceReader.Type.JSON;


@RestController
//@RequestMapping(value = "/course")
public class APICourseController {

    private static final Logger logger = LoggerFactory.getLogger(APICourseController.class);

    @Autowired
    private ICourseService courseService;


    @GetMapping(value = "/courses", produces = "application/json")
    public List<Course> course() {

        //        model.addAttribute("courses", courses);

        return courseService.selectAll();
    }



}
