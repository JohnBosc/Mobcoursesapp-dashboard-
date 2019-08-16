package com.mobcoursesapp.mvc.services;


import com.mobcoursesapp.mvc.entities.Student;

import java.util.List;

public interface IStudentService {

    public Student save(Student entity);

    public Student update(Student entity);

    public List<Student> selectAll();

    public List<Student> selectAll(String sortField, String sort);

    public Student getById(Long id);

    public void remove(Long id);

    public Student findOne(String paramName, Object paramValue);

    public Student findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);
}
