package com.mobcoursesapp.mvc.services.impl;

import com.mobcoursesapp.mvc.dao.ICourse_AuthorDao;
import com.mobcoursesapp.mvc.entities.Course_Author;
import com.mobcoursesapp.mvc.services.ICourse_AuthorService;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class Course_AuthorServiceImpl implements ICourse_AuthorService {


    private ICourse_AuthorDao dao;

    public void setDao(ICourse_AuthorDao dao) {
        this.dao = dao;
    }

    @Override
    public Course_Author save(Course_Author entity) {
        return dao.save(entity);
    }

    @Override
    public Course_Author update(Course_Author entity) {
        return dao.update(entity);
    }

    @Override
    public List<Course_Author> selectAll() {
        return dao.selectAll();
    }

    @Override
    public List<Course_Author> selectAll(String sortField, String sort) {
        return dao.selectAll(sortField, sort);
    }

    @Override
    public Course_Author getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }

    @Override
    public Course_Author findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName, paramValue);
    }

    @Override
    public Course_Author findOne(String[] paramNames, Object[] paramValues) {
        return dao.findOne(paramNames, paramValues);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName, paramValue);
    }
}
