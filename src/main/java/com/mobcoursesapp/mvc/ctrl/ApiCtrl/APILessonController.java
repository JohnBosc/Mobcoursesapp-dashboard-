package com.mobcoursesapp.mvc.ctrl.ApiCtrl;


import com.mobcoursesapp.mvc.entities.Lesson;
import com.mobcoursesapp.mvc.services.ICourseService;
import com.mobcoursesapp.mvc.services.ILessonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@RestController
//@RequestMapping(value = "/lesson")
public class APILessonController {

    private static final Logger logger = LoggerFactory.getLogger(APILessonController.class);

    @Autowired
    private ILessonService lessonService;


    @Autowired
    private ICourseService courseService;

    @PersistenceContext
    EntityManager em;

    public static Long courseIdentity;


    @RequestMapping(value = "/lessons/{courseID}")
    public String lesson(Model model, @PathVariable Long courseID) {


        Query query = em.createQuery("select l" + " from Lesson l " + "where l.course.courseID=:courseID", Lesson.class);
        query.setParameter("courseID", courseID);
//        query.setParameter("lessonTitle", lessonTitle);
//        query.setParameter("lessonID", lessonID);
        List lessons = query.getResultList();
        if (lessons == null) {
            lessons = new ArrayList<Lesson>();
        }

        model.addAttribute("lessons", lessons);

        courseIdentity = courseID;

        System.out.println(courseIdentity); // For debug purpose

        return "All Lesson";
    }

//
//    @GetMapping(value = "/new")
//    public String addLesson(Model model) {
//
//        Lesson lesson = new Lesson();
//
//
//        model.addAttribute("lesson", lesson);
//
//        System.out.println(courseIdentity);
//
//        model.addAttribute("courseIdentity", courseIdentity);
//
//        return "lesson/addLesson";
//    }
//
//
//    @PostMapping(value = "/save")
//    public String saveCourse(Model model, Lesson lesson) {
//
//        if (lesson != null) {
//
//            if (lesson.getLessonID() != null) {
//
//                lessonService.update(lesson);
//
//            } else {
//                lessonService.save(lesson);
//            }
//
//        }
//
//        return "redirect:/lesson/" + courseIdentity;
//    }
//
//    @RequestMapping(value = "/update/{lessonID}")
//    public String updateLesson(Model model, @PathVariable Long lessonID) {
//
//        if (lessonID != null) {
//
//            Lesson lesson = lessonService.getById(lessonID);
//
//            if (lesson != null) {
//                model.addAttribute("lesson", lesson);
//            }
//
//        }
//        return "lesson/addLesson";
//    }

    @RequestMapping(value = "/lessons/remove/{lessonID}")
    public String removeLesson(Model model, @PathVariable Long lessonID) {

        if (lessonID != null){
            Lesson lesson = lessonService.getById(lessonID);
            if (lesson != null){
                // TODO relations of the element in the database before deletion
                courseService.remove(lessonID);
            }
        }
        return "All lessons of " + courseIdentity;
    }


}
