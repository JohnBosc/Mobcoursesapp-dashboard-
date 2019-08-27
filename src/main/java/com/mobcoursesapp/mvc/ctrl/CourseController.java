package com.mobcoursesapp.mvc.ctrl;


import com.mobcoursesapp.mvc.entities.Course;
import com.mobcoursesapp.mvc.entities.CourseAuthor;
import com.mobcoursesapp.mvc.entities.Lesson;
import com.mobcoursesapp.mvc.entities.Subject;
import com.mobcoursesapp.mvc.services.ICourseService;
import com.mobcoursesapp.mvc.services.ICourse_AuthorService;
import com.mobcoursesapp.mvc.services.ILessonService;
import com.mobcoursesapp.mvc.services.ISubjectService;
import com.mobcoursesapp.mvc.util.FileUploadUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/course")
public class CourseController {

    private static final Logger logger = LoggerFactory.getLogger(CourseController.class);

    @Autowired
    private ICourseService courseService;

    @Autowired
    private ISubjectService subjectService;

    @Autowired
    private ICourse_AuthorService course_authorService;

    @Autowired
    private ILessonService lessonService;



    @RequestMapping(value = "/")
    public String course(Model model) {

        List<Course> courses = courseService.selectAll();
        if (courses == null) {
            courses = new ArrayList<Course>();
        }

        model.addAttribute("courses", courses);

        return "courses/course";
    }


    @GetMapping(value = "/new")
    public String addCourse(Model model) {

        Course course = new Course();

        List<Subject> subjects = subjectService.selectAll();
        if (subjects == null) {
            subjects = new ArrayList<Subject>();
        }

        List<CourseAuthor> courseAuthors = course_authorService.selectAll();
        if (courseAuthors == null) {
            courseAuthors = new ArrayList<CourseAuthor>();
        }

        model.addAttribute("course", course);
        model.addAttribute("subjects", subjects);
        model.addAttribute("courseAuthors", courseAuthors);

        return "courses/addCourse";
    }


    @PostMapping(value = "/save")
    public String saveCourse(Model model, @ModelAttribute("course") Course course, HttpServletRequest request) {


        if (course != null) {

            if (!course.getPhoto().equals("")) {
                FileUploadUtility.uploadFile(request, course.getPhoto(), course.getCourseTitle());
            }

            if (course.getCourseID() != null) {

                courseService.update(course);

            } else {
                courseService.save(course);
            }


        }

        return "redirect:/course/";
    }



    @RequestMapping(value = "/update/{courseID}")
    public String updateCourse(Model model, @PathVariable Long courseID) {

        Course course = new Course();

        List<Subject> subjects = subjectService.selectAll();
        if (subjects == null) {
            subjects = new ArrayList<Subject>();
        }

        List<CourseAuthor> courseAuthors = course_authorService.selectAll();
        if (courseAuthors == null) {
            courseAuthors = new ArrayList<CourseAuthor>();
        }

        model.addAttribute("course", course);
        model.addAttribute("subjects", subjects);
        model.addAttribute("courseAuthors", courseAuthors);

        if (courseID != null) {

            course = courseService.getById(courseID);

            if (course != null) {
                model.addAttribute("course", course);
            }

        }
        return "courses/addCourse";
    }



    @RequestMapping(value = "/remove/{courseID}")
    public String removeCourse(Model model, @PathVariable Long courseID) {

        if (courseID != null) {
            Course course = courseService.getById(courseID);
            if (course != null) {
                // TODO relations of the element in the database before deletion
                courseService.remove(courseID);
            }
        }
        return "redirect:/courses/";
    }


}
