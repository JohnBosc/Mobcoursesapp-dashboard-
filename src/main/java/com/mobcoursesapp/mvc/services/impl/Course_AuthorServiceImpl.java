package com.mobcoursesapp.mvc.services.impl;

import com.mobcoursesapp.mvc.dao.ICourse_AuthorDao;
import com.mobcoursesapp.mvc.entities.CourseAuthor;
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
    public CourseAuthor save(CourseAuthor entity) {
        return dao.save(entity);
    }

    @Override
    public CourseAuthor update(CourseAuthor entity) {
        return dao.update(entity);
    }

    @Override
    public List<CourseAuthor> selectAll() {
        return dao.selectAll();
    }

    @Override
    public List<CourseAuthor> selectAll(String sortField, String sort) {
        return dao.selectAll(sortField, sort);
    }

    @Override
    public CourseAuthor getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }

    @Override
    public CourseAuthor findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName, paramValue);
    }

    @Override
    public CourseAuthor findOne(String[] paramNames, Object[] paramValues) {
        return dao.findOne(paramNames, paramValues);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName, paramValue);
    }
}
