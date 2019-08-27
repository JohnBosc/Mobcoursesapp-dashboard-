package com.mobcoursesapp.mvc.services;


import com.mobcoursesapp.mvc.entities.Title;

import java.util.List;

public interface ITitleService {

    public Title save(Title entity);

    public Title update(Title entity);

    public List<Title> selectAll();

    public List<Title> selectAll(String sortField, String sort);

    public Title getById(Long id);

    public void remove(Long id);

    public Title findOne(String paramName, Object paramValue);

    public Title findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);
}
