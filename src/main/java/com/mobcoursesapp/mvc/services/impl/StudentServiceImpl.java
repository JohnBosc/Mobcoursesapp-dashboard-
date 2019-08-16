package com.mobcoursesapp.mvc.services.impl;


import com.mobcoursesapp.mvc.dao.IStudentDao;
import com.mobcoursesapp.mvc.entities.Student;
import com.mobcoursesapp.mvc.services.IStudentService;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class StudentServiceImpl implements IStudentService {


    private IStudentDao dao;

    public void setDao(IStudentDao dao) {
        this.dao = dao;
    }

    @Override
    public Student save(Student entity) {
        return dao.save(entity);
    }

    @Override
    public Student update(Student entity) {
        return dao.update(entity);
    }

    @Override
    public List<Student> selectAll() {
        return dao.selectAll();
    }

    @Override
    public List<Student> selectAll(String sortField, String sort) {
        return dao.selectAll(sortField, sort);
    }

    @Override
    public Student getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }

    @Override
    public Student findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName, paramValue);
    }

    @Override
    public Student findOne(String[] paramNames, Object[] paramValues) {
        return dao.findOne(paramNames, paramValues);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName, paramValue);
    }
}
