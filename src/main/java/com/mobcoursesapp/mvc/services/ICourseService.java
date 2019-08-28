package com.mobcoursesapp.mvc.services;


import com.mobcoursesapp.mvc.entities.Course;
import com.mobcoursesapp.mvc.entities.Lesson;

import java.util.List;

public interface ICourseService {

    public Course save(Course entity);

    public Course update(Course entity);

    public List<Course> selectAll();

    public List<Course> selectAll(String sortField, String sort);

    public Course getById(Long id);

    public void remove(Long id);

    public Course findOne(String paramName, Object paramValue);

    public Course findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);


}
