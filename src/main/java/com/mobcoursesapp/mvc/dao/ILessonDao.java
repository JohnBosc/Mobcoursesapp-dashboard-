package com.mobcoursesapp.mvc.dao;

import com.mobcoursesapp.mvc.entities.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILessonDao extends IGenericDao<Lesson>
//        , JpaRepository<Lesson, Long>
{
}
