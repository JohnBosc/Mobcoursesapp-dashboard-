package com.mobcoursesapp.mvc.services;


import com.mobcoursesapp.mvc.entities.CourseAuthor;

import java.util.List;

public interface ICourse_AuthorService {

    public CourseAuthor save(CourseAuthor entity);

    public CourseAuthor update(CourseAuthor entity);

    public List<CourseAuthor> selectAll();

    public List<CourseAuthor> selectAll(String sortField, String sort);

    public CourseAuthor getById(Long id);

    public void remove(Long id);

    public CourseAuthor findOne(String paramName, Object paramValue);

    public CourseAuthor findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);
}
