package com.pisarevdmitrii.medicineclinicapp.core.service;

import java.util.List;

public interface CrudService<T> {

    T findById(Long id);

    List<T> findAll();

    T save(T entity);

    T removeById(Long id);

}