package com.mobcoursesapp.mvc.ctrl.ApiCtrl;


import com.mobcoursesapp.mvc.entities.Title;
import com.mobcoursesapp.mvc.services.ILessonService;
import com.mobcoursesapp.mvc.services.ITitleService;
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
//@RequestMapping(value = "/title")
public class APITitleController {

    private static final Logger logger = LoggerFactory.getLogger(APITitleController.class);

    @Autowired
    private ITitleService titleService;

    @Autowired
    private ILessonService lessonService;

    @PersistenceContext
    EntityManager em;

    public static Long lessonIdentity;


    @RequestMapping(value = "/titles/{lessonID}")
    public String title(Model model, @PathVariable Long lessonID) {

        Query query = em.createQuery("select t" + " from Title t " + "where t.lesson.lessonID=:lessonID", Title.class);
        query.setParameter("lessonID", lessonID);
        List titles = query.getResultList();
        if (titles == null) {
            titles = new ArrayList<Title>();
        }

        model.addAttribute("titles", titles);

        lessonIdentity = lessonID;

        System.out.println(lessonIdentity);  // For debug purpose

        return "All Titles";
    }

//
//    @GetMapping(value = "/new")
//    public String addTitle(Model model) {
//
//        Title title = new Title();
//
//        model.addAttribute("title", title);
//        System.out.println(lessonIdentity); // For debug purpose
//
//        model.addAttribute("lessonIdentity", lessonIdentity);
//
//        return "title/addTitle";
//    }
//
//    @PostMapping(value = "/save")
//    public String saveCourse(Model model, Title title) {
//
//        if (title != null) {
//
//            if (title.getTitleID() != null) {
//
//                titleService.update(title);
//
//            } else {
//                titleService.save(title);
//            }
//
//        }
//
//        return "redirect:/lesson/" + lessonIdentity;
//    }
//
//
//    @RequestMapping(value = "/update/{titleID}")
//    public String updateLesson(Model model, @PathVariable Long titleID) {
//
//        if (titleID != null) {
//
//            Title title = titleService.getById(titleID);
//
//            if (title!= null) {
//                model.addAttribute("title", title);
//            }
//
//        }
//        return "title/addTitle";
//    }

}
