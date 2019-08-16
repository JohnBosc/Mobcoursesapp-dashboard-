package com.mobcoursesapp.mvc.services.impl;


import com.mobcoursesapp.mvc.dao.ISubjectDao;
import com.mobcoursesapp.mvc.entities.Subject;
import com.mobcoursesapp.mvc.services.ISubjectService;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class SubjectServiceImpl implements ISubjectService {


    private ISubjectDao dao;

    public void setDao(ISubjectDao dao) {
        this.dao = dao;
    }

    @Override
    public Subject save(Subject entity) {
        return dao.save(entity);
    }

    @Override
    public Subject update(Subject entity) {
        return dao.update(entity);
    }

    @Override
    public List<Subject> selectAll() {
        return dao.selectAll();
    }

    @Override
    public List<Subject> selectAll(String sortField, String sort) {
        return dao.selectAll(sortField, sort);
    }

    @Override
    public Subject getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }

    @Override
    public Subject findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName, paramValue);
    }

    @Override
    public Subject findOne(String[] paramNames, Object[] paramValues) {
        return dao.findOne(paramNames, paramValues);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName, paramValue);
    }
}
