package com.mobcoursesapp.mvc.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

public class FileUploadUtility {

    private static final String ABS_PATH = "/home/jb/Documents/Mobcoursesapp/src/main/webapp/resources/thumbnails/";
    private static String REAL_PATH = "";


    private static final Logger logger = LoggerFactory.getLogger(FileUploadUtility.class);
    public static void uploadFile(HttpServletRequest request, MultipartFile photo, String courseTitle) {

        // get the real path
        REAL_PATH = request.getSession().getServletContext().getRealPath("/resources/thumbnails/");
        logger.info(REAL_PATH);

        // to make sure all the directories exists
        // please create the directories

        if (!new File(ABS_PATH).exists()){
            //create the directories
            new File(ABS_PATH).mkdirs();
        }

        if (!new File(REAL_PATH).exists()){
            //create the directories
            new File(REAL_PATH).mkdirs();
        }

        try{
            // server upload
            photo.transferTo( new File(REAL_PATH + courseTitle + ".jpg"));
            // project directory upload
            photo.transferTo(new File(ABS_PATH + courseTitle + ".jpg"));

        }catch (IOException e){

        }



    }
}
