package com.mobcoursesapp.mvc.ctrl;


import com.mobcoursesapp.mvc.entities.Course;
import com.mobcoursesapp.mvc.entities.Lesson;
import com.mobcoursesapp.mvc.entities.Title;
import com.mobcoursesapp.mvc.services.ICourseService;
import com.mobcoursesapp.mvc.services.ILessonService;
import com.mobcoursesapp.mvc.services.ITitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/title")
public class TitleController {

//    private static final Logger logger = LoggerFactory.getLogger(CourseController.class);

    @Autowired
    private ITitleService titleService;

    @Autowired
    private ILessonService lessonService;


    @RequestMapping(value = "/")
    public String title(Model model) {

        List<Title> titles = titleService.selectAll();
        if (titles == null) {
            titles = new ArrayList<Title>();
        }

        model.addAttribute("titles", titles);

        return "title/title";
    }


    @GetMapping(value = "/new")
    public String addTitle(Model model) {

        Title title = new Title();

        List<Lesson> lessons = lessonService.selectAll();
        if (lessons == null) {
            lessons = new ArrayList<Lesson>();
        }

        model.addAttribute("title", title);
        model.addAttribute("lessons", lessons);

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
