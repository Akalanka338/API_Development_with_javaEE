package com.example.servlet_practical.dao.custom;

import lk.ijse.gdse.webposbackend.dao.CrudADO;
import lk.ijse.gdse.webposbackend.entity.Item;

import java.sql.SQLException;


public interface ItemDAO extends CrudADO<Item, String > {

    boolean reduceItemQty(String itemCode, double qty) throws SQLException;
}
