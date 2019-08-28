package com.mobcoursesapp.mvc.services.impl;



import com.mobcoursesapp.mvc.dao.ILessonDao;
import com.mobcoursesapp.mvc.entities.Lesson;
import com.mobcoursesapp.mvc.services.ILessonService;
import org.apache.velocity.exception.ResourceNotFoundException;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
public class LessonServiceImpl implements ILessonService {


    private ILessonDao dao;

    public void setDao(ILessonDao dao) {
        this.dao = dao;
    }

    @Override
    public Lesson save(Lesson entity) {
        return dao.save(entity);
    }

    @Override
    public Lesson update(Lesson entity) {
        return dao.update(entity);
    }

    @Override
    public List<Lesson> selectAll() {
        return dao.selectAll();
    }

    @Override
    public List<Lesson> selectAll(String sortField, String sort) {
        return dao.selectAll(sortField, sort);
    }

    @Override
    public Lesson getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }

    @Override
    public Lesson findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName, paramValue);
    }

    @Override
    public Lesson findOne(String[] paramNames, Object[] paramValues) {
        return dao.findOne(paramNames, paramValues);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName, paramValue);
    }


}
