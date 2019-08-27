package com.mobcoursesapp.mvc.ctrl;


import com.mobcoursesapp.mvc.dao.ILessonDao;
import com.mobcoursesapp.mvc.entities.Course;
import com.mobcoursesapp.mvc.entities.Lesson;
import com.mobcoursesapp.mvc.services.ICourseService;
import com.mobcoursesapp.mvc.services.ILessonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.applet.Applet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/lesson")
public class LessonController {

    private static final Logger logger = LoggerFactory.getLogger(CourseController.class);

    @Autowired
    private ILessonService lessonService;


    @Autowired
    private ICourseService courseService;


    @RequestMapping(value = "/{courseID}")
    public String lesson(Model model, @PathVariable("courseID") Long courseID) {

//        Optional<Lesson> lessons = lessonService.getLessonById(courseID);
        List<Lesson> lessons = lessonService.selectAll();
        if (lessons == null) {
            lessons = new ArrayList<Lesson>();
        }


        model.addAttribute("lessons", lessons);


        return "lesson/lesson";
    }


    @GetMapping(value = "/new")
    public String addLesson(Model model) {

        Lesson lesson = new Lesson();

        List<Course> courses = courseService.selectAll();
        if (courses == null) {
            courses = new ArrayList<Course>();
        }

        model.addAttribute("lesson", lesson);
        model.addAttribute("courses", courses);

        return "lesson/addLesson";
    }


    @PostMapping(value = "/save")
    public String saveCourse(Model model, Lesson lesson) {

        if (lesson != null) {

            if (lesson.getLessonID() != null) {

                lessonService.update(lesson);

            } else {
                lessonService.save(lesson);
            }

        }

        return "redirect:/lesson/";
    }
//
//    private String extractFileName(Part part) {
//        String contentDisp = part.getHeader("content-disposition");
//        String[] items = contentDisp.split(";");
//        for (String s : items) {
//            if (s.trim().startsWith("filename")){
//                return s.substring(s.indexOf("=") + 2, s.length() - 1);
//            }
//        }
//        return "";
//    }
//
    @RequestMapping(value = "/update/{lessonID}")
    public String updateLesson(Model model, @PathVariable Long lessonID) {

        if (lessonID != null) {

            Lesson lesson = lessonService.getById(lessonID);

            if (lesson != null) {
                model.addAttribute("lesson", lesson);
            }

        }
        return "lesson/addLesson";
    }

    @RequestMapping(value = "/remove/{lessonID}")
    public String removeLesson(Model model, @PathVariable Long lessonID) {

        if (lessonID != null){
            Lesson lesson = lessonService.getById(lessonID);
            if (lesson != null){
                // TODO relations of the element in the database before deletion
                courseService.remove(lessonID);
            }
        }
        return "redirect:/lesson/";
    }


}
