package com.mobcoursesapp.mvc.services;


import com.mobcoursesapp.mvc.entities.Course_Author;

import java.util.List;

public interface ICourse_AuthorService {

    public Course_Author save(Course_Author entity);

    public Course_Author update(Course_Author entity);

    public List<Course_Author> selectAll();

    public List<Course_Author> selectAll(String sortField, String sort);

    public Course_Author getById(Long id);

    public void remove(Long id);

    public Course_Author findOne(String paramName, Object paramValue);

    public Course_Author findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);
}
