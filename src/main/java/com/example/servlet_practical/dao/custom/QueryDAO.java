package com.example.servlet_practical.dao.custom;

import lk.ijse.gdse.webposbackend.dao.SuperDAO;
import lk.ijse.gdse.webposbackend.dto.RecentOrderDetailsDTO;

import java.sql.SQLException;
import java.util.List;

public interface QueryDAO extends SuperDAO {

    List<RecentOrderDetailsDTO> getAll() throws SQLException;
}
