package com.mobcoursesapp.mvc.services;


import com.mobcoursesapp.mvc.entities.Subject;

import java.util.List;

public interface ISubjectService {

    public Subject save(Subject entity);

    public Subject update(Subject entity);

    public List<Subject> selectAll();

    public List<Subject> selectAll(String sortField, String sort);

    public Subject getById(Long id);

    public void remove(Long id);

    public Subject findOne(String paramName, Object paramValue);

    public Subject findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);
}
