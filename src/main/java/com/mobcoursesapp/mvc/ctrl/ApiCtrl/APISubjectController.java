package com.mobcoursesapp.mvc.ctrl.ApiCtrl;


import com.mobcoursesapp.mvc.entities.Subject;
import com.mobcoursesapp.mvc.services.ISubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
//@RequestMapping(value = "/subject")
public class APISubjectController {

//    private static final Logger logger = LoggerFactory.getLogger(CourseController.class);

    @Autowired
    private ISubjectService subjectService;


    @RequestMapping(value = "/subjects")
    public List<Subject> subject(Model model) {

        List<Subject> subjects = subjectService.selectAll();
        if (subjects == null) {
            subjects = new ArrayList<Subject>();
        }

        model.addAttribute("subjects", subjects);

        return subjects;
    }

//
//    @GetMapping(value = "/new")
//    public String addCourse(Model model) {
//
//        Course course = new Course();
//        model.addAttribute("course", course);
//
//        return "courses/addCourse";
//    }
//
//
//    @PostMapping(value = "/save")
//    public String saveCourse(Model model, Course course, MultipartFile file, HttpServletRequest request) throws ServletException {
//
//        String photoUrl = null;
//
//        if (course != null){
////            if(file != null && !file.isEmpty()){
////                InputStream stream =null;
////            }
//
//            if (file != null && !file.isEmpty()){
//
//                    try {
//                        Part part = request.getPart("file");
//                        String fileName = extracFileName(part);
//                        photoUrl = "request.getContextPath()/resources/thumbnails" + File.separator + fileName;
//                        File fileSaveDir = new File(photoUrl);
//                        part.write(photoUrl + File.separator);
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
//                courseService.save(course);
//            }
//
//        }
//
//        return "redirect:/course/";
//    }
//
//    private String extracFileName(Part part) {
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
