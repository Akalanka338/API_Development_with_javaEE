package com.example.servlet_practical.dao;

import lk.ijse.gdse.webposbackend.entity.SuperEntity;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

public interface CrudADO <T extends SuperEntity, ID extends Serializable> extends SuperDAO {

    List<T> getAll() throws SQLException;

    T save( T entity) throws SQLException;

    T update(T entity) throws SQLException;

    void delete(ID pk) throws SQLException;
}
