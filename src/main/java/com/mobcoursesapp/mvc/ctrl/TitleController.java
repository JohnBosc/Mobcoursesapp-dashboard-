package com.mobcoursesapp.mvc.ctrl;


import com.mobcoursesapp.mvc.entities.Course;
import com.mobcoursesapp.mvc.entities.Lesson;
import com.mobcoursesapp.mvc.entities.Title;
import com.mobcoursesapp.mvc.services.ICourseService;
import com.mobcoursesapp.mvc.services.ILessonService;
import com.mobcoursesapp.mvc.services.ITitleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/title")
public class TitleController {

    private static final Logger logger = LoggerFactory.getLogger(TitleController.class);

    @Autowired
    private ITitleService titleService;

    @Autowired
    private ILessonService lessonService;

    @PersistenceContext
    EntityManager em;

    public static Long lessonIdentity;


    @RequestMapping(value = "/{lessonID}")
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

        return "title/title";
    }


    @GetMapping(value = "/new")
    public String addTitle(Model model) {

        Title title = new Title();

        model.addAttribute("title", title);
        System.out.println(lessonIdentity); // For debug purpose

        model.addAttribute("lessonIdentity", lessonIdentity);

        return "title/addTitle";
    }

    @PostMapping(value = "/save")
    public String saveCourse(Model model, Title title) {

        if (title != null) {

            if (title.getTitleID() != null) {

                titleService.update(title);

            } else {
                titleService.save(title);
            }

        }

        return "redirect:/lesson/" + lessonIdentity;
    }


    @RequestMapping(value = "/update/{titleID}")
    public String updateLesson(Model model, @PathVariable Long titleID) {

        if (titleID != null) {

            Title title = titleService.getById(titleID);

            if (title!= null) {
                model.addAttribute("title", title);
            }

        }
        return "title/addTitle";
    }




//
//    @PostMapping(value = "/save", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
//    public String saveCourse(Model model, Course course, MultipartFile file, HttpServletRequest request) {
//
//        String photoUrl = null;
//
//        if (course != null){
//
//            if (file != null && !file.isEmpty()){
//                Part part = null;
////                InputStream stream = null;
//                    try {
//
//                        try {
//                            part = request.getPart("file");
//                        } catch (ServletException e) {
//                            e.printStackTrace();
//                        }
//                        String fileName = extractFileName(part);
//                        photoUrl = "request.getContextPath()/resources/thumbnails" + File.separator + fileName;
//                        File fileSaveDir = new File(photoUrl);
//                        part.write(photoUrl + File.separator);
//
////                        stream = file.getInputStream();
////                        photoUrl = "request.getContextPath()/resources/thumbnails";
//
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//
//            }
//
//            if(course.getCourseID() != null) {
//
//                courseService.update(course);
//
//            } else {
//                course.setPhoto(photoUrl);
//                courseService.save(course);
//            }
//
//        }
//
//        return "redirect:/course/";
//    }
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
//    @RequestMapping(value = "/update/{courseID}")
//    public String updateCourse(Model model, @PathVariable Long courseID) {
//
//        if (courseID != null) {
//
//            Course course = courseService.getById(courseID);
//
//            if (course != null) {
//                model.addAttribute("course", course);
//            }
//
//        }
//        return "courses/addCourse";
//    }
//
//    @RequestMapping(value = "/remove/{courseID}")
//    public String removeCourse(Model model, @PathVariable Long courseID) {
//
//        if (courseID != null){
//            Course course = courseService.getById(courseID);
//            if (course != null){
//                // TODO relations of the element in the database before deletion
//                courseService.remove(courseID);
//            }
//        }
//        return "redirect:/courses/";
//    }




}
