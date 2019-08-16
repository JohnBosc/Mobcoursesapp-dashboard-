package com.mobcoursesapp.mvc.services.impl;



import com.mobcoursesapp.mvc.dao.ICourseDao;
import com.mobcoursesapp.mvc.entities.Course;
import com.mobcoursesapp.mvc.services.ICourseService;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class CourseServiceImpl implements ICourseService {


    private ICourseDao dao;

    public void setDao(ICourseDao dao) {
        this.dao = dao;
    }

    @Override
    public Course save(Course entity) {
        return dao.save(entity);
    }

    @Override
    public Course update(Course entity) {
        return dao.update(entity);
    }

    @Override
    public List<Course> selectAll() {
        return dao.selectAll();
    }

    @Override
    public List<Course> selectAll(String sortField, String sort) {
        return dao.selectAll(sortField, sort);
    }

    @Override
    public Course getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }

    @Override
    public Course findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName, paramValue);
    }

    @Override
    public Course findOne(String[] paramNames, Object[] paramValues) {
        return dao.findOne(paramNames, paramValues);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName, paramValue);
    }
}
