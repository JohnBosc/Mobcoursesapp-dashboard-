package com.mobcoursesapp.mvc.services;


import com.mobcoursesapp.mvc.entities.Lesson;

import java.util.List;
import java.util.Optional;

public interface ILessonService {

    public Lesson save(Lesson entity);

    public Lesson update(Lesson entity);

    public List<Lesson> selectAll();

    public List<Lesson> selectAll(String sortField, String sort);

    public Lesson getById(Long id);

    public void remove(Long id);

    public Lesson findOne(String paramName, Object paramValue);

    public Lesson findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);

}
