package com.example.layeredarchitecture.DAO.Custom;

import com.example.layeredarchitecture.model.AddtblDto;
import com.example.layeredarchitecture.model.SearchDto;

import java.sql.SQLException;
import java.util.ArrayList;

public interface QueryDAO {
    ArrayList<SearchDto> search(String id) throws SQLException, ClassNotFoundException;

    ArrayList<AddtblDto> addtbl(String id) throws SQLException, ClassNotFoundException;
}
