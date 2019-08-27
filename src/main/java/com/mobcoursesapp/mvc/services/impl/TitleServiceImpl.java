package com.mobcoursesapp.mvc.services.impl;



import com.mobcoursesapp.mvc.dao.ITitleDao;
import com.mobcoursesapp.mvc.entities.Title;
import com.mobcoursesapp.mvc.services.ITitleService;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class TitleServiceImpl implements ITitleService {


    private ITitleDao dao;

    public void setDao(ITitleDao dao) {
        this.dao = dao;
    }

    @Override
    public Title save(Title entity) {
        return dao.save(entity);
    }

    @Override
    public Title update(Title entity) {
        return dao.update(entity);
    }

    @Override
    public List<Title> selectAll() {
        return dao.selectAll();
    }

    @Override
    public List<Title> selectAll(String sortField, String sort) {
        return dao.selectAll(sortField, sort);
    }

    @Override
    public Title getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }

    @Override
    public Title findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName, paramValue);
    }

    @Override
    public Title findOne(String[] paramNames, Object[] paramValues) {
        return dao.findOne(paramNames, paramValues);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName, paramValue);
    }
}
